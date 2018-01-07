package io.github.hexirp.akariki;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * {@link Boot} connects Forge's initialization events to {@link Initializer} and works as a main class of akariki.
 */
@Mod(
        modid = Boot.MOD_ID,
        name = Boot.NAME,
        version = Boot.VERSION,
        dependencies = "required-after:forge@[14.23.1.2555,)",
        acceptedMinecraftVersions = "1.12.2")
public class Boot {
    public static final String MOD_ID = "akariki";
    public static final String NAME = "Akariki";
    public static final String VERSION = "0.1.0-alpha-1";

    private final Context context = new Context(MOD_ID);
    private final Initializer init = new Initializer(context);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        new Post(context).join();
        init.preInit(event, MOD_ID, NAME, VERSION);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        init.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        init.postInit(event);
    }
}
