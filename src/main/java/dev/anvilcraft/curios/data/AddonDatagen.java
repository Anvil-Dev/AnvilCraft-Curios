package dev.anvilcraft.curios.data;

import dev.anvilcraft.lib.v2.registrum.providers.ProviderType;
import dev.anvilcraft.curios.AnvilCraftCurios;
import dev.anvilcraft.curios.data.lang.AddonLangHandler;
import dev.anvilcraft.curios.data.tag.AddonItemTagsHandler;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

import static dev.anvilcraft.curios.AnvilCraftCurios.REGISTRATE;

@EventBusSubscriber(modid = AnvilCraftCurios.MOD_ID)
public class AddonDatagen {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        PackOutput packOutput = generator.getPackOutput();

        generator.addProvider(event.includeServer(), new ModCuriosProvider(packOutput, existingFileHelper, lookupProvider));
    }

    /**
     * 初始化生成器
     */
    public static void init() {
        REGISTRATE.addDataGenerator(ProviderType.LANG, AddonLangHandler::init);
        REGISTRATE.addDataGenerator(ProviderType.ITEM_TAGS, AddonItemTagsHandler::init);
    }
}
