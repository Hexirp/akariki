package io.github.hexirp.akariki;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = "akariki", dependencies = "after:forge@[14.22.1.2478,)")
public class Boot {
    public static Item sample;

    @SubscribeEvent
    public void regItem(RegistryEvent.Register<Item> e) {
        sample = new Item()
                .setRegistryName("akariki:sample")
                .setCreativeTab(CreativeTabs.MISC)
                .setUnlocalizedName("sample");

        e.getRegistry().register(sample);
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        MinecraftForge.EVENT_BUS.register(Boot.class);

        if (e.getSide() == Side.CLIENT) {
            ModelLoader.setCustomModelResourceLocation(sample, 0,
                    new ModelResourceLocation("akariki:sample", "inventory"));
        }
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        Main.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {}
}
