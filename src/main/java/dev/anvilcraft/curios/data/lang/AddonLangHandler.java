package dev.anvilcraft.curios.data.lang;

import dev.anvilcraft.lib.v2.registrum.providers.RegistrumLangProvider;

public class AddonLangHandler {
    /**
     * 语言文件初始化
     *
     * @param provider 提供器
     */
    public static void init(RegistrumLangProvider provider) {
        provider.add("curios.identifier.ionocraft_backpack", "Ionocraft Backpack");
    }
}
