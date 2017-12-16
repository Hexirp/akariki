package io.github.hexirp.akariki

import net.minecraftforge.fml.common.event.{ //
  FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}

/** [[Initializer]] receives Forge's initialization events.
  *
  */
class Initializer (metadata : Metadata) {
  def preInit(event : FMLPreInitializationEvent) : Unit = metadata.info("preInit")

  def init(event : FMLInitializationEvent) : Unit = metadata.info("init")

  def postInit(event : FMLPostInitializationEvent) : Unit = metadata.info("postInit")
}
