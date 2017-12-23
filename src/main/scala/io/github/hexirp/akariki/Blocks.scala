package io.github.hexirp.akariki

import net.minecraft.block.{Block, BlockFence}
import net.minecraft.block.material.{MapColor, Material}
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.util.ResourceLocation

import net.minecraftforge.event.RegistryEvent

/** [[Blocks]] manages blocks of akariki.
  *
  * @param context The context of initialization
  */
class Blocks(context : Context) {
  val silver_ore : Block = new Block(Material.ROCK)
    .setRegistryName(context.newResourceLocation("silver_ore"))
    .setCreativeTab(CreativeTabs.BUILDING_BLOCKS)
    .setUnlocalizedName("silver_ore")

  val silver_block : Block = new Block(Material.ROCK)
    .setRegistryName(context.newResourceLocation("silver_block"))
    .setCreativeTab(CreativeTabs.BUILDING_BLOCKS)
    .setUnlocalizedName("silver_block")

  val prismarine_fence : Block = new BlockFence(Material.ROCK, MapColor.DIAMOND)
    .setRegistryName(context.newResourceLocation("prismarine_fence"))
    .setUnlocalizedName("prismarine_fence")

  val cleaned_cobblestone : Block = new Block(Material.ROCK)
    .setRegistryName(context.newResourceLocation("cleaned_cobblestone"))
    .setUnlocalizedName("cleaned_cobblestone")

  def regBlocks(event : RegistryEvent.Register[Block]) : Unit = {
    def regBlock(block : Block) : Unit = event.getRegistry.register(block)

    regBlock(silver_ore)
    regBlock(silver_block)
    regBlock(prismarine_fence)
    regBlock(cleaned_cobblestone)
  }
}
