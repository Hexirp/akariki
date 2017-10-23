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
    .setRegistryName(new ResoruceLocation(Metadata.modid, "silver_block"))
    .setCreativeTab(CreativeTabs.BUILDING_BLOCKS)
    .setUnlocalizedName("silver_block")

  def regBlock(event : RegistryEvent.Register[Block]) : Unit = {
    event.getRegistry.register(silver_ore)
    event.getRegistry.register(silver_block)
  }
}
