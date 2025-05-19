package com.Seiya.SeiyaMod.item;

import net.minecraft.world.item.Item;
import com.Seiya.SeiyaMod.main.SeiyaMod;

public class ItemSeiyaTool extends Item{

        public ItemSeiyaTool(){
            super(new Properties().tab(SeiyaMod.SEIYA_TAB).fireResistant());
            this.setRegistryName("seiya_tool");
        }
}