package dev.pixeldev.createaeronauticsexpansion.registry;

import dev.pixeldev.createaeronauticsexpansion.CreateAeronauticsExpansion;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(CreateAeronauticsExpansion.MOD_ID);

    public static final DeferredBlock<Block> AIRCRAFT_CONTROL_CONSOLE =
            BLOCKS.registerSimpleBlock("aircraft_control_console",
                    BlockBehaviour.Properties.of().mapColor(MapColor.METAL)
                            .strength(3.5F, 6.0F).requiresCorrectToolForDrops());

    private ModBlocks() {}

    public static void register(net.neoforged.bus.api.IEventBus modBus) {
        BLOCKS.register(modBus);
    }
}
