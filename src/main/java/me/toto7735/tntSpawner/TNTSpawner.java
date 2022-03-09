package me.toto7735.tntSpawner;

import me.toto7735.tntSpawner.listener.Listener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class TNTSpawner extends JavaPlugin {

    private static TNTSpawner instance;

    @Override
    public void onEnable() {
        System.out.println("Enabled! >_<");
        instance = this;

        Bukkit.getPluginManager().registerEvents(new Listener(), this);
    }

    @Override
    public void onDisable() {
        System.out.println("Disabled! >_<");
    }

    public static TNTSpawner getInstance() {
        return instance;
    }

    
}
