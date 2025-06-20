package com.teamabnormals.pet_cemetery.client.renderer.entity;

import com.teamabnormals.pet_cemetery.common.entity.ZombieParrot;
import com.teamabnormals.pet_cemetery.core.PetCemetery;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererProvider;
import net.minecraft.client.render.entity.ParrotRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Parrot;

@Environment(EnvType.CLIENT)
public class UndeadParrotRenderer extends ParrotRenderer {
	public static final ResourceLocation ZOMBIE_PARROT_TEXTURE = new ResourceLocation(PetCemetery.MOD_ID, "textures/entity/parrot/zombie_parrot.png");
	public static final ResourceLocation SKELETON_PARROT_TEXTURE = new ResourceLocation(PetCemetery.MOD_ID, "textures/entity/parrot/skeleton_parrot.png");

	public UndeadParrotRenderer(EntityRendererProvider.Context context) {
		super(context);
	}

	@Override
	public ResourceLocation getTextureLocation(Parrot entity) {
		return entity instanceof ZombieParrot ? ZOMBIE_PARROT_TEXTURE : SKELETON_PARROT_TEXTURE;
	}
}