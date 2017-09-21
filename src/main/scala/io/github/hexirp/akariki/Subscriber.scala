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
    .setRegistryName(new ResourceLocation(Metadata.modid, "sample"))
    .setCreativeTab(CreativeTabs.MISC)
    .setUnlocalizedName("sample")

  def regRecipe(event : RegistryEvent.Register[IRecipe]) : Unit = log.info("regRecipe")

  def regItem(event : RegistryEvent.Register[Item]) : Unit = {
    log.info("regItem")
    event.getRegistry.register(sample)
  }

  def regBlock(event : RegistryEvent.Register[Block]) : Unit = log.info("regBlock")
}
