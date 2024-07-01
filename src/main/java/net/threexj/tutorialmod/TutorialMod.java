package net.threexj.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.enchantment.Enchantment;
import net.threexj.tutorialmod.blocks.ModBlocks;
import net.threexj.tutorialmod.item.ModItemGroups;
import net.threexj.tutorialmod.item.ModItems;
import net.threexj.tutorialmod.sound.ModSounds;
import net.threexj.tutorialmod.util.ModCustomTrades;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.registry.Registry;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();

		ModBlocks.registerModBlocks();

		ModCustomTrades.registerCustomTrades();

		ModSounds.registerSounds();

		FuelRegistry.INSTANCE.add(ModItems.LEGO_COAL, 200);

	}
}