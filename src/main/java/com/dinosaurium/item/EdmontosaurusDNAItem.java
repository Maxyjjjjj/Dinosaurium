
package com.dinosaurium.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EdmontosaurusDNAItem extends Item {
	public EdmontosaurusDNAItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
