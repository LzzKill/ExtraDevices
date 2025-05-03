package com.lzzkill.extradevices.items;

import com.lzzkill.extradevices.ExtraDevices;
import net.minecraft.world.item.Item;

public class DivisionSigil extends Item
{
    public DivisionSigil()
    {
        super(new Item.Properties().stacksTo(1).fireResistant().tab(ExtraDevices.EXTRA_DEVICES_TAB));
    }
}
