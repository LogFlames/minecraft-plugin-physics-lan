package dev.physics.lasse;

import org.bukkit.plugin.java.JavaPlugin;
public class Lasse extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Hello, SpigotMC!");
    }
    @Override
    public void onDisable() {
        getLogger().info("See you again, SpigotMC!");
    }
}