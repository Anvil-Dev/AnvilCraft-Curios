package dev.anvilcraft.curios.event;

import dev.dubhe.anvilcraft.api.event.AmuletEvent;
import dev.dubhe.anvilcraft.init.item.ModItemTags;
import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.SlotResult;

import java.util.List;

@EventBusSubscriber
public class AmuletEventListener {
    @SubscribeEvent
    public static void findFromCurios(AmuletEvent.Find event) {
        Player player = event.getPlayer();
        if (CuriosApi.getCuriosInventory(player).isPresent()) {
            List<SlotResult> results = CuriosApi.getCuriosInventory(player).get()
                .findCurios(stack -> stack.is(ModItemTags.AMULET));
            for (SlotResult result : results) {
                event.provide(result.stack());
            }
        }
    }
}
