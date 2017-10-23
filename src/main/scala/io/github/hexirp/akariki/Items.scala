package io.github.hexirp.akariki

import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.{Item, ItemBlock}
import net.minecraft.util.ResourceLocation
import net.minecraftforge.client.model.ModelLoader
import net.minecraftforge.event.RegistryEvent

class Items(blocks : Blocks) {
  val sample : Item = new Item()
    .setRegistryName(new ResourceLocation(Metadata.modid, "sample"))
    .setCreativeTab(CreativeTabs.MISC)
    .setUnlocalizedName("sample")

  val silver_ingot : Item = new Item()
    .setRegistryName(new ResourceLocation(Metadata.modid, "silver_ingot"))
    .setCreativeTab(CreativeTabs.MATERIALS)
    .setUnlocalizedName("silver_ingot")

  val silver_ore : Item = new ItemBlock(blocks.silver_ore)

  def regItem(event : RegistryEvent.Register[Item]) : Unit = {
    event.getRegistry.register(sample)
    event.getRegistry.register(silver_ingot)
    event.getRegistry.register(silver_ore)
  }

  def regResource() : Unit = {
    ModelLoader.setCustomModelResourceLocation(sample, 0, new ModelResourceLocation(sample.getRegistryName, "inventory"))
    ModelLoader.setCustomModelResourceLocation(silver_ingot, 0, new ModelResourceLocation(silver_ingot.getRegistryName, "inventory"))
    ModelLoader.setCustomModelResourceLocation(silver_ore, 0, new ModelResourceLocation(silver_ore.getRegistryName, "inventory"))
  }
}
