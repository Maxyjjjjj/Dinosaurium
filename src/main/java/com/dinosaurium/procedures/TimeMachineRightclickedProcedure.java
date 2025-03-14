package com.dinosaurium.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

import com.dinosaurium.init.DinosauriumModItems;
import com.dinosaurium.DinosauriumMod;

@EventBusSubscriber
public class TimeMachineRightclickedProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DinosauriumModItems.TIME_MACHINE.get()) {
			DinosauriumMod.queueServerWork(20, () -> {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("3"), false);
				DinosauriumMod.queueServerWork(20, () -> {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("2"), false);
					DinosauriumMod.queueServerWork(20, () -> {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("1"), false);
						DinosauriumMod.queueServerWork(20, () -> {
							if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
								ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("dinosaurium:mesozoic"));
								if (_player.level().dimension() == destinationType)
									return;
								ServerLevel nextLevel = _player.server.getLevel(destinationType);
								if (nextLevel != null) {
									_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
									_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
									_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
									for (MobEffectInstance _effectinstance : _player.getActiveEffects())
										_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance, false));
									_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
								}
							}
						});
					});
				});
			});
		}
	}
}
