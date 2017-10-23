package io.github.hexirp.akariki;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Metadata.modid, version = Metadata.version, dependencies = Metadata.dependencies)
public class Boot {
    private final Logger log = LogManager.getFormatterLogger(Metadata.modid);
    private final Initializer proxy = new Initializer(log);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Items items = new Items();
        new Post(log, items).join();
        proxy.preInit(event, items);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
