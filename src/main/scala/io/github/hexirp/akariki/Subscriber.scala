package io.github.hexirp.akariki

import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraft.item.crafting.IRecipe

import net.minecraftforge.client.event.ModelRegistryEvent
import net.minecraftforge.event.RegistryEvent

import org.apache.logging.log4j.Logger

/** [[Subscriber]] receives Forge's events.
  *
  * @param context The context of initialization
  */
class Subscriber(context : Context, log : Logger) {
  val blocks : Blocks = new Blocks(context, log)
  val items : Items = new Items(context, log, blocks)

  def regRecipes(event : RegistryEvent.Register[IRecipe]) : Unit = context.info("regRecipes")

  def regItems(event : RegistryEvent.Register[Item]) : Unit = {
    context.info("regItems")
    items.regItems(event)
  }

  def regBlocks(event : RegistryEvent.Register[Block]) : Unit = {
    context.info("regBlocks")
    blocks.regBlocks(event)
  }

  def regModels(event : ModelRegistryEvent) : Unit = {
    context.info("regModels")
    items.regResources()
  }
}
