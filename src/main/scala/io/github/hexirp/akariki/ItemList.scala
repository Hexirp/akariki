package io.github.hexirp.akariki

import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item
import net.minecraft.util.ResourceLocation
import net.minecraftforge.client.model.ModelLoader

class ItemList {
  val sample : Item = new Item()
    .setRegistryName(new ResourceLocation(Metadata.modid, "sample"))
    .setCreativeTab(CreativeTabs.MISC)
    .setUnlocalizedName("sample")

  val silver_ingot : Item = new Item()
    .setRegistryName(new ResourceLocation(Metadata.modid, "silver_ingot"))
    .setCreativeTab(CreativeTabs.MATERIALS)
    .setUnlocalizedName("silver_ingot")

  def regItem(func : Item => Unit) : Unit = {
    func(sample)
    func(silver_ingot)
  }

  def regResource() : Unit = {
    ModelLoader.setCustomModelResourceLocation(sample, 0, new ModelResourceLocation(sample.getRegistryName, "inventory"))
  }
}
