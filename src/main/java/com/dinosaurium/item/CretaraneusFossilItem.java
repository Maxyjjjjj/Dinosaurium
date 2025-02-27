
package com.dinosaurium.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CretaraneusFossilItem extends Item {
	public CretaraneusFossilItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
