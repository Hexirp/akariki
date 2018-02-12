package io.github.hexirp.akariki

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item

/** [[Temp]] is an temp static function. I want to refactor it.
  */
object Temp {
  def newItemSimple(metadata : Metadata, name : String, tab : CreativeTabs) : Item = new Item()
    .setRegistryName(metadata.newResourceLocation(name))
    .setUnlocalizedName(name)
    .setCreativeTab(tab)
}
