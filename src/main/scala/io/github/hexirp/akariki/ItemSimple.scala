package io.github.hexirp.akariki

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item

class ItemSimple(tab : CreativeTabs, name : String, metadata : Metadata) {
  val item : Item = new Item()
    .setRegistryName(metadata.newResourceLocation(name))
    .setCreativeTab(tab)
    .setUnlocalizedName(name)
}
