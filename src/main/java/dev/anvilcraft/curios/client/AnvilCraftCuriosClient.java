package dev.anvilcraft.curios.client;

import dev.anvilcraft.curios.AnvilCraftCurios;
import dev.anvilcraft.curios.renderer.GogglesCurioRenderer;
import dev.anvilcraft.curios.renderer.IonocraftBackpackCurioRenderer;
import dev.dubhe.anvilcraft.init.item.ModItems;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

@Mod(value = AnvilCraftCurios.MOD_ID, dist = Dist.CLIENT)
public class AnvilCraftCuriosClient {
    public AnvilCraftCuriosClient(IEventBus modBus, ModContainer container) {
        modBus.addListener(this::onClientSetup);
    }

    public void onClientSetup(FMLClientSetupEvent event) {
        CuriosRendererRegistry.register(ModItems.ANVIL_HAMMER.get(), GogglesCurioRenderer::new);
        CuriosRendererRegistry.register(ModItems.ROYAL_ANVIL_HAMMER.get(), GogglesCurioRenderer::new);
        CuriosRendererRegistry.register(ModItems.FROST_ANVIL_HAMMER.get(), GogglesCurioRenderer::new);
        CuriosRendererRegistry.register(ModItems.EMBER_ANVIL_HAMMER.get(), GogglesCurioRenderer::new);
        CuriosRendererRegistry.register(ModItems.TRANSCENDENCE_ANVIL_HAMMER.get(), GogglesCurioRenderer::new);
        CuriosRendererRegistry.register(ModItems.IONOCRAFT_BACKPACK.get(), IonocraftBackpackCurioRenderer::new);
    }
}
