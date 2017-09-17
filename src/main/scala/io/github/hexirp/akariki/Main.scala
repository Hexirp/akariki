package io.github.hexirp.akariki

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLInitializationEvent

@Mod(modid = "akariki", dependencies = "after:forge@[14.22.1.2478,)" , modLanguage = "scala")
object Main {
  @Mod.EventHandler
  def init(e : FMLInitializationEvent) : Unit = ()
}
