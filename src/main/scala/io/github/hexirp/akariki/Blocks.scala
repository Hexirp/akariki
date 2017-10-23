package io.github.hexirp.akariki

import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.util.ResourceLocation
import net.minecraftforge.event.RegistryEvent

class Blocks {
  var silver_ore : Block = new Block(Material.ROCK)
    .setRegistryName(new ResourceLocation(Metadata.modid, "silver_ore"))
    .setCreativeTab(CreativeTabs.BUILDING_BLOCKS)
    .setUnlocalizedName("silver_ore")

  def regBlock(event : RegistryEvent.Register[Block]) = {
    event.getRegistry.register(silver_ore)
  }
}
