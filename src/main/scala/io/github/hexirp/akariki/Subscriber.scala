package io.github.hexirp.akariki

import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraft.item.crafting.IRecipe

import net.minecraftforge.client.event.ModelRegistryEvent
import net.minecraftforge.event.RegistryEvent

/** [[Subscriber]] receives Forge's events.
  *
  * @param metadata
  */
class Subscriber(metadata : Metadata) {
  val blocks : Blocks = new Blocks(metadata)
  val items : Items = new Items(metadata, blocks)

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
