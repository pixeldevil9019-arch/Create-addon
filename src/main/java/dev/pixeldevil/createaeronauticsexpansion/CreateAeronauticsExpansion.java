package dev.pixeldevil.createaeronauticsexpansion;

import com.mojang.logging.LogUtils;
import dev.pixeldevil.createaeronauticsexpansion.registry.ModBlocks;
import dev.pixeldevil.createaeronauticsexpansion.registry.ModCreativeTabs;
import dev.pixeldevil.createaeronauticsexpansion.registry.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

/**
 * Main entry point for Create: Aeronautics Expansion.
 *
 * The first development milestone establishes a clean registry foundation.
 * Aircraft group persistence, engine controllers and propulsion integration
 * are implemented in subsequent modules rather than guessed against unknown APIs.
 */
@Mod(CreateAeronauticsExpansion.MOD_ID)
public final class CreateAeronauticsExpansion {
    public static final String MOD_ID = "create_aeronautics_expansion";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CreateAeronauticsExpansion(IEventBus modBus, ModContainer modContainer) {
        ModBlocks.register(modBus);
        ModItems.register(modBus);
        ModCreativeTabs.register(modBus);
        LOGGER.info("Create: Aeronautics Expansion initialising");
    }
}
