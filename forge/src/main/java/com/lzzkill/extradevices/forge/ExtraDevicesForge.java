package com.lzzkill.extradevices.forge;

import com.lzzkill.extradevices.ExtraDevices;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExtraDevices.MOD_ID)
public final class ExtraDevicesForge
{
    public ExtraDevicesForge()
    {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(ExtraDevices.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        ExtraDevices.init();
    }
}
