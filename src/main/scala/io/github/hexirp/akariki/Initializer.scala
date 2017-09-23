package io.github.hexirp.akariki

import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}
import org.apache.logging.log4j.Logger

class Initializer(log : Logger) {
  def preInit(event : FMLPreInitializationEvent, items : ItemList) : Unit = {
    log.info("preInit")
    if (event.getSide.isClient) {
      import net.minecraft.client.renderer.block.model.ModelResourceLocation
      import net.minecraftforge.client.model.ModelLoader
      ModelLoader.setCustomModelResourceLocation(items.sample, 0, new ModelResourceLocation(items.sample.getRegistryName, "inventory"))
    }
  }

  def init(event : FMLInitializationEvent) : Unit = log.info("init")

  def postInit(event :FMLPostInitializationEvent) : Unit = log.info("postInit")
}
