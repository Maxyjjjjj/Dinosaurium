
package com.dinosaurium.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ParapuzosiaDNAItem extends Item {
	public ParapuzosiaDNAItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
