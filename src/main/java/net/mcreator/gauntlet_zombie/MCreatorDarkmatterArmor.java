package net.mcreator.gauntlet_zombie;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@Elementsgauntlet_zombie.ModElement.Tag
public class MCreatorDarkmatterArmor extends Elementsgauntlet_zombie.ModElement {
	@GameRegistry.ObjectHolder("gauntlet_zombie:darkmatterarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("gauntlet_zombie:darkmatterarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("gauntlet_zombie:darkmatterarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("gauntlet_zombie:darkmatterarmorboots")
	public static final Item boots = null;

	public MCreatorDarkmatterArmor(Elementsgauntlet_zombie instance) {
		super(instance, 79);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("DARKMATTERARMOR", "gauntlet_zombie:darkmatter", 90, new int[]{6, 9, 11, 6}, 50,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_iron")), 4f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("darkmatterarmorhelmet")
				.setRegistryName("darkmatterarmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("darkmatterarmorbody")
				.setRegistryName("darkmatterarmorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("darkmatterarmorlegs")
				.setRegistryName("darkmatterarmorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("darkmatterarmorboots")
				.setRegistryName("darkmatterarmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("gauntlet_zombie:darkmatterarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("gauntlet_zombie:darkmatterarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("gauntlet_zombie:darkmatterarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("gauntlet_zombie:darkmatterarmorboots", "inventory"));
	}
}
