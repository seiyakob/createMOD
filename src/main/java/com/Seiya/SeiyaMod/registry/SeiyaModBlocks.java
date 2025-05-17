package com.Seiya.SeiyaMod.registry;


import com.Seiya.SeiyaMod.main.SeiyaMod; 
import com.Seiya.SeiyaMod.main.SeiyaModTab;              // タブ定義の参照用
//import com.Seiya.SeiyaMod.item.ItemSeiyaIngod;  // 自作アイテムのクラス
import com.Seiya.SeiyaMod.block.BlockSeiyaBlock1;

import net.minecraft.world.item.Item;                // Minecraft の Item クラス
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;        // RegistryEvent.Register
import net.minecraftforge.eventbus.api.SubscribeEvent;// @SubscribeEvent
import net.minecraftforge.fml.common.Mod; 
import net.minecraftforge.registries.ObjectHolder;// @ObjectHolder

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.item.BlockItem;
//import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;



@ObjectHolder(SeiyaMod.MOD_ID)
public class SeiyaModBlocks {

    public static final BlockSeiyaBlock1 SEIYA_BLOCK1 = null; 
    
    @Mod.EventBusSubscriber(modid = SeiyaMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Register{

        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event){
            final Block[] blocks = {
                new BlockSeiyaBlock1()
            };
            event.getRegistry().registerAll(blocks);
        }

        @SubscribeEvent
        public static void registerBlockItems(final RegistryEvent.Register<Item> event){
            final BlockItem[] blockItems = {
                new BlockItem(SEIYA_BLOCK1, new Item.Properties().tab(SeiyaMod.SEIYA_TAB).fireResistant())
            };
            for (BlockItem item : blockItems){
                final Block block = item.getBlock();
                final ResourceLocation registryName = block.getRegistryName();
                event.getRegistry().register(item.setRegistryName(registryName));
            }
        }
    }
}
