package io.github.hexirp.akariki

import net.minecraft.block.BlockFence
import net.minecraft.block.material.{MapColor, Material}
import net.minecraft.creativetab.CreativeTabs

/** [[PrismarineFence]] はプリズマリンから出来たフェンスである、
  *
  * Minecraf 1.13.x への対応の時に、このアイテムは、水を通さない特殊なフェンスになることが予定されている。
  * そのため、特別扱いする必要があることが予測される。そのため Items の中から分けた。
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
