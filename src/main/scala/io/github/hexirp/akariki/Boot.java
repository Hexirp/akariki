package io.github.hexirp.akariki;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = "akariki", version = "0.0.0", dependencies = "after:forge@[14.22.1.2478,)")
public class Boot {
    private final Logger log = LogManager.getFormatterLogger("akariki");
    private final Initializer proxy = new Initializer(log);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        new Post(log).join();
        proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
