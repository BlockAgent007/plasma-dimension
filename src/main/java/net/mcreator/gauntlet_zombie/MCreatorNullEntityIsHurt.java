package net.mcreator.gauntlet_zombie;

import net.minecraft.entity.Entity;

@Elementsgauntlet_zombie.ModElement.Tag
public class MCreatorNullEntityIsHurt extends Elementsgauntlet_zombie.ModElement {
	public MCreatorNullEntityIsHurt(Elementsgauntlet_zombie instance) {
		super(instance, 68);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorNullEntityIsHurt!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getEntityData().setBoolean("attackMode", (true));
	}
}
