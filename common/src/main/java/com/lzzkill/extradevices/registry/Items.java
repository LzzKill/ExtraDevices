package com.lzzkill.extradevices.registry;

import com.lzzkill.extradevices.ExtraDevices;
import com.lzzkill.extradevices.blocks.CompressedBlockItem;
import com.lzzkill.extradevices.items.DivisionSigil;
import com.lzzkill.extradevices.items.UnstableIngot;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class Items
{
    public static final DeferredRegister<Item> ITEM_DEFERRED_REGISTER = DeferredRegister.create(ExtraDevices.MOD_ID, Registry.ITEM_REGISTRY);

    public static final RegistrySupplier<Item> DIVISION_SIGIL = ITEM_DEFERRED_REGISTER.register("division_sigil", DivisionSigil::new);
    public static final RegistrySupplier<Item> UNSTABLE_INGOT = ITEM_DEFERRED_REGISTER.register("unstable_ingot", UnstableIngot.Unstable::new);
    public static final RegistrySupplier<Item> STABLE_INGOT = ITEM_DEFERRED_REGISTER.register("stable_ingot", UnstableIngot.Stable::new);

    public static final RegistrySupplier<BlockItem> COMPRESSED_COBBLESTONE_FIRST = ITEM_DEFERRED_REGISTER.register("compressed_cobblestone_first", () -> new CompressedBlockItem(Blocks.COMPRESSED_COBBLESTONE_FIRST.get(), 1));
    public static final RegistrySupplier<BlockItem> COMPRESSED_COBBLESTONE_DOUBLE = ITEM_DEFERRED_REGISTER.register("compressed_cobblestone_double", () -> new CompressedBlockItem(Blocks.COMPRESSED_COBBLESTONE_DOUBLE.get(), 2));
    public static final RegistrySupplier<BlockItem> COMPRESSED_COBBLESTONE_TRIPLE = ITEM_DEFERRED_REGISTER.register("compressed_cobblestone_triple", () -> new CompressedBlockItem(Blocks.COMPRESSED_COBBLESTONE_TRIPLE.get(), 3));
    public static final RegistrySupplier<BlockItem> COMPRESSED_COBBLESTONE_QUADRUPLE = ITEM_DEFERRED_REGISTER.register("compressed_cobblestone_quadruple", () -> new CompressedBlockItem(Blocks.COMPRESSED_COBBLESTONE_QUADRUPLE.get(), 4));
    public static final RegistrySupplier<BlockItem> COMPRESSED_COBBLESTONE_QUINTUPLE = ITEM_DEFERRED_REGISTER.register("compressed_cobblestone_quintuple", () -> new CompressedBlockItem(Blocks.COMPRESSED_COBBLESTONE_QUINTUPLE.get(), 5));
    public static final RegistrySupplier<BlockItem> COMPRESSED_COBBLESTONE_SEXTUPLE = ITEM_DEFERRED_REGISTER.register("compressed_cobblestone_sextuple", () -> new CompressedBlockItem(Blocks.COMPRESSED_COBBLESTONE_SEXTUPLE.get(), 6));
    public static final RegistrySupplier<BlockItem> COMPRESSED_COBBLESTONE_SEPTUPLE = ITEM_DEFERRED_REGISTER.register("compressed_cobblestone_septuple", () -> new CompressedBlockItem(Blocks.COMPRESSED_COBBLESTONE_SEPTUPLE.get(), 7));
    public static final RegistrySupplier<BlockItem> COMPRESSED_COBBLESTONE_OCTUPLE = ITEM_DEFERRED_REGISTER.register("compressed_cobblestone_octuple", () -> new CompressedBlockItem(Blocks.COMPRESSED_COBBLESTONE_OCTUPLE.get(), 8));
    public static final RegistrySupplier<BlockItem> COMPRESSED_COBBLESTONE_NONUPLE = ITEM_DEFERRED_REGISTER.register("compressed_cobblestone_nonuple", () -> new CompressedBlockItem(Blocks.COMPRESSED_COBBLESTONE_NONUPLE.get(), 9));

}