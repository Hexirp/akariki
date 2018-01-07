package io.github.hexirp.akariki

import net.minecraft.util.ResourceLocation

import org.apache.logging.log4j.{LogManager, Logger}

/** [[Context]] is data of akariki.
  *
  * @param id The ID of a MOD
  */
class Context(id : String) {
  val log : Logger = LogManager.getFormatterLogger(id)

  def newResourceLocation(name : String) : ResourceLocation = new ResourceLocation(id, name)
}
