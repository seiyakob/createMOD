package com.Seiya.SeiyaMod.registry;


import com.Seiya.SeiyaMod.main.SeiyaMod;              // タブ定義の参照用
import com.Seiya.SeiyaMod.item.ItemSeiyaIngod;       // 自作アイテムのクラス
import net.minecraft.world.item.Item;                // Minecraft の Item クラス
import net.minecraftforge.registries.ObjectHolder;     // @ObjectHolder
import net.minecraftforge.event.RegistryEvent;        // RegistryEvent.Register
import net.minecraftforge.eventbus.api.SubscribeEvent;// @SubscribeEvent
import net.minecraftforge.fml.common.Mod;    

@ObjectHolder(SeiyaMod.MOD_ID)
public class SeiyaModItems{

    public static final ItemSeiyaIngod SEIYA_INGOD = new ItemSeiyaIngod();

    @Mod.EventBusSubscriber(modid = SeiyaMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Register{
        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event){

            final Item[] items = {
                SEIYA_INGOD
            };
            event.getRegistry().registerAll(items);
        }
    }
}
