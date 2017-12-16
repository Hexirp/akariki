package io.github.hexirp.akariki

import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraft.item.crafting.IRecipe

import net.minecraftforge.client.event.ModelRegistryEvent
import net.minecraftforge.event.RegistryEvent

import org.apache.logging.log4j.Logger

/** [[Subscriber]] receives Forge's events.
  *
  * @param metadata
  * @param items
  * @param blocks
  */
class Subscriber(metadata : Metadata, items : Items, blocks : Blocks) {
  def regRecipes(event : RegistryEvent.Register[IRecipe]) : Unit = metadata.info("regRecipes")

  def regItems(event : RegistryEvent.Register[Item]) : Unit = {
    metadata.info("regItems")
    items.regItems(event)
  }

  def regBlocks(event : RegistryEvent.Register[Block]) : Unit = {
    metadata.info("regBlocks")
    blocks.regBlocks(event)
  }

  def regModels(event : ModelRegistryEvent) : Unit = {
    metadata.info("regModels")
    items.regResources()
  }
}
