package com.teamabnormals.pet_cemetery.core.registry;

import com.teamabnormals.pet_cemetery.common.item.PetCollarItem;
import com.teamabnormals.pet_cemetery.core.PetCemetery;
import com.tterrag.registrate.fabric.RegistryObject;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.level.block.Blocks;

import static net.minecraft.world.item.CreativeModeTabs.*;
import static net.minecraft.world.item.crafting.Ingredient.of;

public class PCItems {

	public static final ItemEntry<PetCollarItem> PET_COLLAR = PetCemetery.REGISTRATE.item("pet_collar", PetCollarItem::new)
			.tab(TOOLS_AND_UTILITIES)
			.properties(p->p.stacksTo(1).fireResistant())
			.register();
//	public static final ItemEntry<SpawnEggItem> a = PetCemetery.REGISTRATE

	public static final ItemEntry<SpawnEggItem> ZOMBIE_WOLF_SPAWN_EGG = PetCemetery.REGISTRATE.item("zombie_wolf_spawn_egg", p -> new SpawnEggItem(PCEntityTypes.ZOMBIE_WOLF.get(), 0x6A9D5A, 0x364430, p))
			.tab(SPAWN_EGGS)
			.register();

//	public static final RegistryObject<ForgeSpawnEggItem> ZOMBIE_WOLF_SPAWN_EGG = HELPER.createSpawnEggItem("zombie_wolf", PCEntityTypes.ZOMBIE_WOLF::get, 0x6A9D5A, 0x364430);

	public static final ItemEntry<SpawnEggItem> ZOMBIE_CAT_SPAWN_EGG = PetCemetery.REGISTRATE.item("zombie_cat_spawn_egg", p -> new SpawnEggItem(PCEntityTypes.ZOMBIE_CAT.get(), 0x4A7D52, 0x79AD69, p))
			.tab(SPAWN_EGGS)
			.register();

//	public static final RegistryObject<ForgeSpawnEggItem> ZOMBIE_CAT_SPAWN_EGG = HELPER.createSpawnEggItem("zombie_cat", PCEntityTypes.ZOMBIE_CAT::get, 0x4A7D52, 0x79AD69);

	public static final ItemEntry<SpawnEggItem> ZOMBIE_PARROT_SPAWN_EGG = PetCemetery.REGISTRATE.item("zombie_parrot_spawn_egg", p -> new SpawnEggItem(PCEntityTypes.ZOMBIE_PARROT.get(), 0x315D39, 0x5A8D52, p))
			.tab(SPAWN_EGGS)
			.register();

//	public static final RegistryObject<ForgeSpawnEggItem> ZOMBIE_PARROT_SPAWN_EGG = HELPER.createSpawnEggItem("zombie_parrot", PCEntityTypes.ZOMBIE_PARROT::get, 0x315D39, 0x5A8D52);

	public static final ItemEntry<SpawnEggItem> SKELETON_WOLF_SPAWN_EGG = PetCemetery.REGISTRATE.item("skeleton_wolf_spawn_egg", p -> new SpawnEggItem(PCEntityTypes.SKELETON_WOLF.get(), 0x979797, 0x494949, p))
			.tab(SPAWN_EGGS)
			.register();

//	public static final RegistryObject<ForgeSpawnEggItem> SKELETON_WOLF_SPAWN_EGG = HELPER.createSpawnEggItem("skeleton_wolf", PCEntityTypes.SKELETON_WOLF::get, 0x979797, 0x494949);

	public static final ItemEntry<SpawnEggItem> SKELETON_CAT_SPAWN_EGG = PetCemetery.REGISTRATE.item("skeleton_cat_spawn_egg", p -> new SpawnEggItem(PCEntityTypes.SKELETON_CAT.get(), 0xD3D3D3, 0x979797, p))
			.tab(SPAWN_EGGS)
			.register();

//	public static final RegistryObject<ForgeSpawnEggItem> SKELETON_CAT_SPAWN_EGG = HELPER.createSpawnEggItem("skeleton_cat", PCEntityTypes.SKELETON_CAT::get, 0xD3D3D3, 0x979797);

	public static final ItemEntry<SpawnEggItem> SKELETON_PARROT_SPAWN_EGG = PetCemetery.REGISTRATE.item("skeleton_parrot_spawn_egg", p -> new SpawnEggItem(PCEntityTypes.SKELETON_PARROT.get(), 0x979797, 0xADABAD, p))
			.tab(SPAWN_EGGS)
			.register();

//	public static final RegistryObject<ForgeSpawnEggItem> SKELETON_PARROT_SPAWN_EGG = HELPER.createSpawnEggItem("skeleton_parrot", PCEntityTypes.SKELETON_PARROT::get, 0x979797, 0xADABAD);


	/*public static void setupTabEditors() {
		CreativeModeTabContentsPopulator.mod(PetCemetery.MOD_ID)
				.tab(TOOLS_AND_UTILITIES)
				.addItemsBefore(of(Items.SADDLE), PET_COLLAR)
				.tab(SPAWN_EGGS)
				.addItemsAlphabetically(is(SpawnEggItem.class), ZOMBIE_WOLF_SPAWN_EGG, ZOMBIE_CAT_SPAWN_EGG, ZOMBIE_PARROT_SPAWN_EGG, SKELETON_WOLF_SPAWN_EGG, SKELETON_CAT_SPAWN_EGG, SKELETON_PARROT_SPAWN_EGG);
	}*/
}