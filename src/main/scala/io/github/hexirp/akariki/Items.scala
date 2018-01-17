package io.github.hexirp.akariki

import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.{Item, ItemBlock}

import net.minecraftforge.client.model.ModelLoader
import net.minecraftforge.event.RegistryEvent

import org.apache.logging.log4j.Logger

/** [[Items]] manages items of akariki.
  *
  * @param metadata
  * @param log
  * @param blocks  The blocks of akariki
  */
class Items(metadata : Metadata, log : Logger, blocks : Blocks) {
  val sample : Item = new Item()
    .setRegistryName(metadata.newResourceLocation("sample"))
    .setCreativeTab(CreativeTabs.MISC)
    .setUnlocalizedName("sample")

  val chisel : Item = new Item()
    .setRegistryName(metadata.newResourceLocation("chisel"))
    .setCreativeTab(CreativeTabs.TOOLS)
    .setUnlocalizedName("chisel")

  val wrench : Item = new Item()
    .setRegistryName(metadata.newResourceLocation("wrench"))
    .setCreativeTab(CreativeTabs.TOOLS)
    .setUnlocalizedName("wrench")

  val silver_ingot : Item = new Item()
    .setRegistryName(metadata.newResourceLocation("silver_ingot"))
    .setCreativeTab(CreativeTabs.MATERIALS)
    .setUnlocalizedName("silver_ingot")

  val silver_ore : Item = new ItemBlock(blocks.silver_ore)
    .setRegistryName(metadata.newResourceLocation("silver_ore"))

  val silver_block : Item = new ItemBlock(blocks.silver_block)
    .setRegistryName(metadata.newResourceLocation("silver_block"))

  val prismarine_fence : Item = new ItemBlock(blocks.prismarine_fence)
    .setRegistryName(metadata.newResourceLocation("prismarine_fence"))

  val cleaned_cobblestone : Item = new ItemBlock(blocks.cleaned_cobblestone)
    .setRegistryName(metadata.newResourceLocation("cleaned_cobblestone"))

  def regItems(event : RegistryEvent.Register[Item]) : Unit = {
    def regItem(item : Item) : Unit = event.getRegistry.register(item)

    regItem(sample)
    regItem(chisel)
    regItem(wrench)
    regItem(silver_ingot)
    regItem(silver_ore)
    regItem(silver_block)
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
    regModel(silver_ingot)
    regModel(silver_ore)
    regModel(silver_block)
    regModel(prismarine_fence)
    regModel(cleaned_cobblestone)
  }
}

class SimpleItem(tab : CreativeTabs, name : String, metadata : Metadata) {
  val item : Item = new Item()
    .setRegistryName(metadata.newResourceLocation(name))
    .setCreativeTab(tab)
    .setUnlocalizedName(name)

  def regItem(event : RegistryEvent.Register[Item]) : Unit = event.getRegistry.register(item)

  def regModel() : Unit =
    ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName, "inventory"))
}
