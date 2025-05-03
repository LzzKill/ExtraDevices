package com.lzzkill.extradevices;

import com.lzzkill.extradevices.items.UnstableIngot;
import com.lzzkill.extradevices.registry.Blocks;
import com.lzzkill.extradevices.registry.Items;
import dev.architectury.event.events.client.ClientTooltipEvent;
import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public final class ExtraDevices
{
    public static final String MOD_ID = "extradevices";

    public static final CreativeModeTab EXTRA_DEVICES_TAB = CreativeTabRegistry.create(
            new ResourceLocation(ExtraDevices.MOD_ID, "extra_devices_tab"),
            () -> new ItemStack(net.minecraft.world.item.Items.OBSIDIAN)
    );

    public static void registerEvent()
    {
        ClientTooltipEvent.ITEM.register(UnstableIngot.Stable::toolTip);
        ClientTooltipEvent.ITEM.register(UnstableIngot.Unstable::toolTip);
    }


    public static void init()
    {
        Blocks.BLOCK_DEFERRED_REGISTER.register();
        Items.ITEM_DEFERRED_REGISTER.register();
        registerEvent();
        // Write common init code here.
    }
}
