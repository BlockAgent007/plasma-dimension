package net.mcreator.gauntlet_zombie;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.Entity;

import java.util.Random;

@Elementsgauntlet_zombie.ModElement.Tag
public class MCreatorCoreBreakerRightClickedOnBlock extends Elementsgauntlet_zombie.ModElement {
	public MCreatorCoreBreakerRightClickedOnBlock(Elementsgauntlet_zombie instance) {
		super(instance, 32);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorCoreBreakerRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorCoreBreakerRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorCoreBreakerRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorCoreBreakerRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure MCreatorCoreBreakerRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorCoreBreakerRightClickedOnBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		World world = (World) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock().getHarvestLevel(world.getBlockState(new BlockPos((int) x,
				(int) y, (int) z)))) < 0)) {
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState().getBlock())) {
				world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(MCreatorVoidRock.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == MCreatorVoidRock.block.getDefaultState().getBlock())) {
				world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(MCreatorVoidRock.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == MCreatorAntimatterOre.block.getDefaultState()
					.getBlock())) {
				world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), MCreatorAntimatterOre.block.getDefaultState(), 3);
				world.getBlockState(new BlockPos((int) x, (int) y, (int) z))
						.getBlock()
						.dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z),
								world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), 1);
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			}
		} else {
			world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock()
					.dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), 1);
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
		}
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 20);
		if (itemstack.attemptDamageItem((int) 2, new Random(), null)) {
			itemstack.shrink(1);
			itemstack.setItemDamage(0);
		}
	}
}
