package io.github.hexirp.akariki;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import org.apache.logging.log4j.Logger;

public class Post {
    private final Subscriber subsc;

    public Post(Logger log, Items items, Blocks blocks) {
        this.subsc = new Subscriber(log, items, blocks);
    }

    public void join() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void regRecipes(RegistryEvent.Register<IRecipe> event) {
        subsc.regRecipes(event);
    }

    @SubscribeEvent
    public void regItems(RegistryEvent.Register<Item> event) {
        subsc.regItems(event);
    }

    @SubscribeEvent
    public void regBlocks(RegistryEvent.Register<Block> event) {
        subsc.regBlocks(event);
    }

    @SubscribeEvent
    public void regModels(ModelRegistryEvent event) {
        subsc.regModels(event);
    }
}
