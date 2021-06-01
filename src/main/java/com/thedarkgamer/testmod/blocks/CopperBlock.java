package com.thedarkgamer.testmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CopperBlock extends Block {
    public CopperBlock() {
        super(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0f, 4.0f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2));
    }
}
