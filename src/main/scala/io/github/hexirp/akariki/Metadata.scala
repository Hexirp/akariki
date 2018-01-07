package io.github.hexirp.akariki

import net.minecraft.util.ResourceLocation

import net.minecraftforge.fml.common.ModMetadata

/** [[Metadata]] is important data of MOD.
  *
  * @param id
  * @param name
  * @param version
  */
class Metadata(id : String, name : String, version : String) {
  def newResourceLocation(resourceName : String) : ResourceLocation = new ResourceLocation(id, resourceName)

  def set(metadata : ModMetadata) : Unit = {
    metadata.modId = id
    metadata.name = name
    metadata.version = version
  }
}
