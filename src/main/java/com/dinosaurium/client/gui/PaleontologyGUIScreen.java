package com.dinosaurium.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

import com.dinosaurium.world.inventory.PaleontologyGUIMenu;
import com.dinosaurium.network.PaleontologyGUIButtonMessage;

public class PaleontologyGUIScreen extends AbstractContainerScreen<PaleontologyGUIMenu> {
	private final static HashMap<String, Object> guistate = PaleontologyGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_investigate;

	public PaleontologyGUIScreen(PaleontologyGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("dinosaurium:textures/screens/paleontology_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.dinosaurium.paleontology_gui.label_palaeontology_table"), 7, 7, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dinosaurium.paleontology_gui.label_inventory"), 7, 72, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_investigate = Button.builder(Component.translatable("gui.dinosaurium.paleontology_gui.button_investigate"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new PaleontologyGUIButtonMessage(0, x, y, z));
				PaleontologyGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 60, this.topPos + 52, 55, 20).build();
		guistate.put("button:button_investigate", button_investigate);
		this.addRenderableWidget(button_investigate);
	}
}
