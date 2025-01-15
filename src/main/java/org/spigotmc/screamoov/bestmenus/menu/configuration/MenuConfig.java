package org.spigotmc.screamoov.bestmenus.menu.configuration;

import org.bukkit.configuration.file.FileConfiguration;
import org.checkerframework.checker.units.qual.C;
import org.spigotmc.screamoov.bestmenus.menu.menus.Menu;

import java.io.File;
import java.io.IOException;

public class MenuConfig implements IConfiguration{
    File FILE;
    FileConfiguration CONFIG;

    public MenuConfig(Menu MENU) {
        File DIRECTORY = new File("plugins/bestMenus/menus/");
        if (!DIRECTORY.exists()) DIRECTORY.mkdirs();
        this.FILE = new File("plugins/bestMenus/menus/" + MENU.NAME + ".yml");
        if (!FILE.exists()) {
            try {
                FILE.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @Override
    public FileConfiguration getConfig() {
        return CONFIG;
    }

    @Override
    public void saveConfig() {

    }

    @Override
    public void loadMenu() {

    }

    @Override
    public File getFile() {
        return FILE;
    }
}
