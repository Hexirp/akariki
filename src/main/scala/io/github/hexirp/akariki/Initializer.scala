package io.github.hexirp.akariki

import net.minecraftforge.fml.common.event.{ //
  FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}

/** [[Initializer]] receives Forge's initialization events.
  *
  */
class Initializer {
  val metadata : Metadata = new Metadata(Boot.MOD_ID)

  def preInit(event : FMLPreInitializationEvent) : Unit = {
    val blocks = new Blocks()
    val items = new Items(blocks)
    new Post(metadata, items, blocks).join()
    metadata.info("preInit")
  }

  def init(event : FMLInitializationEvent) : Unit = metadata.info("init")

  def postInit(event : FMLPostInitializationEvent) : Unit = metadata.info("postInit")
}
