package io.github.hexirp.akariki

import net.minecraft.block.BlockFence
import net.minecraft.block.material.{MapColor, Material}
import net.minecraft.creativetab.CreativeTabs

/** [[PrismarineFence]] はプリズマリンから出来たフェンスである。
  *
  * Minecraft 1.13 ではフェンスが水を通すようになるが、このフェンスは水を通さないままにするつもりである。
  * そのため、プリズマリンフェンスのためのクラスが必要になる。
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
