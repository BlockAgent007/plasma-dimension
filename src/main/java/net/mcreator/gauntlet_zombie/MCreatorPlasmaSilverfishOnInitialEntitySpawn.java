package net.mcreator.gauntlet_zombie;

import net.minecraft.entity.Entity;

@Elementsgauntlet_zombie.ModElement.Tag
public class MCreatorPlasmaSilverfishOnInitialEntitySpawn extends Elementsgauntlet_zombie.ModElement {
	public MCreatorPlasmaSilverfishOnInitialEntitySpawn(Elementsgauntlet_zombie instance) {
		super(instance, 48);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorPlasmaSilverfishOnInitialEntitySpawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getEntityData().setDouble("plasmaResistance", 5);
	}
}
