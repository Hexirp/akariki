package io.github.hexirp.akariki

import net.minecraft.block.{Block, BlockFence}
import net.minecraft.block.material.{MapColor, Material}
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.util.ResourceLocation

import net.minecraftforge.event.RegistryEvent

import io.github.hexirp.akariki.Boot.MOD_ID

/** [[Blocks]] manages blocks of akariki.
  *
  */
class Blocks {
  val silver_ore : Block = new Block(Material.ROCK)
    .setRegistryName(new ResourceLocation(Metadata.MOD_ID, "silver_ore"))
    .setCreativeTab(CreativeTabs.BUILDING_BLOCKS)
    .setUnlocalizedName("silver_ore")

  val silver_block : Block = new Block(Material.ROCK)
    .setRegistryName(new ResourceLocation(Boot.MOD_ID, "silver_block"))
    .setCreativeTab(CreativeTabs.BUILDING_BLOCKS)
    .setUnlocalizedName("silver_block")

  val prismarine_fence : Block = new BlockFence(Material.ROCK, MapColor.DIAMOND)
    .setRegistryName(new ResourceLocation(Boot.MOD_ID, "prismarine_fence"))
    .setUnlocalizedName("prismarine_fence")

  def regBlocks(event : RegistryEvent.Register[Block]) : Unit = {
    def regBlock(block : Block) : Unit = event.getRegistry.register(block)

    regBlock(silver_ore)
    regBlock(silver_block)
    regBlock(prismarine_fence)
  }
}
