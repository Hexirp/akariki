package io.github.hexirp.akariki

import net.minecraft.block.material.{MapColor, Material}
import net.minecraft.block.{Block, BlockFence}
import net.minecraft.creativetab.CreativeTabs

import net.minecraftforge.event.RegistryEvent

import org.apache.logging.log4j.Logger

/** [[Blocks]] manages blocks of akariki.
  *
  * @param metadata The metadata of akariki
  */
class Blocks(metadata : Metadata) {
  val silver_ore : Block = new Block(Material.ROCK)
    .setRegistryName(metadata.newResourceLocation("silver_ore"))
    .setCreativeTab(CreativeTabs.BUILDING_BLOCKS)
    .setUnlocalizedName("silver_ore")

  val silver_block : Block = new Block(Material.ROCK)
    .setRegistryName(metadata.newResourceLocation("silver_block"))
    .setCreativeTab(CreativeTabs.BUILDING_BLOCKS)
    .setUnlocalizedName("silver_block")

  val prismarine_fence : Block = new BlockFence(Material.ROCK, MapColor.DIAMOND)
    .setRegistryName(metadata.newResourceLocation("prismarine_fence"))
    .setUnlocalizedName("prismarine_fence")

  val cleaned_cobblestone : Block = new Block(Material.ROCK)
    .setRegistryName(metadata.newResourceLocation("cleaned_cobblestone"))
    .setUnlocalizedName("cleaned_cobblestone")

  def regBlocks(event : RegistryEvent.Register[Block]) : Unit = {
    def regBlock(block : Block) : Unit = event.getRegistry.register(block)

    regBlock(silver_ore)
    regBlock(silver_block)
    regBlock(prismarine_fence)
    regBlock(cleaned_cobblestone)
  }
}
