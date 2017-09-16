package io.github.hexirp.akariki

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.{EventHandler => Eventh}
import net.minecraftforge.fml.common.event.{FMLInitializationEvent => Inite}

@Mod(modid = "akariki")
object Main {
  @Eventh
  def init(event : Inite) : Unit = ()
}
