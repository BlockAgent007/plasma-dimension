package net.mcreator.gauntlet_zombie;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

@Elementsgauntlet_zombie.ModElement.Tag
public class MCreatorPlasmaPoisoningOnPotionActiveTick extends Elementsgauntlet_zombie.ModElement {
	public MCreatorPlasmaPoisoningOnPotionActiveTick(Elementsgauntlet_zombie instance) {
		super(instance, 11);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorPlasmaPoisoningOnPotionActiveTick!");
			return;
		}
		if (dependencies.get("amplifier") == null) {
			System.err.println("Failed to load dependency amplifier for procedure MCreatorPlasmaPoisoningOnPotionActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int amplifier = (int) dependencies.get("amplifier");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) ((4 * (amplifier)) / ((entity.getEntityData().getDouble("plasmaResistance")) + 1)));
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).getFoodStats().setFoodLevel(
					(int) (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).getFoodStats().getFoodLevel() : 0) - 0.002));
	}
}
