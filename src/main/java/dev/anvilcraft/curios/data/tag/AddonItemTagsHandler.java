package dev.anvilcraft.curios.data.tag;

import com.tterrag.registrate.providers.RegistrateTagsProvider;
import dev.dubhe.anvilcraft.init.item.ModItemTags;
import dev.dubhe.anvilcraft.init.item.ModItems;
import net.minecraft.world.item.Item;

public class AddonItemTagsHandler {
    public static void init(RegistrateTagsProvider<Item> provider) {
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
