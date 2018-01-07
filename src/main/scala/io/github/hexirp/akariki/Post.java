package io.github.hexirp.akariki;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import org.apache.logging.log4j.Logger;

/**
 * {@link Post} connects Forge's events to {@link Subscriber}.
 */
public class Post {
    private final Subscriber subs;

    public Post(Metadata metadata, Logger log) {
        this.subs = new Subscriber(metadata, log);
    }

    public void join() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void regRecipes(RegistryEvent.Register<IRecipe> event) {
        subs.regRecipes(event);
    }

    @SubscribeEvent
    public void regItems(RegistryEvent.Register<Item> event) {
        subs.regItems(event);
    }

    @SubscribeEvent
    public void regBlocks(RegistryEvent.Register<Block> event) {
        subs.regBlocks(event);
    }

    @SubscribeEvent
    public void regModels(ModelRegistryEvent event) {
        subs.regModels(event);
    }
}
