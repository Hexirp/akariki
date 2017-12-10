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
@Mod(modid = Metadata.MOD_ID, version = Metadata.VERSION, dependencies = Metadata.DEPENDS)
public class Boot {
    private final Initializer init = new Initializer();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
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
