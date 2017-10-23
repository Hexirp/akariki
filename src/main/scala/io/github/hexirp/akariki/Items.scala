package io.github.hexirp.akariki

import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item
import net.minecraft.util.ResourceLocation
import net.minecraftforge.client.model.ModelLoader
import net.minecraftforge.event.RegistryEvent

class Items {
  val sample : Item = new Item()
    .setRegistryName(new ResourceLocation(Metadata.modid, "sample"))
    .setCreativeTab(CreativeTabs.MISC)
    .setUnlocalizedName("sample")

  val silver_ingot : Item = new Item()
    .setRegistryName(new ResourceLocation(Metadata.modid, "silver_ingot"))
    .setCreativeTab(CreativeTabs.MATERIALS)
    .setUnlocalizedName("silver_ingot")

  def regItem(event : RegistryEvent.Register[Item]) : Unit = {
    event.getRegistry.register(sample)
    event.getRegistry.register(silver_ingot)
  }

  def regResource() : Unit = {
    ModelLoader.setCustomModelResourceLocation(sample, 0, new ModelResourceLocation(sample.getRegistryName, "inventory"))
    ModelLoader.setCustomModelResourceLocation(silver_ingot, 0, new ModelResourceLocation(silver_ingot.getRegistryName, "inventory"))
  }
}
