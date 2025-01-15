package org.spigotmc.screamoov.bestmenus.menu;

import org.spigotmc.screamoov.bestmenus.Menus;
import org.spigotmc.screamoov.bestmenus.menu.menus.Menu;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MenusManager {
    private List<Menu> MENUS = new ArrayList<>();

    public void registerMenu(Menu MENU) {
        this.MENUS.add(MENU);
    }

    public void registerMenu(String MENU) {
        File MENU_FILE = new File("plugins/bestMenus/menus/" + MENU + ".yml");
        if (!MENU_FILE.exists()) {
            Menus.getLog().
        }
    }
}
