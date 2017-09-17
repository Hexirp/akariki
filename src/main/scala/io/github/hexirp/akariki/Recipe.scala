package io.github.hexirp.akariki

import net.minecraft.item.crafting.IRecipe
import net.minecraftforge.event.RegistryEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent

class Recipe {
  @SubscribeEvent
  def regRecipe(e : RegistryEvent.Register[IRecipe]) = e.getRegistry.registerAll()
}
