package net.mcreator.gauntlet_zombie;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.world.BossInfoServer;
import net.minecraft.world.BossInfo;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.model.ModelBiped;

import java.util.Random;

@Elementsgauntlet_zombie.ModElement.Tag
public class MCreatorNull extends Elementsgauntlet_zombie.ModElement {
	public static final int ENTITYID = 11;
	public static final int ENTITYID_RANGED = 12;

	public MCreatorNull(Elementsgauntlet_zombie instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class)
				.id(new ResourceLocation("gauntlet_zombie", "null"), ENTITYID).name("null").tracker(64, 1, true).egg(-16777216, -1).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		Biome[] spawnBiomes = {Biome.REGISTRY.getObject(new ResourceLocation("plains")), Biome.REGISTRY.getObject(new ResourceLocation("desert")),
				Biome.REGISTRY.getObject(new ResourceLocation("extreme_hills")), Biome.REGISTRY.getObject(new ResourceLocation("forest")),
				Biome.REGISTRY.getObject(new ResourceLocation("taiga")), Biome.REGISTRY.getObject(new ResourceLocation("swampland")),
				Biome.REGISTRY.getObject(new ResourceLocation("hell")), Biome.REGISTRY.getObject(new ResourceLocation("ice_flats")),
				Biome.REGISTRY.getObject(new ResourceLocation("ice_mountains")), Biome.REGISTRY.getObject(new ResourceLocation("mushroom_island")),
				Biome.REGISTRY.getObject(new ResourceLocation("mushroom_island_shore")), Biome.REGISTRY.getObject(new ResourceLocation("beaches")),
				Biome.REGISTRY.getObject(new ResourceLocation("desert_hills")), Biome.REGISTRY.getObject(new ResourceLocation("forest_hills")),
				Biome.REGISTRY.getObject(new ResourceLocation("taiga_hills")),
				Biome.REGISTRY.getObject(new ResourceLocation("smaller_extreme_hills")), Biome.REGISTRY.getObject(new ResourceLocation("jungle")),
				Biome.REGISTRY.getObject(new ResourceLocation("jungle_hills")), Biome.REGISTRY.getObject(new ResourceLocation("jungle_edge")),
				Biome.REGISTRY.getObject(new ResourceLocation("stone_beach")), Biome.REGISTRY.getObject(new ResourceLocation("cold_beach")),
				Biome.REGISTRY.getObject(new ResourceLocation("birch_forest")), Biome.REGISTRY.getObject(new ResourceLocation("birch_forest_hills")),
				Biome.REGISTRY.getObject(new ResourceLocation("roofed_forest")), Biome.REGISTRY.getObject(new ResourceLocation("taiga_cold")),
				Biome.REGISTRY.getObject(new ResourceLocation("taiga_cold_hills")), Biome.REGISTRY.getObject(new ResourceLocation("redwood_taiga")),
				Biome.REGISTRY.getObject(new ResourceLocation("redwood_taiga_hills")),
				Biome.REGISTRY.getObject(new ResourceLocation("extreme_hills_with_trees")),
				Biome.REGISTRY.getObject(new ResourceLocation("savanna")), Biome.REGISTRY.getObject(new ResourceLocation("savanna_rock")),
				Biome.REGISTRY.getObject(new ResourceLocation("mesa")), Biome.REGISTRY.getObject(new ResourceLocation("mesa_rock")),
				Biome.REGISTRY.getObject(new ResourceLocation("mesa_clear_rock")),};
		EntityRegistry.addSpawn(EntityCustom.class, 1, 1, 1, EnumCreatureType.MONSTER, spawnBiomes);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
			RenderBiped customRender = new RenderBiped(renderManager, new ModelBiped(), 0.5f) {
				protected ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("gauntlet_zombie:textures/null.png");
				}
			};
			customRender.addLayer(new net.minecraft.client.renderer.entity.layers.LayerBipedArmor(customRender) {
				protected void initArmor() {
					this.modelLeggings = new ModelBiped(0.5f);
					this.modelArmor = new ModelBiped(1);
				}
			});
			return customRender;
		});
	}

	public static class EntityCustom extends EntityMob {
		public EntityCustom(World world) {
			super(world);
			setSize(0.6f, 1.8f);
			experienceValue = 100;
			this.isImmuneToFire = true;
			setNoAI(!true);
			setCustomNameTag("Null");
			setAlwaysRenderNameTag(true);
			this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
			this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayerMP.class, true, true));
			this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true, true));
			this.tasks.addTask(4, new EntityAIAttackMelee(this, 1.2, true));
			this.tasks.addTask(5, new EntityAIWander(this, 1));
			this.tasks.addTask(6, new EntityAILookIdle(this));
			this.tasks.addTask(7, new EntityAISwimming(this));
			this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(MCreatorNullSword.block, (int) (1)));
		}

		@Override
		public EnumCreatureAttribute getCreatureAttribute() {
			return EnumCreatureAttribute.UNDEFINED;
		}

		@Override
		protected Item getDropItem() {
			return new ItemStack(MCreatorTheVoid.block, (int) (1)).getItem();
		}

		@Override
		public net.minecraft.util.SoundEvent getAmbientSound() {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.blaze.ambient"));
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.blaze.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.blaze.death"));
		}

		@Override
		protected float getSoundVolume() {
			return 1.0F;
		}

		@Override
		public boolean attackEntityFrom(DamageSource source, float amount) {
			int x = (int) this.posX;
			int y = (int) this.posY;
			int z = (int) this.posZ;
			Entity entity = this;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				MCreatorNullEntityIsHurt.executeProcedure($_dependencies);
			}
			if (source == DamageSource.FALL)
				return false;
			if (source == DamageSource.CACTUS)
				return false;
			if (source == DamageSource.DROWN)
				return false;
			if (source == DamageSource.LIGHTNING_BOLT)
				return false;
			return super.attackEntityFrom(source, amount);
		}

		@Override
		public void onEntityUpdate() {
			super.onEntityUpdate();
			int x = (int) this.posX;
			int y = (int) this.posY;
			int z = (int) this.posZ;
			Entity entity = this;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				MCreatorNullOnEntityTickUpdate.executeProcedure($_dependencies);
			}
		}

		@Override
		public void onCollideWithPlayer(EntityPlayer entity) {
			super.onCollideWithPlayer(entity);
			int x = (int) this.posX;
			int y = (int) this.posY;
			int z = (int) this.posZ;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				MCreatorNullEntityIsHurt.executeProcedure($_dependencies);
			}
		}

		@Override
		protected void applyEntityAttributes() {
			super.applyEntityAttributes();
			if (this.getEntityAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(375D);
			if (this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(1D);
		}

		@Override
		public boolean isNonBoss() {
			return false;
		}
		private final BossInfoServer bossInfo = new BossInfoServer(this.getDisplayName(), BossInfo.Color.WHITE, BossInfo.Overlay.NOTCHED_20);

		@Override
		public void addTrackingPlayer(EntityPlayerMP player) {
			super.addTrackingPlayer(player);
			this.bossInfo.addPlayer(player);
		}

		@Override
		public void removeTrackingPlayer(EntityPlayerMP player) {
			super.removeTrackingPlayer(player);
			this.bossInfo.removePlayer(player);
		}

		@Override
		public void onUpdate() {
			super.onUpdate();
			this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());
		}

		public void onLivingUpdate() {
			super.onLivingUpdate();
			int i = (int) this.posX;
			int j = (int) this.posY;
			int k = (int) this.posZ;
			Random random = this.rand;
			if (true)
				for (int l = 0; l < 4; ++l) {
					double d0 = (i + 0.5) + (random.nextFloat() - 0.5) * 0.1D * 20;
					double d1 = ((j + 0.7) + (random.nextFloat() - 0.5) * 0.1D) + 0.5;
					double d2 = (k + 0.5) + (random.nextFloat() - 0.5) * 0.1D * 20;
					world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 - 0.27, d1 + 0.22, d2, 0, 0, 0);
				}
		}
	}
}
