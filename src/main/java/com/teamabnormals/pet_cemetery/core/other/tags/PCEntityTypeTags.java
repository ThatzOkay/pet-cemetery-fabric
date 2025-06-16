package com.teamabnormals.pet_cemetery.core.other.tags;

import com.teamabnormals.pet_cemetery.core.PetCemetery;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;

public class PCEntityTypeTags {
	public static final TagKey<EntityType<?>> DROPS_PET_COLLAR = entityTypeTag("drops_pet_collar");
	public static final TagKey<EntityType<?>> ZOMBIE_PETS = entityTypeTag("zombie_pets");
	public static final TagKey<EntityType<?>> SKELETON_PETS = entityTypeTag("skeleton_pets");

	private static TagKey<EntityType<?>> entityTypeTag(String name) {
		return TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation(PetCemetery.MOD_ID, name));
	}
}