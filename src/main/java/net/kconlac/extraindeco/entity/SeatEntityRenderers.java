package net.kconlac.extraindeco.entity;

import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.client.renderer.entity.NoopRenderer;

import net.kconlac.extraindeco.ExtraindecoMod;

@Mod.EventBusSubscriber(modid = ExtraindecoMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SeatEntityRenderers {
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ExtraindecoModEntities.SEAT, NoopRenderer::new);
	}
}
