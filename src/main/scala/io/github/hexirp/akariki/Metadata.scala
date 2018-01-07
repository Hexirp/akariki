package io.github.hexirp.akariki

import net.minecraft.util.ResourceLocation

class Metadata(id : String, name : String, version : String) {
  def newResourceLocation(resourceName : String) : ResourceLocation = new ResourceLocation(id, resourceName)
}
