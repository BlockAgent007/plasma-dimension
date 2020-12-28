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
public class MCreatorDarkstoneArmorArmor extends Elementsgauntlet_zombie.ModElement {
	@GameRegistry.ObjectHolder("gauntlet_zombie:darkstonearmorarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("gauntlet_zombie:darkstonearmorarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("gauntlet_zombie:darkstonearmorarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("gauntlet_zombie:darkstonearmorarmorboots")
	public static final Item boots = null;

	public MCreatorDarkstoneArmorArmor(Elementsgauntlet_zombie instance) {
		super(instance, 55);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("DARKSTONEARMORARMOR", "gauntlet_zombie:darkstonearmor", 85, new int[]{41, 41,
				41, 41}, 5,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_chain")), 4f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("darkstonearmorarmorhelmet")
				.setRegistryName("darkstonearmorarmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("darkstonearmorarmorbody")
				.setRegistryName("darkstonearmorarmorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("darkstonearmorarmorlegs")
				.setRegistryName("darkstonearmorarmorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("darkstonearmorarmorboots")
				.setRegistryName("darkstonearmorarmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("gauntlet_zombie:darkstonearmorarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("gauntlet_zombie:darkstonearmorarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("gauntlet_zombie:darkstonearmorarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("gauntlet_zombie:darkstonearmorarmorboots", "inventory"));
	}
}
