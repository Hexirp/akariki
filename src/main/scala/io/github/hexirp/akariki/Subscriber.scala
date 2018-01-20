package io.github.hexirp.akariki

import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraft.item.crafting.IRecipe

import net.minecraftforge.client.event.ModelRegistryEvent
import net.minecraftforge.event.RegistryEvent

import org.apache.logging.log4j.Logger

/** [[Subscriber]] receives Forge's events.
  *
  * @param metadata The metadata of akariki
  * @param log      The logger of initialization
  */
class Subscriber(metadata : Metadata, log : Logger) {
  val blocks : Blocks = new Blocks(metadata, log)
  val items : Items = new Items(metadata, log, blocks)

  def regRecipes(event : RegistryEvent.Register[IRecipe]) : Unit = log.info("regRecipes")

  def regItems(event : RegistryEvent.Register[Item]) : Unit = {
    log.info("regItems")
    items.regItems(event)
  }

  def regBlocks(event : RegistryEvent.Register[Block]) : Unit = {
    log.info("regBlocks")
    blocks.regBlocks(event)
  }

  def regModels(event : ModelRegistryEvent) : Unit = {
    log.info("regModels")
    items.regResources()
  }
}
