package com.Seiya.SeiyaMod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.item.BlockItem;
//import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class BlockSeiyaBlock1 extends Block {
    public BlockSeiyaBlock1(){
        super(Properties.of(Material.SAND)
        .strength(7.0f,12000F)
        .sound(SoundType.ANVIL)
        .lightLevel(value -> 15)
        .requiresCorrectToolForDrops()
        );//多分ここに足場的性質を入れる//土の見た目　硬さ7　爆発体制12000　音など金床
        this.setRegistryName("seiya_block1");
    }
}