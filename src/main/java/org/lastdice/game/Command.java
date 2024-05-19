package org.lastdice.game;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class Command extends BukkitCommand   {
private block target;

    public Command(@NotNull String name) {
        super(name);
    }

    public Command(@NotNull String name, block target) {
        super(name);
        this.target = target;
    }

    @Override
    public boolean execute(@NotNull CommandSender commandSender, @NotNull String s, @NotNull String[] strings) {
        if(commandSender instanceof Player player){
            World world = player.getWorld();

            if(target.target(player)){

            }

            if(strings.length == 0){
                return false;
            }

            switch (strings[0]) {
                case "start" ->{
                    target.location(player);

                    ItemStack bow = item.bow();
                    ItemStack arrow = item.arrow();
                    ItemStack arrow2 = item.crossArrow();
                    ItemStack arrow3 = item.heightArrow();
                    player.getInventory().addItem(bow);
                    player.getInventory().addItem(arrow);
                    player.getInventory().addItem(arrow2);
                    player.getInventory().addItem(arrow3);
                }


            }

        }







        return false;


    }
}
