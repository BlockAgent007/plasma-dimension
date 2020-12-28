package net.mcreator.gauntlet_zombie;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.entity.item.EntityItem;

@Elementsgauntlet_zombie.ModElement.Tag
public class MCreatorPlasmaSpiderEntityDies extends Elementsgauntlet_zombie.ModElement {
	public MCreatorPlasmaSpiderEntityDies(Elementsgauntlet_zombie instance) {
		super(instance, 6);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorPlasmaSpiderEntityDies!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorPlasmaSpiderEntityDies!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorPlasmaSpiderEntityDies!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorPlasmaSpiderEntityDies!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double lootchanceString = 0;
		double lootchanceSeye = 0;
		lootchanceString = (double) (Math.random() * 2);
		lootchanceSeye = (double) (Math.random() * 3);
		for (int index0 = 0; index0 < (int) ((lootchanceString)); index0++) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(Items.STRING, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
		}
		if (((lootchanceSeye) == 3)) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(MCreatorPlasmaSpiderEye.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
		}
	}
}
