package io.thecheese.orestars.creativetab;

import io.thecheese.orestars.OreStarsForge;
import io.thecheese.orestars.item.ModItemsForge;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = OreStarsForge.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OreStarsForge.MOD_ID);

    public static final List<Supplier<? extends ItemLike>> ORE_STARS_TAB_ITEMS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> ORE_STARS_TAB = TABS.register("orestars_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.orestars_tab"))
                    .icon(ModItemsForge.Iron_Star.get()::getDefaultInstance)
                    .displayItems((displayParams, output) ->
                            ORE_STARS_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get())))
                    .build()
    );

    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike) {
        ORE_STARS_TAB_ITEMS.add(itemLike);
        return itemLike;
    }

}
