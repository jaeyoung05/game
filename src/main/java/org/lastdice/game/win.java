package org.lastdice.game;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.ArrayList;
import java.util.List;


public class win  {
private block target;


    public void remain (Player player){
        Location location = target.location(player);
        if(location.getBlock().getType() == Material.AIR){
            player.sendMessage("하하");
        }
    }


}
