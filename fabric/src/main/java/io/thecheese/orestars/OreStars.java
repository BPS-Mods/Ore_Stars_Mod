package io.thecheese.orestars;

import io.thecheese.orestars.item.ModItemGroups;
import io.thecheese.orestars.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OreStars implements ModInitializer {
	public static final String MOD_ID = "orestars";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}