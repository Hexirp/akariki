package io.github.hexirp.akariki

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item

/** [[ItemSimple]] is a simple item.
  *
  * @param tab      The creative tab of it
  * @param name     The name of it
  * @param metadata The metadata of akariki
  */
class ItemSimple(metadata: Metadata, name: String, tab: CreativeTabs) {
  val item : Item = new Item()
    .setRegistryName(metadata.newResourceLocation(name))
    .setCreativeTab(tab)
    .setUnlocalizedName(name)
}
