package org.shulng.antiCheatPlugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.shulng.antiCheatPlugin.move.Fly;

import cn.handyplus.lib.adapter.HandySchedulerUtil;

public final class AntiCheatPlugin extends JavaPlugin implements @NotNull Listener {
    private Fly Fly;

    @Override
    public void onEnable() {
        // Plugin startup logic
        HandySchedulerUtil.init(this);
        Fly = new Fly();
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("\033[38;2;60;255;0mAntiCheatPlugin 插件已启用!\033[0m");

    }

    @EventHandler
    public void onPlayerToggleFlight(PlayerToggleFlightEvent event) {
        if (event.isFlying()) {
            Fly.cancelFlight(event.getPlayer());
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("\033[38;2;255;60;0mAntiCheatPlugin 插件已禁用!\033[0m");
    }
}
