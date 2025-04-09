package io.thecheese.orestars.item;

import io.thecheese.orestars.OreStarsFabric;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item IronStar = registerItem("iron_star", new Item(new Item.Settings()));
    public static final Item GoldStar = registerItem("gold_star", new Item(new Item.Settings()));
    public static final Item EmeraldStar = registerItem("emerald_star", new Item(new Item.Settings()));
    public static final Item DiamondStar = registerItem("diamond_star", new Item(new Item.Settings()));
    public static final Item CopperStar = registerItem("copper_star", new Item(new Item.Settings()));
    public static final Item CoalStar = registerItem("coal_star", new Item(new Item.Settings()));
    public static final Item AmethystStar = registerItem("amethyst_star", new Item(new Item.Settings()));
    public static final Item LapisLazuliStar = registerItem("lapislazuli_star", new Item(new Item.Settings()));
    public static final Item NetheriteStar = registerItem("netherite_star", new Item(new Item.Settings()));
    public static final Item QuartzStar = registerItem("quartz_star", new Item(new Item.Settings()));
    public static final Item RedstoneStar = registerItem("redstone_star", new Item(new Item.Settings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(OreStarsFabric.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OreStarsFabric.LOGGER.info("Registering Mod Items for " + OreStarsFabric.MOD_ID);

    }
}
