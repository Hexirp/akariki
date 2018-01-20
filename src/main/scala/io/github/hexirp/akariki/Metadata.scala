package io.github.hexirp.akariki

import net.minecraft.util.ResourceLocation

import net.minecraftforge.fml.common.ModMetadata

import org.apache.logging.log4j.{LogManager, Logger}

/** [[Metadata]] is important data of MOD.
  *
  * @param id      The MOD's ID
  * @param name    The MOD's name
  * @param version The MOD's version
  */
class Metadata(id : String, name : String, version : String) {
  def newLogger : Logger = LogManager.getFormatterLogger(id)

  def newResourceLocation(resourceName : String) : ResourceLocation = new ResourceLocation(id, resourceName)

  def set(metadata : ModMetadata) : Unit = {
    metadata.modId = id
    metadata.name = name
    metadata.version = version
  }
}
