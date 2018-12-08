package io.github.hexirp.akariki

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.{Item, ItemBlock, ItemStack}

import net.minecraftforge.fml.common.registry.GameRegistry

/** [[SilverItems]] は銀に関するアイテムを管理する。
  *
  * @param metadata The metadata of akariki
  * @param blocks   The blocks of akariki
  */
class SilverItems(metadata : Metadata, blocks : Blocks) {
  val silver_ingot : Item = new Item()
    .setRegistryName(metadata.newResourceLocation("silver_ingot"))
    .setUnlocalizedName("silver_ingot")
    .setCreativeTab(CreativeTabs.MATERIALS)

  val silver_ore : Item = new ItemBlock(blocks.silver_ore)
    .setRegistryName(metadata.newResourceLocation("silver_ore"))

  val silver_block : Item = new ItemBlock(blocks.silver_block)
    .setRegistryName(metadata.newResourceLocation("silver_block"))

  def regSmeltingRecipes() : Unit = GameRegistry.addSmelting(
    new ItemStack(silver_ore),
    new ItemStack(silver_ingot),
    0.8f)

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
