package io.github.hexirp.akariki

import net.minecraft.block.BlockFence
import net.minecraft.block.material.{MapColor, Material}
import net.minecraft.creativetab.CreativeTabs

class PrismarineFence(metadata : Metadata) extends BlockFence(Material.ROCK, MapColor.DIAMOND) {
  this
    .setRegistryName(metadata.newResourceLocation("prismarine_fence"))
    .setCreativeTab(CreativeTabs.DECORATIONS)
    .setUnlocalizedName("prismarine_fence")
    .setHardness(1.5f)
    .setResistance(30.0f)
}
