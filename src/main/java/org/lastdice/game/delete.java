package org.lastdice.game;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.AbstractArrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.ItemStack;


public class delete implements Listener {


    @EventHandler
    public void hitEvent (ProjectileHitEvent hitEvent) {

        AbstractArrow abstractArrow = (AbstractArrow) hitEvent.getEntity();

        Player player = (Player) abstractArrow.getShooter();

        ItemStack arrowHand = player.getInventory().getItemInOffHand();

        String arrowName = arrowHand.getItemMeta().getDisplayName();

        Block block = hitEvent.getHitBlock();

        int z = player.getLocation().blockZ();
        int z2 = block.getLocation().blockZ();

        if(block.getType() != Material.TARGET ){
            return;
        }

        if(block.getType() == Material.TARGET && z2 - z >= 20  ){

            switch (arrowName){
                case "일반 화살"-> {
                    basicArrow(block);
                }
                case "가로 화살" ->{
                    crossArrow(block);
                }
                case "세로 화살" ->{
                    heightArrow(block);
                }
            }

            player.sendMessage("거리 : " + (z2 - z));

        }

    }
    public void basicArrow (Block block){
        Location location = block.getLocation();

        location.getBlock().setType(Material.AIR);
    }

    public void crossArrow (Block block){
        Location location = block.getLocation();

        location.getBlock().setType(Material.AIR);
        location.getBlock().getRelative(-1,0,0).setType(Material.AIR);
        location.getBlock().getRelative(1,0,0).setType(Material.AIR);
    }


    public void heightArrow (Block block){
        Location location = block.getLocation();

        location.getBlock().setType(Material.AIR);
        location.getBlock().getRelative(0,1,0).setType(Material.AIR);
        location.getBlock().getRelative(0,-1,0).setType(Material.AIR);
    }
}
