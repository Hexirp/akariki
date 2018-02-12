package io.github.hexirp.akariki

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.{Item, ItemBlock}

/** [[Items]] manages items of akariki.
  *
  * @param metadata The data of akariki
  * @param blocks   The blocks of akariki
  */
class Items(metadata : Metadata, blocks : Blocks) {
  val sample : Item = Temp.newItemSimple(metadata, "sample", CreativeTabs.MISC)

  val chisel : Item = Temp.newItemSimple(metadata, "chisel", CreativeTabs.TOOLS)

  val wrench : Item = Temp.newItemSimple(metadata, "wrench", CreativeTabs.TOOLS)

  val prismarine_fence : Item = new ItemBlock(blocks.prismarine_fence)
    .setRegistryName(metadata.newResourceLocation("prismarine_fence"))

  val cleaned_cobblestone : Item = new ItemBlock(blocks.cleaned_cobblestone)
    .setRegistryName(metadata.newResourceLocation("cleaned_cobblestone"))

  def regItems(reg : Item => Unit) : Unit = {
    reg(sample)
    reg(chisel)
    reg(wrench)
    reg(prismarine_fence)
    reg(cleaned_cobblestone)
  }

  def regResources(reg : Item => Unit) : Unit = {
    reg(sample)
    reg(chisel)
    reg(wrench)
    reg(prismarine_fence)
    reg(cleaned_cobblestone)
  }
}
