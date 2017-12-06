package io.github.hexirp.akariki

import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}

import org.apache.logging.log4j.Logger

class Initializer(log : Logger) {
  def preInit(event : FMLPreInitializationEvent) : Unit = log.info("preInit")

  def init(event : FMLInitializationEvent) : Unit = log.info("init")

  def postInit(event : FMLPostInitializationEvent) : Unit = log.info("postInit")
}
