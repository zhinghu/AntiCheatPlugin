package org.shulng.antiCheatPlugin;

import org.bukkit.plugin.java.JavaPlugin;

import cn.handyplus.lib.adapter.HandySchedulerUtil;

public final class AntiCheatPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        HandySchedulerUtil.init(this);
        getLogger().info("\033[38;2;60;255;0mAntiCheatPlugin 插件已启用!\033[0m");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("\033[38;2;255;60;0mAntiCheatPlugin 插件已禁用!\033[0m");
    }
}
