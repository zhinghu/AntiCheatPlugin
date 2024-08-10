package org.shulng.antiCheatPlugin.move;

import org.bukkit.entity.Player;

public class Fly {

    /**
     * 检查玩家是否正在飞行。
     * @param player 要检查的玩家
     * @return 如果玩家正在飞行，返回 true；否则返回 false。
     */
    public static boolean isFlying(Player player) {
        return player.isFlying();
    }

    /**
     * 取消玩家的飞行状态。
     * @param player 要取消飞行状态的玩家
     */
    public static void cancelFlight(Player player) {
        if (isFlying(player)) {
            player.setFlying(false);
            player.setAllowFlight(false); // 确保飞行模式被关闭
            player.sendMessage("你的飞行状态已被取消。");
        }
    }
}
