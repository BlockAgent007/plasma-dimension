package net.mcreator.gauntlet_zombie;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.entity.item.EntityItem;

@Elementsgauntlet_zombie.ModElement.Tag
public class MCreatorPlasmaZombieEntityDies extends Elementsgauntlet_zombie.ModElement {
	public MCreatorPlasmaZombieEntityDies(Elementsgauntlet_zombie instance) {
		super(instance, 8);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorPlasmaZombieEntityDies!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorPlasmaZombieEntityDies!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorPlasmaZombieEntityDies!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorPlasmaZombieEntityDies!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double lootchanceFlesh = 0;
		double lootchanceIngot = 0;
		double lootchancePpotato = 0;
		lootchanceFlesh = (double) (Math.random() * 2);
		lootchanceIngot = (double) (Math.random() * 100);
		lootchancePpotato = (double) (Math.random() * 100);
		for (int index0 = 0; index0 < (int) ((lootchanceFlesh)); index0++) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(MCreatorPlasmaFlesh.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
		}
		if (((lootchanceIngot) <= 2.5)) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(MCreatorDarkmatterIngot.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
		}
		if (((lootchancePpotato) <= 2.5)) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(Items.POISONOUS_POTATO, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
		}
	}
}
