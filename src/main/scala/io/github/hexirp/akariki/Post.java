package io.github.hexirp.akariki;

import net.minecraft.block.Block;
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
    public void regRecipe(RegistryEvent.Register<IRecipe> event) {
        subsc.regRecipe(event);
    }

    @SubscribeEvent
    public void regItem(RegistryEvent.Register<Item> event) {
        subsc.regItem(event);
    }

    @SubscribeEvent
    public void regBlock(RegistryEvent.Register<Block> event) {
        subsc.regBlock(event);
    }
}
