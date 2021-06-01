package com.thedarkgamer.testmod;

import com.thedarkgamer.testmod.util.RegistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.system.CallbackI;

@Mod("tdgtest")
public class TestMod
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "tdgtest";

    public TestMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {


    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }

    public static final ItemGroup TAB = new ItemGroup("modTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.COPPERINGOT.get());
        }
    };
}
