package io.github.hexirp.akariki;

import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.Logger;

public class Subscriber {
    private final Logger log;

    public Subscriber(Logger log) {
        this.log = log;
    }

    public void join() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void regRecipe(RegistryEvent.Register<IRecipe> e) {
        log.info("regRecipe");
    }

    @SubscribeEvent
    public void regItem(RegistryEvent.Register<Item> e) {
        log.info("regItem");
    }

    @SubscribeEvent
    public void regBlock(RegistryEvent.Register<net.minecraft.block.Block> e) {
        log.info("regBlock");
    }
}
