package io.github.hexirp.akariki;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = "akariki", dependencies = "after:forge@[14.22.1.2478,)")
@Mod.EventBusSubscriber
public class Boot {
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        System.out.print("preInit");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        System.out.print("init");
        Main.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        System.out.print("postInit");
    }

    @SubscribeEvent
    public void regRecipe(RegistryEvent.Register<IRecipe> e) {
        System.out.print("regRecipe");
    }
}
