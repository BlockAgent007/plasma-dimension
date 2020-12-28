package net.mcreator.gauntlet_zombie;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.entity.item.EntityItem;

@Elementsgauntlet_zombie.ModElement.Tag
public class MCreatorPlasmaCreeperEntityDies extends Elementsgauntlet_zombie.ModElement {
	public MCreatorPlasmaCreeperEntityDies(Elementsgauntlet_zombie instance) {
		super(instance, 7);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorPlasmaCreeperEntityDies!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorPlasmaCreeperEntityDies!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorPlasmaCreeperEntityDies!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorPlasmaCreeperEntityDies!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double lootchanceGunpowder = 0;
		lootchanceGunpowder = (double) (Math.random() * 2);
		if (!world.isRemote) {
			world.createExplosion(null, (int) x, (int) y, (int) z, (float) 10, true);
		}
		for (int index0 = 0; index0 < (int) ((lootchanceGunpowder)); index0++) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(Items.GUNPOWDER, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
		}
	}
}
