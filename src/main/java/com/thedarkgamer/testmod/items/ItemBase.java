package com.thedarkgamer.testmod.items;

import com.thedarkgamer.testmod.TestMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(TestMod.TAB));
    }
}
