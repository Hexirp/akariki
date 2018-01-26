package io.github.hexirp.akariki

import net.minecraft.block.material.{MapColor, Material}
import net.minecraft.block.{Block, BlockFence}
import net.minecraft.creativetab.CreativeTabs

import org.apache.logging.log4j.Logger

/** [[Blocks]] manages blocks of akariki.
  *
  * @param metadata The metadata of akariki
  * @param log      The logger of initialization
  */
class Blocks(metadata : Metadata, log : Logger) {
  val silver_ore : Block = new Block(Material.ROCK)
    .setRegistryName(metadata.newResourceLocation("silver_ore"))
    .setCreativeTab(CreativeTabs.BUILDING_BLOCKS)
    .setUnlocalizedName("silver_ore")
    .setResistance(15.0f)

  val silver_block : Block = new Block(Material.ROCK)
    .setRegistryName(metadata.newResourceLocation("silver_block"))
    .setCreativeTab(CreativeTabs.BUILDING_BLOCKS)
    .setUnlocalizedName("silver_block")
    .setResistance(30.0f)

  val prismarine_fence : Block = new BlockFence(Material.ROCK, MapColor.DIAMOND)
    .setRegistryName(metadata.newResourceLocation("prismarine_fence"))
    .setCreativeTab(CreativeTabs.DECORATIONS)
    .setUnlocalizedName("prismarine_fence")
    .setResistance(30.0f)

  val cleaned_cobblestone : Block = new Block(Material.ROCK)
    .setRegistryName(metadata.newResourceLocation("cleaned_cobblestone"))
    .setCreativeTab(CreativeTabs.BUILDING_BLOCKS)
    .setUnlocalizedName("cleaned_cobblestone")
    .setResistance(30.0f)

  def regBlocks(reg : Block => Unit) : Unit = {
    reg(silver_ore)
    reg(silver_block)
    reg(prismarine_fence)
    reg(cleaned_cobblestone)
  }
}
