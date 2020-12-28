package net.mcreator.gauntlet_zombie;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

@Elementsgauntlet_zombie.ModElement.Tag
public class MCreatorNullOnEntityTickUpdate extends Elementsgauntlet_zombie.ModElement {
	public MCreatorNullOnEntityTickUpdate(Elementsgauntlet_zombie instance) {
		super(instance, 69);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorNullOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorNullOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorNullOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorNullOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorNullOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double RandomAttack = 0;
		double TeleportChance = 0;
		if ((entity.getEntityData().getBoolean("attackMode"))) {
			RandomAttack = (double) (Math.random() * 2);
			TeleportChance = (double) (Math.random() * 20);
			if ((((RandomAttack) == 0) && (((entity.getEntityData().getDouble("blindnessCooldown")) <= 0) && ((entity.getEntityData()
					.getDouble("attackCooldown")) <= 0)))) {
				if (!world.isRemote && world.getMinecraftServer() != null) {
					world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
						@Override
						public String getName() {
							return "";
						}

						@Override
						public boolean canUseCommand(int permission, String command) {
							return true;
						}

						@Override
						public World getEntityWorld() {
							return world;
						}

						@Override
						public MinecraftServer getServer() {
							return world.getMinecraftServer();
						}

						@Override
						public boolean sendCommandFeedback() {
							return false;
						}

						@Override
						public BlockPos getPosition() {
							return new BlockPos((int) x, (int) y, (int) z);
						}

						@Override
						public Vec3d getPositionVector() {
							return new Vec3d(x, y, z);
						}
					}, "effect @a[r=50] blindness 30");
				}
				entity.getEntityData().setDouble("blindnessCooldown", 200);
				entity.getEntityData().setDouble("attackCooldown", 80);
			} else if ((((RandomAttack) == 1) && (((entity.getEntityData().getDouble("healCooldown")) <= 0) && ((entity.getEntityData()
					.getDouble("attackCooldown")) <= 0)))) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, (int) 0, (int) 3, (false), (false)));
				entity.getEntityData().setDouble("healCooldown", 300);
				entity.getEntityData().setDouble("attackCooldown", 80);
			} else if ((((RandomAttack) == 2) && (((entity.getEntityData().getDouble("decoyCooldown")) <= 0) && ((entity.getEntityData()
					.getDouble("attackCooldown")) <= 0)))) {
				entity.getEntityData().setDouble("decoyCooldown", 250);
				entity.getEntityData().setDouble("attackCooldown", 80);
			}
			if ((((TeleportChance) == 0) && ((entity.getEntityData().getDouble("teleportCooldown")) <= 0))) {
				if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
					entity.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
						@Override
						public String getName() {
							return "";
						}

						@Override
						public boolean canUseCommand(int permission, String command) {
							return true;
						}

						@Override
						public World getEntityWorld() {
							return entity.world;
						}

						@Override
						public MinecraftServer getServer() {
							return entity.world.getMinecraftServer();
						}

						@Override
						public boolean sendCommandFeedback() {
							return false;
						}

						@Override
						public BlockPos getPosition() {
							return entity.getPosition();
						}

						@Override
						public Vec3d getPositionVector() {
							return new Vec3d(entity.posX, entity.posY, entity.posZ);
						}

						@Override
						public Entity getCommandSenderEntity() {
							return entity;
						}
					}, "tp @s @r[r=50]");
				}
			}
			entity.getEntityData().setDouble("blindnessCooldown", ((entity.getEntityData().getDouble("blindnessCooldown")) - 1));
			entity.getEntityData().setDouble("healCooldown", ((entity.getEntityData().getDouble("healCooldown")) - 1));
			entity.getEntityData().setDouble("decoyCooldown", ((entity.getEntityData().getDouble("decoyCooldown")) - 1));
			entity.getEntityData().setDouble("teleportCooldown", ((entity.getEntityData().getDouble("teleportCooldown")) - 1));
			entity.getEntityData().setDouble("attackCooldown", ((entity.getEntityData().getDouble("attackCooldown")) - 1));
		}
	}
}
