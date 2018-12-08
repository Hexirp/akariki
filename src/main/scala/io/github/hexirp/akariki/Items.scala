package io.github.hexirp.akariki

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.{Item, ItemBlock}

/** [[Items]] は akariki のアイテムを管理する。
  *
  * @param metadata The data of akariki
  * @param blocks   The blocks of akariki
  */
class Items(metadata : Metadata, blocks : Blocks) {
  val sample : Item = new Item()
    .setRegistryName(metadata.newResourceLocation("sample"))
    .setUnlocalizedName("sample")
    .setCreativeTab(CreativeTabs.MISC)

  val chisel : Item = new Item()
    .setRegistryName(metadata.newResourceLocation("chisel"))
    .setUnlocalizedName("chisel")
    .setCreativeTab(CreativeTabs.TOOLS)

  val wrench : Item = new Item()
    .setRegistryName(metadata.newResourceLocation("wrench"))
    .setUnlocalizedName("wrench")
    .setCreativeTab(CreativeTabs.TOOLS)

  val prismarine_fence : Item = new ItemBlock(blocks.prismarine_fence)
    .setRegistryName(metadata.newResourceLocation("prismarine_fence"))

  val cleaned_cobblestone : Item = new ItemBlock(blocks.cleaned_cobblestone)
    .setRegistryName(metadata.newResourceLocation("cleaned_cobblestone"))

  val advanced_crafting_table : Item = new ItemBlock(blocks.advanced_crafting_table)
    .setRegistryName(metadata.newResourceLocation("advanced_crafting_table"))

  def regItems(reg : Item => Unit) : Unit = {
    reg(sample)
    reg(chisel)
    reg(wrench)
    reg(prismarine_fence)
    reg(cleaned_cobblestone)
    reg(advanced_crafting_table)
  }

  def regResources(reg : Item => Unit) : Unit = {
    reg(sample)
    reg(chisel)
    reg(wrench)
    reg(prismarine_fence)
    reg(cleaned_cobblestone)
    reg(advanced_crafting_table)
  }
}
