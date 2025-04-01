package io.thecheese.orestars.item;

import io.thecheese.orestars.OreStarsFabric;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ORESTAR_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(OreStarsFabric.MOD_ID, "orestars_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.orestars_group"))
                    .icon(() -> new ItemStack(ModItemsFabric.IronStar)).entries((displayContext, entries) -> {
                        entries.add(ModItemsFabric.IronStar);
                        entries.add(ModItemsFabric.GoldStar);
                        entries.add(ModItemsFabric.EmeraldStar);
                        entries.add(ModItemsFabric.DiamondStar);
                        entries.add(ModItemsFabric.CopperStar);
                        entries.add(ModItemsFabric.CoalStar);
                        entries.add(ModItemsFabric.AmethystStar);
                        entries.add(ModItemsFabric.LapisLazuliStar);
                        entries.add(ModItemsFabric.NetheriteStar);
                        entries.add(ModItemsFabric.QuartzStar);
                        entries.add(ModItemsFabric.RedstoneStar);
                    }).build());

    public static void registerItemGroups() {
        OreStarsFabric.LOGGER.info("Registering Item Group for " + OreStarsFabric.MOD_ID);
    }
}
