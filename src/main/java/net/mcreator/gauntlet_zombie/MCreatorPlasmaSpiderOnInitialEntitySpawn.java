package net.mcreator.gauntlet_zombie;

import net.minecraft.entity.Entity;

@Elementsgauntlet_zombie.ModElement.Tag
public class MCreatorPlasmaSpiderOnInitialEntitySpawn extends Elementsgauntlet_zombie.ModElement {
	public MCreatorPlasmaSpiderOnInitialEntitySpawn(Elementsgauntlet_zombie instance) {
		super(instance, 14);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorPlasmaSpiderOnInitialEntitySpawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double effect = 0;
		entity.getEntityData().setDouble("plasmaResistance", 5);
		effect = (double) (Math.random() * 4);
		if (((effect) == 1)) {
			entity.getEntityData().setBoolean("agility", (true));
		} else if (((effect) == 2)) {
			entity.getEntityData().setBoolean("healing", (true));
		} else if (((effect) == 3)) {
			entity.getEntityData().setBoolean("strong", (true));
		} else if (((effect) == 4)) {
			entity.getEntityData().setBoolean("stealth", (true));
		}
	}
}
