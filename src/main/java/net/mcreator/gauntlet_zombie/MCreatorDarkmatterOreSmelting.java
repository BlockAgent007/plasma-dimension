package net.mcreator.gauntlet_zombie;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsgauntlet_zombie.ModElement.Tag
public class MCreatorDarkmatterOreSmelting extends Elementsgauntlet_zombie.ModElement {
	public MCreatorDarkmatterOreSmelting(Elementsgauntlet_zombie instance) {
		super(instance, 67);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorDarkmatterOre.block, (int) (1)), new ItemStack(MCreatorDarkmatterIngot.block, (int) (1)), 10F);
	}
}
