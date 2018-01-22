package io.github.hexirp.akariki

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.{Item, ItemBlock}

/** [[SilverItems]] manages items related to Silver.
  *
  * @param metadata The metadata of akariki
  * @param blocks   The blocks of akariki
  */
class SilverItems(metadata : Metadata, blocks : Blocks) {
  val silver_ingot : Item = new ItemSimple(CreativeTabs.MATERIALS, "silver_ingot", metadata).item

  val silver_ore : Item = new ItemBlock(blocks.silver_ore)
    .setRegistryName(metadata.newResourceLocation("silver_ore"))

  val silver_block : Item = new ItemBlock(blocks.silver_block)
    .setRegistryName(metadata.newResourceLocation("silver_block"))

  def regItems(reg : Item => Unit) : Unit = {
    reg(silver_ingot)
    reg(silver_ore)
    reg(silver_block)
  }

  def regResources(reg : Item => Unit) : Unit = {
    reg(silver_ingot)
    reg(silver_ore)
    reg(silver_block)
  }
}
