package com.lzzkill.extradevices.items;

import com.lzzkill.extradevices.ExtraDevices;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class Items
{   
    public static final DeferredRegister<Item> DEFERRED_REGISTER_ITEM = DeferredRegister.create(ExtraDevices.MOD_ID, Registry.ITEM_REGISTRY);
    
    public static final RegistrySupplier<Item> DIVISION_SIGIL = DEFERRED_REGISTER_ITEM.register("division_sigil", DivisionSigil::new);
    
    
    public static final CreativeModeTab EXTRA_DEVICES_TAB = CreativeTabRegistry.create(
            new ResourceLocation(ExtraDevices.MOD_ID, "extra_devices_tab"),
            () -> new ItemStack(net.minecraft.world.item.Items.OBSIDIAN)
    );
    
    public static void register()
    {
        DEFERRED_REGISTER_ITEM.register();
    }
    
}
