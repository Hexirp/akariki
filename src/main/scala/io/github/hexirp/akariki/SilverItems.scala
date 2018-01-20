package io.github.hexirp.akariki

import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.{Item, ItemBlock}

import net.minecraftforge.client.model.ModelLoader
import net.minecraftforge.event.RegistryEvent

class SilverItems(metadata : Metadata, blocks : Blocks) {
  val silver_ingot : Item = new ItemSimple(CreativeTabs.MATERIALS, "silver_ingot", metadata).item

  val silver_ore : Item = new ItemBlock(blocks.silver_ore)
    .setRegistryName(metadata.newResourceLocation("silver_ore"))

  val silver_block : Item = new ItemBlock(blocks.silver_block)
    .setRegistryName(metadata.newResourceLocation("silver_block"))

  def regItems(event : RegistryEvent.Register[Item]) : Unit = {
    def regItem(item : Item) : Unit = event.getRegistry.register(item)

    regItem(silver_ingot)
    regItem(silver_ore)
    regItem(silver_block)
  }

  def regResources() : Unit = {
    def setModel(item : Item, model : ModelResourceLocation) : Unit =
      ModelLoader.setCustomModelResourceLocation(item, 0, model)

    def regModel(item : Item) : Unit =
      setModel(item, new ModelResourceLocation(item.getRegistryName, "inventory"))

    regModel(silver_ingot)
    regModel(silver_ore)
    regModel(silver_block)
  }
}
