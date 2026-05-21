package dev.anvilcraft.curios.data.tag;

import dev.anvilcraft.lib.v2.registrum.providers.RegistrumTagsProvider;
import dev.dubhe.anvilcraft.init.item.ModItemTags;
import dev.dubhe.anvilcraft.init.item.ModItems;
import net.minecraft.world.item.Item;

public class AddonItemTagsHandler {
    public static void init(RegistrumTagsProvider<Item> provider) {
        provider.addTag(ModItemTags.CURIOS_HEAD)
            .replace(false)
            .addOptionalTag(ModItemTags.ANVIL_HAMMER);
        provider.addTag(ModItemTags.CURIOS_CHARM)
            .replace(false)
            .addOptionalTag(ModItemTags.AMULET);
        provider.addTag(ModItemTags.CURIOS_IONOCRAFT_BACKPACK)
            .replace(false)
            .add(ModItems.IONOCRAFT_BACKPACK.getKey());
    }
}
