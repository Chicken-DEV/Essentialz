package net.thesleepyowl.essentialz.util;

import org.bukkit.ChatColor;

public class Formatting {

    public static String color(String input) {
        return ChatColor.translateAlternateColorCodes('&', input);
    }
}
