package com.lzzkill.extradevices;

import com.lzzkill.extradevices.items.UnstableIngot;
import dev.architectury.event.events.client.ClientTooltipEvent;

public final class ExtraDevices
{
    public static final String MOD_ID = "extradevices";

    public static void registerEvent()
    {
        ClientTooltipEvent.ITEM.register(UnstableIngot.Stable::toolTip);
        ClientTooltipEvent.ITEM.register(UnstableIngot.Unstable::toolTip);
    }
    
    
    public static void init()
    {
        ObjectsHandler.ITEM_DEFERRED_REGISTER.register();
        registerEvent();
        // Write common init code here.
    }
}
