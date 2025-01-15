package org.spigotmc.screamoov.bestmenus.menu.menus;

import org.spigotmc.screamoov.bestmenus.menu.configuration.IConfiguration;
import org.spigotmc.screamoov.bestmenus.menu.configuration.MenuConfig;

public class Menu {
    public String OPEN_COMMAND,NAME;
    public int SIZE;
    public IConfiguration CONFIG;

    public Menu(String NAME) {
        this.NAME = NAME;
        this.CONFIG = new MenuConfig(this);
        this.CONFIG.loadMenu();
    }
}
