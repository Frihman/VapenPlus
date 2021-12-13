package net.vapenplus.item;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vapenplus.VapenPlus;

public class ModItems {

    private static Item registerItem(String name, Item item) {

        return Registry.register(Registry.ITEM, new Identifier(VapenPlus.MOD_ID, name), item);
    }
}
