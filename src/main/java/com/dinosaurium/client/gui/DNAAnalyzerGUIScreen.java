package com.dinosaurium.client.gui;

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

import com.dinosaurium.world.inventory.DNAAnalyzerGUIMenu;

public class DNAAnalyzerGUIScreen extends AbstractContainerScreen<DNAAnalyzerGUIMenu> {
	private final static HashMap<String, Object> guistate = DNAAnalyzerGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_analyze;

	public DNAAnalyzerGUIScreen(DNAAnalyzerGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("dinosaurium:textures/screens/dna_analyzer_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.dinosaurium.dna_analyzer_gui.label_dna_analyzer"), 6, 6, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dinosaurium.dna_analyzer_gui.label_inventory"), 7, 72, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_analyze = Button.builder(Component.translatable("gui.dinosaurium.dna_analyzer_gui.button_analyze"), e -> {
		}).bounds(this.leftPos + 61, this.topPos + 32, 54, 20).build();
		guistate.put("button:button_analyze", button_analyze);
		this.addRenderableWidget(button_analyze);
	}
}
