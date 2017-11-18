package io.github.hexirp.akariki

import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraft.item.crafting.IRecipe
import net.minecraftforge.client.event.ModelRegistryEvent
import net.minecraftforge.event.RegistryEvent
import org.apache.logging.log4j.Logger

class Subscriber(log : Logger, items : Items, blocks : Blocks) {
  def regRecipe(event : RegistryEvent.Register[IRecipe]) : Unit = log.info("regRecipe")

  def regItem(event : RegistryEvent.Register[Item]) : Unit = {
    log.info("regItem")
    items.regItem(event)
  }

  def regBlock(event : RegistryEvent.Register[Block]) : Unit = {
    log.info("regBlock")
    blocks.regBlock(event)
  }

  def regModel(event : ModelRegistryEvent) : Unit = {
    log.info("regModel")
    items.regResource()
  }
}
