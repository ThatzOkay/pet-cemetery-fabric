package com.teamabnormals.pet_cemetery.core.registry;

import com.teamabnormals.pet_cemetery.common.entity.*;
import com.teamabnormals.pet_cemetery.core.PetCemetery;
import com.tterrag.registrate.util.entry.EntityEntry;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class PCEntityTypes {
//	public static final EntitySubRegistryHelper HELPER = PetCemetery.REGISTRY_HELPER.getEntitySubHelper();

	public static final EntityEntry<ZombieWolf> ZOMBIE_WOLF = PetCemetery.REGISTRATE.entity("zombie_wolf", ZombieWolf::new, MobCategory.CREATURE)
			.properties(e -> e.dimensions(new EntityDimensions(0.6F, 0.85F, false)))
			.attributes(ZombieWolf::createAttributes)
			.register();
//  public static final RegistryObject<EntityType<ZombieWolf>> ZOMBIE_WOLF = HELPER.createLivingEntity("zombie_wolf", ZombieWolf::new, MobCategory.CREATURE, 0.6F, 0.85F);

	public static final EntityEntry<ZombieCat> ZOMBIE_CAT = PetCemetery.REGISTRATE.entity("zombie_cat", ZombieCat::new, MobCategory.CREATURE)
			.properties(e -> e.dimensions(new EntityDimensions(0.6F, 0.7F, false)))
			.attributes(ZombieCat::createAttributes).register();
	//public static final RegistryObject<EntityType<ZombieCat>> ZOMBIE_CAT = HELPER.createLivingEntity("zombie_cat", ZombieCat::new, MobCategory.CREATURE, 0.6F, 0.7F);

	public static final EntityEntry<ZombieParrot> ZOMBIE_PARROT = PetCemetery.REGISTRATE.entity("zombie_parrot", ZombieParrot::new, MobCategory.CREATURE)
			.properties(e -> e.dimensions(new EntityDimensions(0.5F, 0.9F, false)))
			.attributes(ZombieParrot::createAttributes).register();

	//public static final RegistryObject<EntityType<ZombieParrot>> ZOMBIE_PARROT = HELPER.createLivingEntity("zombie_parrot", ZombieParrot::new, MobCategory.CREATURE, 0.5F, 0.9F);

	public static final EntityEntry<SkeletonWolf> SKELETON_WOLF = PetCemetery.REGISTRATE.entity("skeleton_wolf", SkeletonWolf::new, MobCategory.CREATURE)
			.properties(e -> e.dimensions(new EntityDimensions(0.6F, 0.85F, false)))
			.attributes(SkeletonWolf::createAttributes).register();

	//public static final RegistryObject<EntityType<SkeletonWolf>> SKELETON_WOLF = HELPER.createLivingEntity("skeleton_wolf", SkeletonWolf::new, MobCategory.CREATURE, 0.6F, 0.85F);

	public static final EntityEntry<SkeletonCat> SKELETON_CAT = PetCemetery.REGISTRATE.entity("skeleton_cat", SkeletonCat::new, MobCategory.CREATURE)
			.properties(e -> e.dimensions(new EntityDimensions(0.6F, 0.7F, false)))
			.attributes(SkeletonCat::createAttributes).register();

	//public static final RegistryObject<EntityType<SkeletonCat>> SKELETON_CAT = HELPER.createLivingEntity("skeleton_cat", SkeletonCat::new, MobCategory.CREATURE, 0.6F, 0.7F);

	public static final EntityEntry<SkeletonParrot> SKELETON_PARROT = PetCemetery.REGISTRATE.entity("skeleton_parrot", SkeletonParrot::new, MobCategory.CREATURE)
			.properties(e -> e.dimensions(new EntityDimensions(0.6F, 0.7F, false)))
			.attributes(SkeletonParrot::createAttributes).register();

	//public static final RegistryObject<EntityType<SkeletonParrot>> SKELETON_PARROT = HELPER.createLivingEntity("skeleton_parrot", SkeletonParrot::new, MobCategory.CREATURE, 0.5F, 0.9F);

//	@SubscribeEvent
//	public static void registerAttributes(EntityAttributeCreationEvent event) {
//		event.put(ZOMBIE_WOLF.get(), ZombieWolf.createAttributes().build());
//		event.put(ZOMBIE_CAT.get(), ZombieCat.createAttributes().build());
//		event.put(ZOMBIE_PARROT.get(), ZombieParrot.createAttributes().build());
//
//		event.put(SKELETON_WOLF.get(), SkeletonWolf.createAttributes().build());
//		event.put(SKELETON_CAT.get(), SkeletonCat.createAttributes().build());
//		event.put(SKELETON_PARROT.get(), SkeletonParrot.createAttributes().build());
//	}
}