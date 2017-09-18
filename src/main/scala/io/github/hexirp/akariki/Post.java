package io.github.hexirp.akariki;

import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.Logger;

public class Post {
    private final Subscriber subsc;

    public Post(Logger log) {
        this.subsc = new Subscriber(log);
    }

    public void join() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void regRecipe(RegistryEvent.Register<IRecipe> e) {
        subsc.regRecipe(e);
    }

    @SubscribeEvent
    public void regItem(RegistryEvent.Register<Item> e) {
        subsc.regItem(e);
    }

    @SubscribeEvent
    public void regBlock(RegistryEvent.Register<net.minecraft.block.Block> e) {
        subsc.regBlock(e);
    }
}
