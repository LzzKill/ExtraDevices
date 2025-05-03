package com.lzzkill.extradevices.registry;

import com.lzzkill.extradevices.ExtraDevices;
import com.lzzkill.extradevices.blocks.CompressedBlock;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;

public class Blocks
{
    public static final DeferredRegister<Block> BLOCK_DEFERRED_REGISTER = DeferredRegister.create(ExtraDevices.MOD_ID, Registry.BLOCK_REGISTRY);

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