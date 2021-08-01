/*
Class Name : Cooldown
From Package : fr.qjwin.qj_customitems
Made by : QJWIN
*/
package fr.qjwin.qj_customitems;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class Cooldown {

    public static HashMap<UUID, Double> cooldowns_grappin;
    public static HashMap<UUID, Double> cooldowns_teleportsword;

    public static void setupCooldown_grappling(){
        cooldowns_grappin = new HashMap<>();
    }
    public static void setupCooldown_teleportsword(){
        cooldowns_teleportsword = new HashMap<>();
    }

    public static void setCooldown_grappling(Player player, int seconds) {
        double delay = System.currentTimeMillis() + (seconds * 1000L);
        cooldowns_grappin.put(player.getUniqueId(), delay);
    }
    public static void setCooldown_teleportsword(Player player, int seconds) {
        double delay = System.currentTimeMillis() + (seconds * 1000L);
        cooldowns_grappin.put(player.getUniqueId(), delay);
    }

    public static boolean checkCooldown_grappling(Player player) {
        return !cooldowns_grappin.containsKey(player.getUniqueId()) || cooldowns_grappin.get(player.getUniqueId()) <= System.currentTimeMillis();
    }
    public static boolean checkCooldown_teleportsword(Player player) {
        return !cooldowns_grappin.containsKey(player.getUniqueId()) || cooldowns_grappin.get(player.getUniqueId()) <= System.currentTimeMillis();
    }

}













