package io.github.hexirp.akariki;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * {@link Boot} connects Forge's initialization events to {@link Initializer} and works as a main class of akariki.
 */
@Mod(modid = Boot.MOD_ID, version = "0.0.0-alpha-1", dependencies = "required-after:forge@[14.23.0.2491,)")
public class Boot {
    public static final String MOD_ID = "akariki";

    private final Metadata metadata = new Metadata(MOD_ID);
    private final Initializer init = new Initializer(metadata);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        new Post(metadata).join();
        init.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        init.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        init.postInit(event);
    }
}
