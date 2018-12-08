package io.github.hexirp.akariki

import net.minecraft.block.BlockFence
import net.minecraft.block.material.{MapColor, Material}
import net.minecraft.creativetab.CreativeTabs

/** [[PrismarineFence]] is a item.
  *
  * At the time of updating to Minecraft-1.13.x, the prismarine fence is going to be a water-proof fence. So, I predict
  * that special changes will be needed. So I separated this class from Items.
  *
  * @param metadata The metadata of akariki
  */
class PrismarineFence(metadata : Metadata) extends BlockFence(Material.ROCK, MapColor.DIAMOND) {
  this
    .setRegistryName(metadata.newResourceLocation("prismarine_fence"))
    .setCreativeTab(CreativeTabs.DECORATIONS)
    .setUnlocalizedName("prismarine_fence")
    .setHardness(1.5f)
    .setResistance(30.0f)
}
