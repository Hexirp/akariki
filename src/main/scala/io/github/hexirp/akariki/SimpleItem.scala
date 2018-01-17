package io.github.hexirp.akariki

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item

class SimpleItem(tab : CreativeTabs, name : String, metadata : Metadata) {
  val item : Item = new Item()
    .setRegistryName(metadata.newResourceLocation(name))
    .setCreativeTab(tab)
    .setUnlocalizedName(name)
}
