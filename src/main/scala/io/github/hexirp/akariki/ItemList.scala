package io.github.hexirp.akariki

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item
import net.minecraft.util.ResourceLocation

class ItemList {
  val sample : Item = new Item()
    .setRegistryName(new ResourceLocation(Metadata.modid, "sample"))
    .setCreativeTab(CreativeTabs.MISC)
    .setUnlocalizedName("sample")
}
