package net.mcreator.gauntlet_zombie;

import net.minecraft.entity.Entity;

@Elementsgauntlet_zombie.ModElement.Tag
public class MCreatorPlasmaResistancePotionExpires extends Elementsgauntlet_zombie.ModElement {
	public MCreatorPlasmaResistancePotionExpires(Elementsgauntlet_zombie instance) {
		super(instance, 45);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorPlasmaResistancePotionExpires!");
			return;
		}
		if (dependencies.get("amplifier") == null) {
			System.err.println("Failed to load dependency amplifier for procedure MCreatorPlasmaResistancePotionExpires!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int amplifier = (int) dependencies.get("amplifier");
		entity.getEntityData().setDouble("plasmaResistance", ((entity.getEntityData().getDouble("plasmaResistance")) - (amplifier)));
	}
}
