package org.spigotmc.screamoov.bestmenus;

import org.bukkit.plugin.java.JavaPlugin;
import org.spigotmc.screamoov.bestmenus.logger.Logger;

public final class Menus extends JavaPlugin {
    static Menus instance;
    static boolean ASYNC = false;
    static Logger LOGGER;

    @Override
    public void onEnable() {
        instance = this;
        if (getConfig().getBoolean("async")) ASYNC = true;
        LOGGER = new Logger(this);
        LOGGER.enable();
    }

    @Override
    public void onDisable() {

    }

    public static boolean isAsync() {
        return ASYNC;
    }

    public static Logger getLog() {
        return LOGGER;
    }

    public static Menus getInstance() {
        return instance;
    }
}
