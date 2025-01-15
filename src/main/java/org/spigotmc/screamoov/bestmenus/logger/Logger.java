package org.spigotmc.screamoov.bestmenus.logger;

import org.bukkit.plugin.Plugin;
import org.spigotmc.screamoov.bestmenus.Menus;
import org.spigotmc.screamoov.bestmenus.menu.menus.Menu;

public class Logger {
    public String PLUGIN_NAME;
    public Plugin PLUGIN;

    public Logger(Plugin plugin) {
        this.PLUGIN_NAME = plugin.getDescription().getName();
        this.PLUGIN = plugin;
    }

    public void enable() {
        if (Menus.isAsync()) {
            System.out.println("Plugin bestMenus starting async..");
        } else {
            System.out.println("Plugin bestMenus starting sync..");
        }
    }

    public void print(Menu MENU, String MESSAGE) {
        System.out.println("[bestMenus/" + MENU.NAME + "] " + MESSAGE);
    }
}
