
package com.dinosaurium.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class HalszkaraptorDNAItem extends Item {
	public HalszkaraptorDNAItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
