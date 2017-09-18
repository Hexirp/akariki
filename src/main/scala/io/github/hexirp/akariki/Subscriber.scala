package io.github.hexirp.akariki

import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraft.item.crafting.IRecipe
import net.minecraftforge.event.RegistryEvent
import org.apache.logging.log4j.Logger

class Subscriber(log : Logger) {
  def regRecipe(e : RegistryEvent.Register[IRecipe]) = log.info("regRecipe")

  def regItem(e : RegistryEvent.Register[Item]) = log.info("regItem")

  def regBlock(e : RegistryEvent.Register[Block]) = log.info("regBlock")
}
