package com.lzzkill.extradevices.items;

import com.lzzkill.extradevices.Items;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class UnstableIngot extends Item
{
    public UnstableIngot()
    {
        super(new Item.Properties().fireResistant().tab(Items.EXTRA_DEVICES_TAB));
    }


    public static class Unstable extends UnstableIngot
    {
        public static void toolTip(ItemStack itemStack, List<Component> components, TooltipFlag tooltipFlag)
        {
            if (itemStack.getItem() instanceof Unstable) {
                CompoundTag tag = itemStack.hasTag() ? itemStack.getTag() : new CompoundTag();
                assert tag != null;
                components.add(new TranslatableComponent("tooltip.unstable_ingot"));
            }
        }
    }

    public static class Stable extends UnstableIngot
    {
        public static void toolTip(ItemStack itemStack, List<Component> components, TooltipFlag tooltipFlag)
        {
            if (itemStack.getItem() instanceof Stable) {
                CompoundTag tag = itemStack.hasTag() ? itemStack.getTag() : new CompoundTag();
                assert tag != null;
                components.add(new TranslatableComponent("tooltip.unstable_ingot"));
            }
        }

    }


}
