package org.lastdice.game;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class block  {



    public Location location(Player player) {
        World world = player.getWorld();
        Location location = player.getLocation();
        Location blockLocation = location.add(0, 0, 20);
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                Location blank = blockLocation.clone().add(j, i, 0);
                blank.getBlock().setType(Material.TARGET);
            }
        }
        return location;
    }


    public void blockDelete (Player player){
        Block block = location(player).getBlock();
        if(block.getType() == Material.TARGET){
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    Location targetBlock = block.getLocation().clone().add(j,i,0);
                    targetBlock.getBlock().setType(Material.AIR);
                }
            }
        }
    }


}



