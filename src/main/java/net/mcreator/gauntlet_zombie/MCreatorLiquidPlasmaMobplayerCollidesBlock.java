package net.mcreator.gauntlet_zombie;

import net.minecraft.potion.PotionEffect;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

@Elementsgauntlet_zombie.ModElement.Tag
public class MCreatorLiquidPlasmaMobplayerCollidesBlock extends Elementsgauntlet_zombie.ModElement {
	public MCreatorLiquidPlasmaMobplayerCollidesBlock(Elementsgauntlet_zombie instance) {
		super(instance, 46);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorLiquidPlasmaMobplayerCollidesBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MCreatorPlasmaPoisoning.potion, (int) 2, (int) 1));
	}
}
