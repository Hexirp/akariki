package io.github.hexirp.akariki

import net.minecraft.block.Block
import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.item.Item
import net.minecraft.item.crafting.IRecipe

import net.minecraftforge.client.event.ModelRegistryEvent
import net.minecraftforge.client.model.ModelLoader
import net.minecraftforge.event.RegistryEvent
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent

import org.apache.logging.log4j.Logger

/** [[Subscriber]] receives Forge's events.
  *
  * @param metadata The metadata of akariki
  * @param log      The logger of initialization
  */
class Subscriber(metadata : Metadata, log : Logger) {
  val blocks : Blocks = new Blocks(metadata)
  val items : Items = new Items(metadata, blocks)
  val silver_items : SilverItems = new SilverItems(metadata, blocks)

  def regSmeltingRecipes(): Unit = {
    log.info("regSmeltingRecipes")

    silver_items.regSmeltingRecipes()
  }

  def regRecipes(event : RegistryEvent.Register[IRecipe]) : Unit = log.info("regRecipes")

  def regItems(event : RegistryEvent.Register[Item]) : Unit = {
    def regItem(item : Item) : Unit = event.getRegistry.register(item)

    log.info("regItems")

    items.regItems(regItem)
    silver_items.regItems(regItem)
  }

  def regBlocks(event : RegistryEvent.Register[Block]) : Unit = {
    def regBlock(block : Block) : Unit = event.getRegistry.register(block)

    log.info("regBlocks")

    blocks.regBlocks(regBlock)
  }

  def regModels(event : ModelRegistryEvent) : Unit = {
    def setModel(item : Item, model : ModelResourceLocation) : Unit =
      ModelLoader.setCustomModelResourceLocation(item, 0, model)

    def regModel(item : Item) : Unit =
      setModel(item, new ModelResourceLocation(item.getRegistryName, "inventory"))

    log.info("regModels")

    items.regResources(regModel)
    silver_items.regResources(regModel)
  }
}
