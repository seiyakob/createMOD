package com.Seiya.SeiyaMod.registry;


import com.Seiya.SeiyaMod.main.SeiyaMod; 
import com.Seiya.SeiyaMod.main.SeiyaModTab;              // タブ定義の参照用
//import com.Seiya.SeiyaMod.item.ItemSeiyaIngod;  // 自作アイテムのクラス

////koko zousyoku
import com.Seiya.SeiyaMod.block.BlockSeiyaBlock1;
import com.Seiya.SeiyaMod.block.BlockSeiyaBlock2;
import com.Seiya.SeiyaMod.block.BlockSeiyaBlock3;
import com.Seiya.SeiyaMod.block.BlockSeiyaBlock4;
import com.Seiya.SeiyaMod.block.BlockSeiyaBlock5;
import com.Seiya.SeiyaMod.block.BlockSeiyaBlock6;
import com.Seiya.SeiyaMod.block.BlockSeiyaBlock7;
import com.Seiya.SeiyaMod.block.BlockSeiyaBlock8;
import com.Seiya.SeiyaMod.block.BlockSeiyaBlock9;
import com.Seiya.SeiyaMod.block.BlockSeiyaBlock10;

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


    ////koko
    public static final BlockSeiyaBlock1 SEIYA_BLOCK1 = null; 
    public static final BlockSeiyaBlock2 SEIYA_BLOCK2 = null; 
    public static final BlockSeiyaBlock3 SEIYA_BLOCK3 = null; 
    public static final BlockSeiyaBlock4 SEIYA_BLOCK4 = null; 
    public static final BlockSeiyaBlock5 SEIYA_BLOCK5 = null; 
    public static final BlockSeiyaBlock6 SEIYA_BLOCK6 = null; 
    public static final BlockSeiyaBlock7 SEIYA_BLOCK7 = null; 
    public static final BlockSeiyaBlock8 SEIYA_BLOCK8 = null; 
    public static final BlockSeiyaBlock9 SEIYA_BLOCK9 = null; 
    public static final BlockSeiyaBlock10 SEIYA_BLOCK10 = null; 
    
    @Mod.EventBusSubscriber(modid = SeiyaMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Register{

        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event){
            ///koko
            final Block[] blocks = {
                new BlockSeiyaBlock1(),
                new BlockSeiyaBlock2(),
                new BlockSeiyaBlock3(),
                new BlockSeiyaBlock4(),
                new BlockSeiyaBlock5(),
                new BlockSeiyaBlock6(),
                new BlockSeiyaBlock7(),
                new BlockSeiyaBlock8(),
                new BlockSeiyaBlock9(),
                new BlockSeiyaBlock10()
            };
            event.getRegistry().registerAll(blocks);
        }

        @SubscribeEvent
        public static void registerBlockItems(final RegistryEvent.Register<Item> event){
            ///koko
            final BlockItem[] blockItems = {
                new BlockItem(SEIYA_BLOCK1, new Item.Properties().tab(SeiyaMod.SEIYA_TAB).fireResistant()),
                new BlockItem(SEIYA_BLOCK2, new Item.Properties().tab(SeiyaMod.SEIYA_TAB).fireResistant()),
                new BlockItem(SEIYA_BLOCK3, new Item.Properties().tab(SeiyaMod.SEIYA_TAB).fireResistant()),
                new BlockItem(SEIYA_BLOCK4, new Item.Properties().tab(SeiyaMod.SEIYA_TAB).fireResistant()),
                new BlockItem(SEIYA_BLOCK5, new Item.Properties().tab(SeiyaMod.SEIYA_TAB).fireResistant()),
                new BlockItem(SEIYA_BLOCK6, new Item.Properties().tab(SeiyaMod.SEIYA_TAB).fireResistant()),
                new BlockItem(SEIYA_BLOCK7, new Item.Properties().tab(SeiyaMod.SEIYA_TAB).fireResistant()),
                new BlockItem(SEIYA_BLOCK8, new Item.Properties().tab(SeiyaMod.SEIYA_TAB).fireResistant()),
                new BlockItem(SEIYA_BLOCK9, new Item.Properties().tab(SeiyaMod.SEIYA_TAB).fireResistant()),
                new BlockItem(SEIYA_BLOCK10, new Item.Properties().tab(SeiyaMod.SEIYA_TAB).fireResistant())
            };
            for (BlockItem item : blockItems){
                final Block block = item.getBlock();
                final ResourceLocation registryName = block.getRegistryName();
                event.getRegistry().register(item.setRegistryName(registryName));
            }
        }
    }
}
