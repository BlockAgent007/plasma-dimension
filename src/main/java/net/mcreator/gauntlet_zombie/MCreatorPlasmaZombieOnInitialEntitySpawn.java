package net.mcreator.gauntlet_zombie;

import net.minecraft.entity.Entity;

@Elementsgauntlet_zombie.ModElement.Tag
public class MCreatorPlasmaZombieOnInitialEntitySpawn extends Elementsgauntlet_zombie.ModElement {
	public MCreatorPlasmaZombieOnInitialEntitySpawn(Elementsgauntlet_zombie instance) {
		super(instance, 49);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorPlasmaZombieOnInitialEntitySpawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getEntityData().setDouble("plasmaResistance", 2);
	}
}
