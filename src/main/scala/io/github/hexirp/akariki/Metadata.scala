package io.github.hexirp.akariki

import net.minecraft.util.ResourceLocation

import org.apache.logging.log4j.{LogManager, Logger}

/** [[Metadata]] は akariki に関するデータ群である。
  *
  * @param id      The MOD's ID
  * @param name    The MOD's name
  * @param version The MOD's version
  */
class Metadata(val id : String, val name : String, val version : String) {
  def newLogger : Logger = LogManager.getFormatterLogger(id)

  def newResourceLocation(resourceName : String) : ResourceLocation = new ResourceLocation(id, resourceName)
}
