package org.example;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginDescriptionFile;

import static org.bukkit.Bukkit.getLogger;

public class Main extends JavaPlugin {

    private static String pluginName;
    private static String currentVersion;

    @Override
    public void onEnable() {
        PluginDescriptionFile pdf = this.getDescription();
        pluginName = pdf.getName();
        currentVersion = pdf.getVersion();

        getLogger().info(String.format("[%s] v%s Enabled.", pluginName, currentVersion));

        // Initialization logic (e.g., register listeners, commands)
    }

    @Override
    public void onDisable() {
        getLogger().info(String.format("[%s] v%s Disabled.", pluginName, currentVersion));

        // Cleanup logic (e.g., save data, unregister listeners)
    }
}