
package com.dinosaurium.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BugNetItem extends Item {
	public BugNetItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
