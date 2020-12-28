package net.mcreator.gauntlet_zombie;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

@Elementsgauntlet_zombie.ModElement.Tag
public class MCreatorPlasmaSpiderEffectSpawn extends Elementsgauntlet_zombie.ModElement {
	public MCreatorPlasmaSpiderEffectSpawn(Elementsgauntlet_zombie instance) {
		super(instance, 15);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorPlasmaSpiderEffectSpawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getEntityData().getBoolean("agility"))) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, (int) 2, (int) 1));
		}
		if ((entity.getEntityData().getBoolean("healing"))) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.REGENERATION, (int) 2, (int) 1));
		}
		if ((entity.getEntityData().getBoolean("strong"))) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.STRENGTH, (int) 2, (int) 1));
		}
		if ((entity.getEntityData().getBoolean("stealth"))) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, (int) 2, (int) 1));
		}
	}
}
