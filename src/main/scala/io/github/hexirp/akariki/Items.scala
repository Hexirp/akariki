package io.github.hexirp.akariki

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.{Item, ItemBlock}

import org.apache.logging.log4j.Logger

/** [[Items]] manages items of akariki.
  *
  * @param metadata The data of akariki
  * @param blocks   The blocks of akariki
  */
class Items(metadata : Metadata, blocks : Blocks) {
  val sample : Item = new ItemSimple(CreativeTabs.MISC, "sample", metadata).item

  val chisel : Item = new ItemSimple(CreativeTabs.TOOLS, "chisel", metadata).item

  val wrench : Item = new ItemSimple(CreativeTabs.TOOLS, "wrench", metadata).item

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
