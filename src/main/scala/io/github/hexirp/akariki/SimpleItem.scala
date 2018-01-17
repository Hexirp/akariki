package io.github.hexirp.akariki

import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item

import net.minecraftforge.client.model.ModelLoader
import net.minecraftforge.event.RegistryEvent

class SimpleItem(tab : CreativeTabs, name : String, metadata : Metadata) {
  val item : Item = new Item()
    .setRegistryName(metadata.newResourceLocation(name))
    .setCreativeTab(tab)
    .setUnlocalizedName(name)

  def regItem(event : RegistryEvent.Register[Item]) : Unit = event.getRegistry.register(item)

  def regModel() : Unit =
    ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName, "inventory"))
}
