package org.spigotmc.screamoov.bestmenus.commands;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class MenuCommandsListener implements Listener {
    @EventHandler
    public void onPlayerCommand(PlayerCommandPreprocessEvent event) {
        String message = event.getMessage();

    }
}
