package io.github.hexirp.akariki;

import net.minecraft.util.ResourceLocation;

/**
 * {@link Metadata} is data of akariki.
 */
public class Metadata {
    public String MOD_ID() {
        return Boot.MOD_ID;
    }

    public ResourceLocation resourceLocation(String name) {
        return new ResourceLocation(MOD_ID(), name);
    }
}
