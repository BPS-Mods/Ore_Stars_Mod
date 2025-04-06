package io.thecheese.orestars.item;

import io.thecheese.orestars.OreStars;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class OreStarsCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> ORESTARSTAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OreStars.MOD_ID);

    public static final List<Supplier<? extends ItemLike>> ORESTARS_TAB_ITEMS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> ORESTARS_TAB = ORESTARSTAB.register("orestars_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Iron_Star.get()))
                    .title(Component.translatable("itemgroup.orestars_group"))
                    .displayItems((itemDisplayParameters, output) -> {
                            ORESTARS_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get()));
                    }).build());


    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike) {
        ORESTARS_TAB_ITEMS.add(itemLike);
        return itemLike;
    }

    public static void register(IEventBus eventBus) {
        ORESTARSTAB.register(eventBus);
    }
}