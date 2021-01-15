package net.mcreator.gauntlet_zombie;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.init.Enchantments;
import net.minecraft.enchantment.EnchantmentHelper;

@Elementsgauntlet_zombie.ModElement.Tag
public class MCreatorUncraftButtonPressed extends Elementsgauntlet_zombie.ModElement {
	public MCreatorUncraftButtonPressed(Elementsgauntlet_zombie instance) {
		super(instance, 108);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorUncraftButtonPressed!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorUncraftButtonPressed!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorUncraftButtonPressed!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure MCreatorUncraftButtonPressed!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorUncraftButtonPressed!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		World world = (World) dependencies.get("world");
		if (((itemstack.getItemDamage()) == 0)) {
			if ((((((((EnchantmentHelper.getEnchantmentLevel(Enchantments.VANISHING_CURSE, (new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot)
						return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))))) != 0) || ((EnchantmentHelper.getEnchantmentLevel(
					Enchantments.PROTECTION, (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))))) != 0)) || (((EnchantmentHelper.getEnchantmentLevel(
					Enchantments.FIRE_PROTECTION, (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))))) != 0) || ((EnchantmentHelper.getEnchantmentLevel(
					Enchantments.FEATHER_FALLING, (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))))) != 0))) || ((((EnchantmentHelper.getEnchantmentLevel(
					Enchantments.BLAST_PROTECTION, (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))))) != 0) || ((EnchantmentHelper.getEnchantmentLevel(
					Enchantments.PROJECTILE_PROTECTION, (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))))) != 0)) || (((EnchantmentHelper.getEnchantmentLevel(
					Enchantments.RESPIRATION, (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))))) != 0) || ((EnchantmentHelper.getEnchantmentLevel(
					Enchantments.AQUA_AFFINITY, (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))))) != 0)))) || (((((EnchantmentHelper.getEnchantmentLevel(
					Enchantments.THORNS, (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))))) != 0) || ((EnchantmentHelper.getEnchantmentLevel(
					Enchantments.DEPTH_STRIDER, (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))))) != 0)) || (((EnchantmentHelper.getEnchantmentLevel(
					Enchantments.FROST_WALKER, (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))))) != 0) || ((EnchantmentHelper.getEnchantmentLevel(
					Enchantments.BINDING_CURSE, (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))))) != 0))) || ((((EnchantmentHelper.getEnchantmentLevel(
					Enchantments.SHARPNESS, (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))))) != 0) || ((EnchantmentHelper.getEnchantmentLevel(
					Enchantments.SMITE, (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))))) != 0)) || (((EnchantmentHelper.getEnchantmentLevel(
					Enchantments.BANE_OF_ARTHROPODS, (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))))) != 0) || ((EnchantmentHelper.getEnchantmentLevel(
					Enchantments.KNOCKBACK, (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))))) != 0))))) || ((((((EnchantmentHelper.getEnchantmentLevel(
					Enchantments.FIRE_ASPECT, (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))))) != 0) || ((EnchantmentHelper.getEnchantmentLevel(
					Enchantments.LOOTING, (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))))) != 0)) || (((EnchantmentHelper.getEnchantmentLevel(
					Enchantments.SWEEPING, (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))))) != 0) || ((EnchantmentHelper.getEnchantmentLevel(
					Enchantments.EFFICIENCY, (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))))) != 0))) || ((((EnchantmentHelper.getEnchantmentLevel(
					Enchantments.SILK_TOUCH, (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))))) != 0) || ((EnchantmentHelper.getEnchantmentLevel(
					Enchantments.UNBREAKING, (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))))) != 0)) || (((EnchantmentHelper.getEnchantmentLevel(
					Enchantments.FORTUNE, (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))))) != 0) || ((EnchantmentHelper.getEnchantmentLevel(
					Enchantments.POWER, (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))))) != 0)))) || (((((EnchantmentHelper.getEnchantmentLevel(
					Enchantments.PUNCH, (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))))) != 0) || ((EnchantmentHelper.getEnchantmentLevel(
					Enchantments.FLAME, (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))))) != 0)) || (((EnchantmentHelper.getEnchantmentLevel(
					Enchantments.INFINITY, (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))))) != 0) || ((EnchantmentHelper.getEnchantmentLevel(
					Enchantments.LUCK_OF_THE_SEA, (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))))) != 0))) || (((EnchantmentHelper.getEnchantmentLevel(
					Enchantments.LURE, (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))))) != 0) || ((EnchantmentHelper.getEnchantmentLevel(
					Enchantments.MENDING, (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))))) != 0)))))) {
				if (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Items.BOOK, (int) (1)).getItem())) {
					{
						java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
						$_dependencies.put("x", x);
						$_dependencies.put("y", y);
						$_dependencies.put("z", z);
						$_dependencies.put("world", world);
						MCreatorDecomposerUncrafting.executeProcedure($_dependencies);
					}
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv != null && (inv instanceof TileEntityLockableLoot))
							((TileEntityLockableLoot) inv).setInventorySlotContents((int) (1), new ItemStack(Items.ENCHANTED_BOOK, (int) (1)));
					}
				}
			} else {
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					MCreatorDecomposerUncrafting.executeProcedure($_dependencies);
				}
			}
		}
	}
}
