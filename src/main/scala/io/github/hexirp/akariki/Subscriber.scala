package io.github.hexirp.akariki

import net.minecraft.block.Block
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item
import net.minecraft.item.crafting.IRecipe
import net.minecraft.util.ResourceLocation
import net.minecraftforge.event.RegistryEvent
import org.apache.logging.log4j.Logger

class Subscriber(log : Logger) {
  val sample : Item = new Item()
    .setRegistryName(new ResourceLocation("akariki", "sample"))
    .setCreativeTab(CreativeTabs.MISC)
    .setUnlocalizedName("sample")

  def regRecipe(e : RegistryEvent.Register[IRecipe]) = log.info("regRecipe")

  def regItem(e : RegistryEvent.Register[Item]) = {
    log.info("regItem")

    e.getRegistry.register(sample)
  }

  def regBlock(e : RegistryEvent.Register[Block]) = log.info("regBlock")
}
