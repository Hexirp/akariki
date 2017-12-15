package io.github.hexirp.akariki

import net.minecraftforge.fml.common.event.{ //
  FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}

import org.apache.logging.log4j.{LogManager, Logger}

/** [[Initializer]] receives Forge's initialization events.
  *
  */
class Initializer {
  val log : Logger = LogManager.getFormatterLogger(Boot.MOD_ID)

  def preInit(event : FMLPreInitializationEvent) : Unit = {
    val blocks = new Blocks()
    val items = new Items(blocks)
    new Post(log, items, blocks).join()
    log.info("preInit")
  }

  def init(event : FMLInitializationEvent) : Unit = log.info("init")

  def postInit(event : FMLPostInitializationEvent) : Unit = log.info("postInit")
}
