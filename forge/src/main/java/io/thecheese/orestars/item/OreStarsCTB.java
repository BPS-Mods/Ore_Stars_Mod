package io.thecheese.orestars.item;

import io.thecheese.orestars.OreStars;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = OreStars.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class OreStarsCTB {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OreStars.MOD_ID);

    public static final List<Supplier<? extends ItemLike>> ORE_STARS_TAB_ITEMS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> ORE_STARS_TAB = CREATIVE_MODE_TABS.register("oretars_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Iron_Star.get()))
                    .title(Component.translatable("itemGroup.orestars_tab"))
                    .displayItems((displayParams, output) ->
                            ORE_STARS_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get())))
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike) {
        ORE_STARS_TAB_ITEMS.add(itemLike);
        return itemLike;
    }
}