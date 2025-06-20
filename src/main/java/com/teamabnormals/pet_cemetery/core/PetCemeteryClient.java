package com.teamabnormals.pet_cemetery.core;

import com.teamabnormals.pet_cemetery.client.renderer.entity.UndeadParrotRenderer;
import com.teamabnormals.pet_cemetery.client.renderer.entity.UndeadCatRenderer;
import com.teamabnormals.pet_cemetery.client.renderer.entity.UndeadWolfRenderer;
import com.teamabnormals.pet_cemetery.client.renderer.entity.layers.UndeadParrotOnShoulderLayer;
import com.teamabnormals.pet_cemetery.common.item.PetCollarItem;
import com.teamabnormals.pet_cemetery.core.registry.PCEntityTypes;
import com.teamabnormals.pet_cemetery.core.registry.PCItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRendererRegistrationCallback;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;


public class PetCemeteryClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(PCEntityTypes.ZOMBIE_WOLF.get(), UndeadWolfRenderer::new);
        EntityRendererRegistry.register(PCEntityTypes.ZOMBIE_CAT.get(), UndeadCatRenderer::new);
        EntityRendererRegistry.register(PCEntityTypes.ZOMBIE_PARROT.get(), UndeadParrotRenderer::new);
        EntityRendererRegistry.register(PCEntityTypes.SKELETON_WOLF.get(), UndeadWolfRenderer::new);
        EntityRendererRegistry.register(PCEntityTypes.SKELETON_CAT.get(), UndeadCatRenderer::new);
        EntityRendererRegistry.register(PCEntityTypes.SKELETON_PARROT.get(), UndeadParrotRenderer::new);

        ColorProviderRegistry.ITEM.register(
                (stack, tintIndex) -> tintIndex > 0 ? -1 : ((PetCollarItem) stack.getItem()).getColor(stack),
                PCItems.PET_COLLAR.get()
        );

        LivingEntityFeatureRendererRegistrationCallback.EVENT.register((entityType, entityRenderer, registrationHelper, context) -> {
            if (entityRenderer instanceof PlayerRenderer renderer) {
                registrationHelper.register(new UndeadParrotOnShoulderLayer<>(renderer, context.getModelSet()));
            }
        });

    }
}
