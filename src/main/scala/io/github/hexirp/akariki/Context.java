package io.github.hexirp.akariki;

import net.minecraft.util.ResourceLocation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * {@link Context} is data of akariki.
 */
public class Context {
    private final String id;
    private final Logger log;

    public Context(String id) {
        this.id = id;
        this.log = LogManager.getFormatterLogger(id);
    }

    public ResourceLocation newResourceLocation(String name) {
        return new ResourceLocation(id, name);
    }

    public void info(String message) {
        log.info(message);
    }
}
