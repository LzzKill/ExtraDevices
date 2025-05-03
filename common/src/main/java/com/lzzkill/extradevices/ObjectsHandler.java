package com.lzzkill.extradevices;

import com.lzzkill.extradevices.blocks.CompressedBlock;
import com.lzzkill.extradevices.blocks.CompressedBlockItem;
import com.lzzkill.extradevices.items.DivisionSigil;
import com.lzzkill.extradevices.items.UnstableIngot;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

public class ObjectsHandler
{
    public static final DeferredRegister<Item> ITEM_DEFERRED_REGISTER = DeferredRegister.create(ExtraDevices.MOD_ID, Registry.ITEM_REGISTRY);
    public static final DeferredRegister<Block> BLOCK_DEFERRED_REGISTER = DeferredRegister.create(ExtraDevices.MOD_ID, Registry.BLOCK_REGISTRY);

    public static class Items
    {
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

    public static class Blocks
    {
        public static final RegistrySupplier<Block> COMPRESSED_COBBLESTONE_FIRST = BLOCK_DEFERRED_REGISTER.register("compressed_cobblestone_first", () -> new CompressedBlock(net.minecraft.world.level.block.Blocks.COBBLESTONE, 1));
        public static final RegistrySupplier<Block> COMPRESSED_COBBLESTONE_DOUBLE = BLOCK_DEFERRED_REGISTER.register("compressed_cobblestone_double", () -> new CompressedBlock(net.minecraft.world.level.block.Blocks.COBBLESTONE, 2));
        public static final RegistrySupplier<Block> COMPRESSED_COBBLESTONE_TRIPLE = BLOCK_DEFERRED_REGISTER.register("compressed_cobblestone_triple", () -> new CompressedBlock(net.minecraft.world.level.block.Blocks.COBBLESTONE, 3));
        public static final RegistrySupplier<Block> COMPRESSED_COBBLESTONE_QUADRUPLE = BLOCK_DEFERRED_REGISTER.register("compressed_cobblestone_quadruple", () -> new CompressedBlock(net.minecraft.world.level.block.Blocks.COBBLESTONE, 4));
        public static final RegistrySupplier<Block> COMPRESSED_COBBLESTONE_QUINTUPLE = BLOCK_DEFERRED_REGISTER.register("compressed_cobblestone_quintuple", () -> new CompressedBlock(net.minecraft.world.level.block.Blocks.COBBLESTONE, 5));
        public static final RegistrySupplier<Block> COMPRESSED_COBBLESTONE_SEXTUPLE = BLOCK_DEFERRED_REGISTER.register("compressed_cobblestone_sextuple", () -> new CompressedBlock(net.minecraft.world.level.block.Blocks.COBBLESTONE, 6));
        public static final RegistrySupplier<Block> COMPRESSED_COBBLESTONE_SEPTUPLE = BLOCK_DEFERRED_REGISTER.register("compressed_cobblestone_septuple", () -> new CompressedBlock(net.minecraft.world.level.block.Blocks.COBBLESTONE, 7));
        public static final RegistrySupplier<Block> COMPRESSED_COBBLESTONE_OCTUPLE = BLOCK_DEFERRED_REGISTER.register("compressed_cobblestone_octuple", () -> new CompressedBlock(net.minecraft.world.level.block.Blocks.COBBLESTONE, 8));
        public static final RegistrySupplier<Block> COMPRESSED_COBBLESTONE_NONUPLE = BLOCK_DEFERRED_REGISTER.register("compressed_cobblestone_nonuple", () -> new CompressedBlock(net.minecraft.world.level.block.Blocks.COBBLESTONE, 9));
    }


    public static final CreativeModeTab EXTRA_DEVICES_TAB = CreativeTabRegistry.create(
            new ResourceLocation(ExtraDevices.MOD_ID, "extra_devices_tab"),
            () -> new ItemStack(Items.DIVISION_SIGIL.get())
    );

}
