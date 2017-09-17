package io.github.hexirp.akariki;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = "akariki", dependencies = "after:forge@[14.22.1.2478,)")
@Mod.EventBusSubscriber
public class Boot {
    public Logger log = LogManager.getFormatterLogger("akariki");

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        log.info("preInit");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        log.info("init");
        Main.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        log.info("postInit");
    }

    @SubscribeEvent
    public void regRecipe(RegistryEvent.Register<IRecipe> e) {
        log.info("regRecipe");
    }
}
