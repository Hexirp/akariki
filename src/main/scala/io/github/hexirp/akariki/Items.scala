package io.github.hexirp.akariki

import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.{Item, ItemBlock}

import net.minecraftforge.client.model.ModelLoader
import net.minecraftforge.event.RegistryEvent

import org.apache.logging.log4j.Logger

/** [[Items]] manages items of akariki.
  *
  * @param metadata The data of akariki
  * @param log      The logger of initialization
  * @param blocks   The blocks of akariki
  */
class Items(metadata : Metadata, log : Logger, blocks : Blocks) {
  val sample : Item = new ItemSimple(CreativeTabs.MISC, "sample", metadata).item

  val chisel : Item = new ItemSimple(CreativeTabs.TOOLS, "chisel", metadata).item

  val wrench : Item = new ItemSimple(CreativeTabs.TOOLS, "wrench", metadata).item

  val prismarine_fence : Item = new ItemBlock(blocks.prismarine_fence)
    .setRegistryName(metadata.newResourceLocation("prismarine_fence"))

  val cleaned_cobblestone : Item = new ItemBlock(blocks.cleaned_cobblestone)
    .setRegistryName(metadata.newResourceLocation("cleaned_cobblestone"))

  def regItems(event : RegistryEvent.Register[Item]) : Unit = {
    def regItem(item : Item) : Unit = event.getRegistry.register(item)

    regItem(sample)
    regItem(chisel)
    regItem(wrench)
    regItem(prismarine_fence)
    regItem(cleaned_cobblestone)
  }

  def regResources() : Unit = {
    def setModel(item : Item, model : ModelResourceLocation) : Unit =
      ModelLoader.setCustomModelResourceLocation(item, 0, model)

    def regModel(item : Item) : Unit =
      setModel(item, new ModelResourceLocation(item.getRegistryName, "inventory"))

    regModel(sample)
    regModel(chisel)
    regModel(wrench)
    regModel(prismarine_fence)
    regModel(cleaned_cobblestone)
  }
}
