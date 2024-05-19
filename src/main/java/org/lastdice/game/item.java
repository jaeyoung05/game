package org.lastdice.game;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class item {

    public static ItemStack bow(){
        ItemStack itemStack = new ItemStack(Material.BOW, 1);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("활");

        List<String> lore = new ArrayList<>();
        lore.add("쏘세요");
        itemMeta.setLore(lore);

        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }

    public static ItemStack arrow() {
        ItemStack itemStack = new ItemStack(Material.ARROW, 30);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("일반 화살");

        List<String> lore = new ArrayList<>();
        lore.add("효과 없음");
        itemMeta.setLore(lore);

        itemStack.setItemMeta(itemMeta);


        return itemStack;


    }

    public static ItemStack crossArrow() {
        ItemStack itemStack = new ItemStack(Material.ARROW, 10);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("가로 화살");

        List<String> lore = new ArrayList<>();
        lore.add("양 옆의 블록을 제거");
        itemMeta.setLore(lore);

        itemStack.setItemMeta(itemMeta);


        return itemStack;
    }

    public static ItemStack heightArrow() {
        ItemStack itemStack = new ItemStack(Material.ARROW, 10);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("세로 화살");

        List<String> lore = new ArrayList<>();
        lore.add("위 아래 블록을 제거");
        itemMeta.setLore(lore);

        itemStack.setItemMeta(itemMeta);


        return itemStack;
    }

}
