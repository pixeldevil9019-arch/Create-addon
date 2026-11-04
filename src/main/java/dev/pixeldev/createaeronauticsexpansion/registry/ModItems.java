package dev.pixeldevil.createaeronauticsexpansion.registry;

import dev.pixeldevil.createaeronauticsexpansion.CreateAeronauticsExpansion;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(CreateAeronauticsExpansion.MOD_ID);

    public static final DeferredItem<BlockItem> AIRCRAFT_CONTROL_CONSOLE =
            ITEMS.registerSimpleBlockItem("aircraft_control_console",
                    ModBlocks.AIRCRAFT_CONTROL_CONSOLE);

    public static final DeferredItem<Item> ENGINE_GOVERNOR =
            ITEMS.registerSimpleItem("engine_governor", new Item.Properties().stacksTo(16));

    public static final DeferredItem<Item> PROPELLER_HUB =
            ITEMS.registerSimpleItem("propeller_hub", new Item.Properties().stacksTo(16));

    private ModItems() {}

    public static void register(net.neoforged.bus.api.IEventBus modBus) {
        ITEMS.register(modBus);
    }
}
