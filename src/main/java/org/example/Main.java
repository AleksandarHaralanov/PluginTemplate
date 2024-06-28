package org.example;

import com.haralanov.utilities.PdfUtil;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginDescriptionFile;

import static org.bukkit.Bukkit.getLogger;

public class Main extends JavaPlugin {

    private static String NAME;
    private static String VERSION;

    @Override
    public void onEnable() {
        PluginDescriptionFile pdf = this.getDescription();
        NAME = pdf.getName();
        VERSION = pdf.getVersion();

        getLogger().info(String.format("[%s] v%s Enabled.", NAME, VERSION));

        // Initialization logic (e.g., register listeners, commands)
    }

    @Override
    public void onDisable() {
        getLogger().info(String.format("[%s] v%s Disabled.", NAME, VERSION));

        // Cleanup logic (e.g., save data, unregister listeners)
    }
}