package org.shulng.antiCheatPlugin;

import org.bukkit.plugin.java.JavaPlugin;

import cn.handyplus.lib.adapter.HandySchedulerUtil;

public final class AntiCheatPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        HandySchedulerUtil.init(this);
        getLogger().info("AntiCheatPlugin 插件已启用!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("AntiCheatPlugin 插件已禁用!");
    }
}
