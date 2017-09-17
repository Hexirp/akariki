package io.github.hexirp.akariki;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "akariki", dependencies = "after:forge@[14.22.1.2478,)")
public class Boot {
    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        MinecraftForge.EVENT_BUS.register(new Recipe());

        Main.init(e);
    }
}
