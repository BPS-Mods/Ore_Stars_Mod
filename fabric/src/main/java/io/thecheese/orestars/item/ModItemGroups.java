package io.thecheese.orestars.item;

import io.thecheese.orestars.OreStars;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ORESTAR_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(OreStars.MOD_ID, "orestars_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.orestars_group"))
                    .icon(() -> new ItemStack(ModItems.IronStar)).entries((displayContext, entries) -> {
                        entries.add(ModItems.IronStar);
                        entries.add(ModItems.GoldStar);
                        entries.add(ModItems.EmeraldStar);
                        entries.add(ModItems.DiamondStar);
                        entries.add(ModItems.CopperStar);
                        entries.add(ModItems.CoalStar);
                        entries.add(ModItems.AmethystStar);
                        entries.add(ModItems.LapisLazuliStar);
                        entries.add(ModItems.NetheriteStar);
                        entries.add(ModItems.QuartzStar);
                        entries.add(ModItems.RedstoneStar);
                    }).build());

    public static void registerItemGroups() {
        OreStars.LOGGER.info("Registering Item Group for " + OreStars.MOD_ID);
    }
}
