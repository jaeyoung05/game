package org.lastdice.game;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

import java.util.ArrayList;
import java.util.List;


public class win  {
private block target;


    public int remainCount (Player player){
        Location remainBlock = target.location(player);
        int count = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                Location remain = remainBlock.clone().add(i,j,0);
                if(remain.getBlock().getType() == Material.AIR){
                    count += 1;
                }
            }
        }
        return count;
    }

    public void winEnd (Player player){
        Location block = target.location(player);
        List<Location> list = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                Location targetBlock = block.clone().add(j,i,0);
                if(targetBlock.getBlock().getType().isAir()){
                    list.add(targetBlock);
                }
            }
        }
        if(list.size() == 49){
            player.sendMessage(" 게임 승리");
            inventory(player);
        }

    }

    public void loseEnd(Player player){
        Inventory inventory = player.getInventory();
        if (inventory.contains(Material.ARROW,0)){
            player.sendMessage("종료");
            target.blockDelete(player);
        }
    }



    public void inventory (Player player){
        Inventory inventory = player.getInventory();
        inventory.remove(Material.BOW);
        inventory.remove(Material.ARROW);

    }


}
