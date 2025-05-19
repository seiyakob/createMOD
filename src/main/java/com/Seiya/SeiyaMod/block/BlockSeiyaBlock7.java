package com.Seiya.SeiyaMod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;

import java.util.HashSet;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Set;

import com.Seiya.SeiyaMod.registry.SeiyaModTool;  // SeiyaToolの参照用

public class BlockSeiyaBlock7 extends Block {
    public BlockSeiyaBlock7() {
        super(Properties.of(Material.SAND)
            .strength(7.0f, 12000F)
            .sound(SoundType.ANVIL)
            .lightLevel(value -> 15)
            .requiresCorrectToolForDrops()
        );
        this.setRegistryName("seiya_block7");
    }

    // プレイヤーが壊す時に連鎖破壊処理を行う (seiya_tool使用時のみ)
    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        if (!level.isClientSide) {
            ItemStack heldItem = player.getMainHandItem();
            if (heldItem.getItem() == SeiyaModTool.SEIYA_TOOL) {
                breakConnectedBlocks(level, pos, state.getBlock());
            }
        }
        super.playerWillDestroy(level, pos, state, player);
    }

    // 周囲の同じブロックを再帰的に壊す処理
    private void breakConnectedBlocks(Level level, BlockPos origin, Block blockType) {
        Set<BlockPos> visited = new HashSet<>();
        Queue<BlockPos> toCheck = new ArrayDeque<>();
        toCheck.add(origin);

        while (!toCheck.isEmpty()) {
            BlockPos current = toCheck.poll();
            if (visited.contains(current)) continue;

            visited.add(current);
            BlockState currentState = level.getBlockState(current);
            if (currentState.getBlock() != blockType) continue;

            level.destroyBlock(current, true); // trueはアイテムドロップを意味する

            for (Direction dir : Direction.values()) { // 上下左右前後すべての方向をチェック
                BlockPos neighbor = current.relative(dir);
                if (!visited.contains(neighbor)) {
                    toCheck.add(neighbor);
                }
            }
        }
    }
}
