package net.mcreator.gauntlet_zombie;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.biome.Biome;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.monster.EntityZombieVillager;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityVindicator;
import net.minecraft.entity.monster.EntityVex;
import net.minecraft.entity.monster.EntityStray;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntitySpellcasterIllager;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntityShulker;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityIllusionIllager;
import net.minecraft.entity.monster.EntityHusk;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityEvoker;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityElderGuardian;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityBlaze;

import java.util.Random;

@Elementsgauntlet_zombie.ModElement.Tag
public class MCreatorTheAbsence extends Elementsgauntlet_zombie.ModElement {
	@GameRegistry.ObjectHolder("gauntlet_zombie:theabsence")
	public static final BiomeGenCustom biome = null;

	public MCreatorTheAbsence(Elementsgauntlet_zombie instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
	}

	static class BiomeGenCustom extends Biome {
		public BiomeGenCustom() {
			super(new Biome.BiomeProperties("The Absence").setRainfall(0F).setBaseHeight(0.1F).setWaterColor(-16777216).setHeightVariation(0.5F)
					.setTemperature(0.5F));
			setRegistryName("theabsence");
			topBlock = MCreatorVoidRock.block.getDefaultState();
			fillerBlock = MCreatorVoidRock.block.getDefaultState();
			decorator.generateFalls = false;
			decorator.treesPerChunk = 0;
			decorator.flowersPerChunk = 0;
			decorator.grassPerChunk = 0;
			decorator.deadBushPerChunk = 0;
			decorator.mushroomsPerChunk = 0;
			decorator.bigMushroomsPerChunk = 0;
			decorator.reedsPerChunk = 0;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 0;
			decorator.gravelPatchesPerChunk = 0;
			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
			this.spawnableCreatureList.add(new SpawnListEntry(EntityBlaze.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityCaveSpider.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityCreeper.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityElderGuardian.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityEnderman.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityEndermite.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityEvoker.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityGhast.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityGuardian.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityHusk.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityIllusionIllager.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityMagmaCube.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityShulker.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntitySilverfish.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntitySkeleton.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntitySlime.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntitySpider.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityStray.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityVex.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityVindicator.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityWitch.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityWitherSkeleton.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityZombie.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityZombieVillager.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityMob.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntitySpellcasterIllager.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityIllusionIllager.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityPigZombie.class, 40, 1, 5));
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getGrassColorAtPos(BlockPos pos) {
			return -1;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getFoliageColorAtPos(BlockPos pos) {
			return -1;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getSkyColorByTemp(float currentTemperature) {
			return -16777216;
		}

		@Override
		public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
			return super.getRandomTreeFeature(rand);
		}
	}
}
