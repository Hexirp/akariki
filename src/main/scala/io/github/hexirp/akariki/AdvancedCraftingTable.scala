package io.github.hexirp.akariki

import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs

class AdvancedCraftingTable(metadata: Metadata) extends Block(Material.WOOD) {
  this
    .setRegistryName(metadata.newResourceLocation("advanced_crafting_table"))
    .setCreativeTab(CreativeTabs.DECORATIONS)
    .setUnlocalizedName("advanced_crafting_table")
    .setHardness(3.0f)
    .setResistance(15.0f)
}
