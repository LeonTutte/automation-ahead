package de.ltutte.automationahead.items;

import de.ltutte.automationahead.AutomationAhead;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Items {
	// Create a Deferred Register to hold Items which will all be registered under the namespace
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AutomationAhead.MODID);
    
    public static final DeferredItem<Item> COPPER_TUBE = ITEMS.register("copper_tube",
            () -> new Item(new Item.Properties()));
}
