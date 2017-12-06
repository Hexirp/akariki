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
    .setRegistryName(new ResourceLocation(Metadata.modid, "silver_ore"))

  val silver_block : Item = new ItemBlock(blocks.silver_block)
    .setRegistryName(new ResourceLocation(Metadata.modid, "silver_block"))

  def regItems(event : RegistryEvent.Register[Item]) : Unit = {
    def regItem(item : Item) : Unit = event.getRegistry.register(item)

    regItem(sample)
    regItem(silver_ingot)
    regItem(silver_ore)
    regItem(silver_block)
  }

  def regResources() : Unit = {
    def setModel(item : Item, model : ModelResourceLocation) : Unit =
      ModelLoader.setCustomModelResourceLocation(item, 0, model)

    def regModel(item : Item) : Unit =
      setModel(item, new ModelResourceLocation(item.getRegistryName, "inventory"))

    regModel(sample)
    regModel(silver_ingot)
    regModel(silver_ore)
    regModel(silver_block)
  }
}
