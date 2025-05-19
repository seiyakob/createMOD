package com.Seiya.SeiyaMod.registry;

import com.Seiya.SeiyaMod.main.SeiyaMod; 
import com.Seiya.SeiyaMod.main.SeiyaModTab;              // タブ定義の参照用
import com.Seiya.SeiyaMod.item.ItemSeiyaTool;  // 自作アイテムのクラス

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

import net.minecraft.core.BlockPos;
import net.minecraftforge.registries.IForgeRegistry;

@ObjectHolder(SeiyaMod.MOD_ID)
public class SeiyaModTool {

    public static final ItemSeiyaTool SEIYA_TOOL = new ItemSeiyaTool();


    @Mod.EventBusSubscriber(modid = SeiyaMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Register{
        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event){

            final Item[] tools = {
                SEIYA_TOOL
            };
            event.getRegistry().registerAll(tools);
        }
    }
    // public static class ModEventHandlers {
    //     @SubscribeEvent
    //     public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
    //         IForgeRegistry<Item> registry = event.getRegistry();

    //         // いらなさそうPANEL_STICK = new PanelStickItem(new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_TOOLS));
    //         // MODIDはseiyamodにしそうPANEL_STICK.setRegistryName(new ResourceLocation(MODID, "panel_stick"));
    //         // registry.register(PANEL_STICK);
    //         SEIYA_TOOL.setRegistryName(new ResourceLocation(SeiyaMod.MOD_ID, "seiya_tool")); // 登録名
    //         registry.register(SEIYA_TOOL);
    //     }
    // }
}
