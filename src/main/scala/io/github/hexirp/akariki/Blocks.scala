package io.github.hexirp.akariki

import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.util.ResourceLocation

import net.minecraftforge.event.RegistryEvent

class Blocks {
  val silver_ore : Block = new Block(Material.ROCK)
    .setRegistryName(new ResourceLocation(Metadata.modid, "silver_ore"))
    .setCreativeTab(CreativeTabs.BUILDING_BLOCKS)
    .setUnlocalizedName("silver_ore")

  val silver_block : Block = new Block(Material.ROCK)
    .setRegistryName(new ResourceLocation(Metadata.modid, "silver_block"))
    .setCreativeTab(CreativeTabs.BUILDING_BLOCKS)
    .setUnlocalizedName("silver_block")

  def regBlocks(event : RegistryEvent.Register[Block]) : Unit = {
    def regBlock(block : Block) : Unit = event.getRegistry.register(block)

    regBlock(silver_ore)
    regBlock(silver_block)
  }
}
