package net.threexj.tutorialmod.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.threexj.tutorialmod.TutorialMod;

public class ModSounds {
    public static final SoundEvent SAPPHIRE_BLOCK_BREAK = registerSoundEvent("sapphire_block_break");
    public static final SoundEvent SAPPHIRE_BLOCK_STEP = registerSoundEvent("sapphire_block_step");
    public static final SoundEvent SAPPHIRE_BLOCK_PLACE = registerSoundEvent("sapphire_block_place");
    public static final SoundEvent SAPPHIRE_BLOCK_HIT = registerSoundEvent("sapphire_block_hit");
    public static final SoundEvent SAPPHIRE_BLOCK_FALL = registerSoundEvent("sapphire_block_fall");

    public static final BlockSoundGroup STEEL_BLOCK_SOUNDS = new BlockSoundGroup(1f, 1f,
            ModSounds.SAPPHIRE_BLOCK_BREAK, ModSounds.SAPPHIRE_BLOCK_STEP, ModSounds.SAPPHIRE_BLOCK_PLACE,
            ModSounds.SAPPHIRE_BLOCK_HIT, ModSounds.SAPPHIRE_BLOCK_FALL);

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.tryParse(TutorialMod.MOD_ID + ":" + name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        TutorialMod.LOGGER.info("Registering Sounds for " + TutorialMod.MOD_ID);
    }
}
