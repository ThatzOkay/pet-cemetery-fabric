package com.teamabnormals.pet_cemetery.core.other;

import com.teamabnormals.pet_cemetery.core.other.tags.PCEntityTypeTags;
import com.teamabnormals.pet_cemetery.core.registry.PCItems;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.entity.animal.Parrot;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.item.ItemStack;

public class PCEvents {

    public static void register() {
        ServerLivingEntityEvents.AFTER_DEATH.register(((entity, damageSource) -> {
            EntityType<?> type = entity.getType();

            if (type.is(PCEntityTypeTags.DROPS_PET_COLLAR)) {
                ItemStack collar = new ItemStack(PCItems.PET_COLLAR.get());
                CompoundTag tag = collar.getOrCreateTag();

                //tag.putString(PCUtil.PET_ID, FabricReg.ENTITY_TYPES.getKey(type).toString());
                tag.putBoolean(PCUtil.IS_CHILD, entity.isBaby());
                if (entity.hasCustomName()) {
                    collar.setHoverName(entity.getCustomName());
                }

                if (entity instanceof TamableAnimal pet && pet.isTame()) {
                    tag.putString(PCUtil.OWNER_ID, pet.getOwnerUUID().toString());
                    if (entity instanceof Wolf wolf) {
                        tag.putInt(PCUtil.COLLAR_COLOR, wolf.getCollarColor().getId());
                    } else if (entity instanceof Cat cat) {
                        String variant = cat.level().registryAccess().registry(Registries.CAT_VARIANT).get().getKey(cat.getVariant()).toString();
                        tag.putString(PCUtil.PET_VARIANT, variant);
                        tag.putInt(PCUtil.COLLAR_COLOR, cat.getCollarColor().getId());
                    } else if (entity instanceof Parrot parrot) {
                        tag.putInt(PCUtil.PET_VARIANT, parrot.getVariant().getId());
                    }

                    entity.spawnAtLocation(collar);
                }
            }
        }));
    }
}
