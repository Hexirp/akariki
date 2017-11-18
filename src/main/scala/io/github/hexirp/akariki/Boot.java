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
    private final Initializer initer = new Initializer(log);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Blocks blocks = new Blocks();
        Items items = new Items(blocks);
        new Post(log, items, blocks).join();
        initer.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        initer.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        initer.postInit(event);
    }
}
