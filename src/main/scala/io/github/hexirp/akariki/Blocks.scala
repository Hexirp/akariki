package io.github.hexirp.akariki

import net.minecraft.block.material.{MapColor, Material}
import net.minecraft.block.{Block, BlockFence}
import net.minecraft.creativetab.CreativeTabs

/** [[Blocks]] manages blocks of akariki.
  *
  * @param metadata The metadata of akariki
  */
class Blocks(metadata : Metadata) {
  val silver_ore : Block = new Block(Material.ROCK)
    .setRegistryName(metadata.newResourceLocation("silver_ore"))
    .setCreativeTab(CreativeTabs.BUILDING_BLOCKS)
    .setUnlocalizedName("silver_ore")
    .setHardness(3.0f)
    .setResistance(15.0f)

  val silver_block : Block = new Block(Material.ROCK)
    .setRegistryName(metadata.newResourceLocation("silver_block"))
    .setCreativeTab(CreativeTabs.BUILDING_BLOCKS)
    .setUnlocalizedName("silver_block")
    .setHardness(4.0f)
    .setResistance(30.0f)

  val prismarine_fence : Block = new PrismarineFence(metadata)

  val cleaned_cobblestone : Block = new Block(Material.ROCK)
    .setRegistryName(metadata.newResourceLocation("cleaned_cobblestone"))
    .setCreativeTab(CreativeTabs.BUILDING_BLOCKS)
    .setUnlocalizedName("cleaned_cobblestone")
    .setHardness(2.0f)
    .setResistance(30.0f)

  val advanced_crafting_table : Block = new Block(Material.WOOD)
    .setRegistryName(metadata.newResourceLocation("advanced_crafting_table"))
    .setCreativeTab(CreativeTabs.DECORATIONS)
    .setUnlocalizedName("advanced_crafting_table")

  def regBlocks(reg : Block => Unit) : Unit = {
    reg(silver_ore)
    reg(silver_block)
    reg(prismarine_fence)
    reg(cleaned_cobblestone)
    reg(advanced_crafting_table)
  }
}
