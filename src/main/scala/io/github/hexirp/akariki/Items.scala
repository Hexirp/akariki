package io.github.hexirp.akariki

import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.{Item, ItemBlock}

import net.minecraftforge.client.model.ModelLoader
import net.minecraftforge.event.RegistryEvent

import org.apache.logging.log4j.Logger

/** [[Items]] manages items of akariki.
  *
  * @param context The context of initialization
  * @param blocks  The blocks of akariki
  */
class Items(context : Context, log : Logger, blocks : Blocks) {
  val sample : Item = new Item()
    .setRegistryName(context.newResourceLocation("sample"))
    .setCreativeTab(CreativeTabs.MISC)
    .setUnlocalizedName("sample")

  val chisel : Item = new Item()
    .setRegistryName(context.newResourceLocation("chisel"))
    .setCreativeTab(CreativeTabs.TOOLS)
    .setUnlocalizedName("chisel")

  val wrench : Item = new Item()
    .setRegistryName(context.newResourceLocation("wrench"))
    .setCreativeTab(CreativeTabs.TOOLS)
    .setUnlocalizedName("wrench")

  val silver_ingot : Item = new Item()
    .setRegistryName(context.newResourceLocation("silver_ingot"))
    .setCreativeTab(CreativeTabs.MATERIALS)
    .setUnlocalizedName("silver_ingot")

  val silver_ore : Item = new ItemBlock(blocks.silver_ore)
    .setRegistryName(context.newResourceLocation("silver_ore"))

  val silver_block : Item = new ItemBlock(blocks.silver_block)
    .setRegistryName(context.newResourceLocation("silver_block"))

  val prismarine_fence : Item = new ItemBlock(blocks.prismarine_fence)
    .setRegistryName(context.newResourceLocation("prismarine_fence"))

  val cleaned_cobblestone : Item = new ItemBlock(blocks.cleaned_cobblestone)
    .setRegistryName(context.newResourceLocation("cleaned_cobblestone"))

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
