package org.shulng.antiCheatPlugin;

import cn.handyplus.lib.adapter.HandySchedulerUtil;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiCheatPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        HandySchedulerUtil.init(this);
        getLogger().info("\u00a7k\u00a7a$\u00a7rAntiCheatPlugin running...");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("\u00a7k\u00a7c$\u00a7rAntiCheatPlugin is disable");
    }
}
