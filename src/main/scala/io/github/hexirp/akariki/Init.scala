package io.github.hexirp.akariki

import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}
import org.apache.logging.log4j.Logger

class Init (log : Logger) {
  def preInit(e : FMLPreInitializationEvent) : Unit = log.info("preInit")
  def init(e : FMLInitializationEvent) : Unit = log.info("init")
  def postInit(e :FMLPostInitializationEvent) : Unit = log.info("postInit")
}
