package net.mcreator.gauntlet_zombie;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

@Elementsgauntlet_zombie.ModElement.Tag
public class MCreatorPlasmaDecomposerOnBlockRightClicked extends Elementsgauntlet_zombie.ModElement {
	public MCreatorPlasmaDecomposerOnBlockRightClicked(Elementsgauntlet_zombie instance) {
		super(instance, 107);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorPlasmaDecomposerOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorPlasmaDecomposerOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorPlasmaDecomposerOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorPlasmaDecomposerOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorPlasmaDecomposerOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(gauntlet_zombie.instance, MCreatorPlasmaDecomposerGUI.GUIID, world, x, y, z);
	}
}
