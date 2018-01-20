package io.github.hexirp.akariki

import net.minecraft.util.ResourceLocation

import net.minecraftforge.fml.common.ModMetadata

import org.apache.logging.log4j.{LogManager, Logger}

/** [[Metadata]] is important data of MOD.
  *
  * @param id
  * @param name
  * @param version
  */
class Metadata(val id : String, val name : String, val version : String) {
  def newLogger : Logger = LogManager.getFormatterLogger(id)

  def newResourceLocation(resourceName : String) : ResourceLocation = new ResourceLocation(id, resourceName)
}
