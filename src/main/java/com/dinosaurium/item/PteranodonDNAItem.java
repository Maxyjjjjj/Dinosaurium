
package com.dinosaurium.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PteranodonDNAItem extends Item {
	public PteranodonDNAItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
