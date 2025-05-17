package com.Seiya.SeiyaMod.main;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;


public class SeiyaModTab extends CreativeModeTab{
    
    public SeiyaModTab(){

        super("seiyamod_tab");
    }
    @Override
    public ItemStack makeIcon()
    {
        return new ItemStack(Items.DIAMOND);
    }

}
