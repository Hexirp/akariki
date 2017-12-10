package io.github.hexirp.akariki;

import net.minecraft.util.ResourceLocation;

/**
 * {@link Metadata} is data of akariki.
 */
public final class Metadata {
    public static final String MOD_ID = "akariki";

    public static final String VERSION = "0.0.0-alpha-1";

    public static final String DEPENDS = "required-after:forge@[14.23.0.2491,)";

    public static ResourceLocation makeResLoc(String name) {
        return new ResourceLocation(MOD_ID, name);
    }
}
