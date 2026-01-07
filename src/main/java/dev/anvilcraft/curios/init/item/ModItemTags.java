package dev.anvilcraft.curios.init.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {
    public static final TagKey<Item> CURIOS_HEAD = bindCurios("head");
    public static final TagKey<Item> CURIOS_IONOCRAFT_BACKPACK = bindCurios("ionocraft_backpack");
    public static final TagKey<Item> CURIOS_CHARM = bindCurios("charm");

    public static TagKey<Item> bindCurios(String id) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("curios", id));
    }
}
