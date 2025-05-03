package com.lzzkill.extradevices.blocks;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static com.lzzkill.extradevices.ObjectsHandler.EXTRA_DEVICES_TAB;

public class CompressedBlockItem extends BlockItem
{

    private final int level;
    
    public CompressedBlockItem(Block block, int level)
    {
        super(block, new Item.Properties().tab(EXTRA_DEVICES_TAB));
        this.level = level;
    }
    
    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> list, TooltipFlag tooltipFlag)
    {
        CompoundTag tag = itemStack.hasTag() ? itemStack.getTag() : new CompoundTag();
        assert tag != null;
        list.add(new TranslatableComponent("tooltip.compressed_block", String.valueOf(this.level)));
    }
    
}
