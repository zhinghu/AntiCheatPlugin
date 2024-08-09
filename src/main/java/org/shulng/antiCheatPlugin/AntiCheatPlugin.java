package org.shulng.antiCheatPlugin;

import cn.handyplus.lib.adapter.HandySchedulerUtil;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiCheatPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        HandySchedulerUtil.init(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
