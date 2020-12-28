package net.mcreator.gauntlet_zombie;

import net.minecraft.potion.PotionEffect;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

@Elementsgauntlet_zombie.ModElement.Tag
public class MCreatorPlasmaSpiderEyeFoodEaten extends Elementsgauntlet_zombie.ModElement {
	public MCreatorPlasmaSpiderEyeFoodEaten(Elementsgauntlet_zombie instance) {
		super(instance, 12);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorPlasmaSpiderEyeFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MCreatorPlasmaPoisoning.potion, (int) 80, (int) 1));
	}
}
