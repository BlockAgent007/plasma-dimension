package net.mcreator.gauntlet_zombie;

import net.minecraft.entity.Entity;

@Elementsgauntlet_zombie.ModElement.Tag
public class MCreatorPlasmaCreeperOnInitialEntitySpawn extends Elementsgauntlet_zombie.ModElement {
	public MCreatorPlasmaCreeperOnInitialEntitySpawn(Elementsgauntlet_zombie instance) {
		super(instance, 47);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorPlasmaCreeperOnInitialEntitySpawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getEntityData().setDouble("plasmaResistance", 5);
	}
}
