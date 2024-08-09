package org.shulng.antiCheatPlugin.move;

import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.Listener;

public class fly implements Listener {
    public void onPlayerMove(PlayerMoveEvent event) {
        var player = event.getPlayer();
        var newLocation = event.getTo();
        var oldLocation = event.getFrom();
        if (newLocation.getX() != oldLocation.getX() || newLocation.getY() != oldLocation.getY() || newLocation.getZ() != oldLocation.getZ()) {
            System.out.println(player.getX() + "," + player.getY() + "," + player.getZ());
        }
    }
}
