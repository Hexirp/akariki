package io.github.hexirp.akariki

import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraft.item.crafting.IRecipe

import net.minecraftforge.client.event.ModelRegistryEvent
import net.minecraftforge.event.RegistryEvent

/** [[Subscriber]] receives Forge's events.
  *
  * @param context
  */
class Subscriber(context : Context) {
  val blocks : Blocks = new Blocks(context)
  val items : Items = new Items(context, blocks)

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
