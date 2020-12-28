package net.mcreator.gauntlet_zombie;

import net.minecraft.potion.PotionEffect;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

@Elementsgauntlet_zombie.ModElement.Tag
public class MCreatorPlasmaFleshFoodEaten extends Elementsgauntlet_zombie.ModElement {
	public MCreatorPlasmaFleshFoodEaten(Elementsgauntlet_zombie instance) {
		super(instance, 13);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorPlasmaFleshFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double poisoningChance = 0;
		poisoningChance = (double) (Math.random() * 5);
		if (((poisoningChance) <= 2)) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MCreatorPlasmaPoisoning.potion, (int) 600, (int) 1));
		}
	}
}
