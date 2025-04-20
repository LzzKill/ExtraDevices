package com.lzzkill.extradevices.forge;

import com.lzzkill.extradevices.Extradevices;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Extradevices.MOD_ID)
public final class ExtradevicesForge
{
    public ExtradevicesForge()
    {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(Extradevices.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        Extradevices.init();
    }
}
