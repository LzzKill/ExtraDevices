package com.lzzkill.extradevices.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;

public class CompressedBlock extends Block
{

    public CompressedBlock(Block block, int level)
    {
        super(Properties.of(Material.STONE).strength(2.0F, 9*level*block.getExplosionResistance()));
    }
}
