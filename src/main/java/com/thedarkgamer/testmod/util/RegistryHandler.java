package com.thedarkgamer.testmod.util;

import com.thedarkgamer.testmod.TestMod;
import com.thedarkgamer.testmod.blocks.BlockItemBase;
import com.thedarkgamer.testmod.blocks.CopperBlock;
import com.thedarkgamer.testmod.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, TestMod.MODID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, TestMod.MODID);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> COPPERINGOT = ITEMS.register("copper_ingot", ItemBase::new);

    //Blocks
    public static final RegistryObject<Block> COPPERBLOCK = BLOCKS.register("copper_block", CopperBlock::new);

    //Block Items
    public static final RegistryObject<Item> COPPERBLOCKITEM = ITEMS.register("copper_block", () -> new BlockItemBase(COPPERBLOCK.get()));
}
