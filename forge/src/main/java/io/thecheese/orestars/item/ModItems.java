package io.thecheese.orestars.item;

import io.thecheese.orestars.OreStars;
import io.thecheese.orestars.creativetab.CreativeTabInit;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import static io.thecheese.orestars.creativetab.CreativeTabInit.addToTab;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OreStars.MOD_ID);

    public static final RegistryObject<Item> Iron_Star = addToTab(ITEMS.register("iron_star",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> Gold_Star = addToTab(ITEMS.register("gold_star",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> Diamond_Star = addToTab(ITEMS.register("diamond_star",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> LapisLazuli_Star = addToTab(ITEMS.register("lapislazuli_star",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> Redstone_Star = addToTab(ITEMS.register("redstone_star",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> Cooper_Star = addToTab(ITEMS.register("copper_star",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> Coal_Star = addToTab(ITEMS.register("coal_star",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> Amethyst_Star = addToTab(ITEMS.register("amethyst_star",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> Emerald_Star = addToTab(ITEMS.register("emerald_star",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> Quartz_Star = addToTab(ITEMS.register("quartz_star",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> Netherite_Star = addToTab(ITEMS.register("netherite_star",
            () -> new Item(new Item.Properties())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
