package org.spigotmc.screamoov.bestmenus.menu.configuration;

import org.bukkit.configuration.file.FileConfiguration;
import org.spigotmc.screamoov.bestmenus.menu.menus.Menu;

import java.io.File;

public interface IConfiguration {
    FileConfiguration getConfig();
    void saveConfig();
    void loadMenu();
    File getFile();
}
