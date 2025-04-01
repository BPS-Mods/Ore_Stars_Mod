package io.thecheese.orestars;

import com.mojang.logging.LogUtils;
import io.thecheese.orestars.creativetab.CreativeTabInit;
import io.thecheese.orestars.item.ModItemsForge;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;


@Mod("orestars")
public class OreStarsForge
{

    public static final String MOD_ID = "orestars";

    private static final Logger LOGGER = LogUtils.getLogger();

    public OreStarsForge(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        ModItemsForge.register(modEventBus);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        CreativeTabInit.TABS.register(bus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }


    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

            LOGGER.info("Hello o/");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
