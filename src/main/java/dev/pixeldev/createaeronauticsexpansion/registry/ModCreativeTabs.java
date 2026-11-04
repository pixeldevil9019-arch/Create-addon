package dev.pixeldevil.createaeronauticsexpansion.registry;

import dev.pixeldevil.createaeronauticsexpansion.CreateAeronauticsExpansion;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModCreativeTabs {
    private static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateAeronauticsExpansion.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MAIN =
            TABS.register("main", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.create_aeronautics_expansion"))
                    .withTabsBefore(CreativeModeTabs.TOOLS_AND_UTILITIES)
                    .icon(() -> ModItems.AIRCRAFT_CONTROL_CONSOLE.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.AIRCRAFT_CONTROL_CONSOLE.get());
                        output.accept(ModItems.ENGINE_GOVERNOR.get());
                        output.accept(ModItems.PROPELLER_HUB.get());
                    }).build());

    private ModCreativeTabs() {}

    public static void register(net.neoforged.bus.api.IEventBus modBus) {
        TABS.register(modBus);
    }
}
