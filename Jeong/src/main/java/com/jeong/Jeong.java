package com.jeong;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Jeong extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("mpm").setExecutor(new GivePickaxe());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
