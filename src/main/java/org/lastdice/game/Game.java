package org.lastdice.game;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Game extends JavaPlugin {
private block block = new block();



    @Override
    public void onEnable() {
        // Plugin startup logic

        Bukkit.getCommandMap().register("block", new Command("test", block));

        Bukkit.getPluginManager().registerEvents(new delete(),this);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
