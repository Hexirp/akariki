package io.github.hexirp.akariki

import net.minecraftforge.fml.common.event.{ //
  FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}

/** [[Initializer]] receives Forge's initialization events.
  *
  * @param context The context of initialization
  */
class Initializer (context : Context) {
  def preInit(event : FMLPreInitializationEvent) : Unit = context.info("preInit")

  def init(event : FMLInitializationEvent) : Unit = context.info("init")

  def postInit(event : FMLPostInitializationEvent) : Unit = context.info("postInit")
}
