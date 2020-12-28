package net.mcreator.gauntlet_zombie;

import net.minecraft.entity.Entity;

@Elementsgauntlet_zombie.ModElement.Tag
public class MCreatorPlasmaResistanceOnPotionActiveTick extends Elementsgauntlet_zombie.ModElement {
	public MCreatorPlasmaResistanceOnPotionActiveTick(Elementsgauntlet_zombie instance) {
		super(instance, 44);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorPlasmaResistanceOnPotionActiveTick!");
			return;
		}
		if (dependencies.get("amplifier") == null) {
			System.err.println("Failed to load dependency amplifier for procedure MCreatorPlasmaResistanceOnPotionActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int amplifier = (int) dependencies.get("amplifier");
		entity.getEntityData().setDouble("plasmaResistance", (amplifier));
	}
}
