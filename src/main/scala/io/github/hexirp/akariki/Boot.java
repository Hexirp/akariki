package io.github.hexirp.akariki;

import net.minecraft.item.ItemStack;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import org.apache.logging.log4j.Logger;

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
    public static final String VERSION = "0.1.0-a-10";

    private final Metadata metadata = new Metadata(MOD_ID, NAME, VERSION);
    private final Logger log = metadata.newLogger();
    private final Post post = new Post(metadata, log);
    private final Initializer init = new Initializer(metadata, log);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        post.join();
        init.preInit(event);
        GameRegistry.addSmelting(
                new ItemStack(post.subs.silver_items().silver_ingot()),
                new ItemStack(post.subs.silver_items().silver_ore()),
                0.8f);
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
