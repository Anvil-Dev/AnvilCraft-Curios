package dev.anvilcraft.curios.event;

import dev.dubhe.anvilcraft.api.event.CheckIntegrationLoadedEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import top.theillusivec4.curios.CuriosConstants;

@EventBusSubscriber
public class CheckIntegrationLoadedEventListener {
    @SubscribeEvent
    public static void onHasGuide(CheckIntegrationLoadedEvent event) {
        if (event.getId().equals(CuriosConstants.MOD_ID)) {
            event.setLoaded();
        }
    }
}
