package com.jeong;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

public class GivePickaxe implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player = (Player) sender;
        ItemStack pickaxe = new ItemStack(Material.NETHERITE_PICKAXE);
        PickaxeData pickaxeData = new PickaxeData();
        pickaxeData.setForward(Integer.parseInt(args[0]));
        pickaxeData.setBackward(Integer.parseInt(args[1]));
        pickaxeData.setUp(Integer.parseInt(args[2]));
        pickaxeData.setDown(Integer.parseInt(args[3]));
        pickaxeData.setRight(Integer.parseInt(args[4]));
        pickaxeData.setLeft(Integer.parseInt(args[5]));
        pickaxe.setItemMeta(pickaxeData);
        PickaxeData pickaxeItemMeta = (PickaxeData) pickaxe.getItemMeta();
        player.sendMessage(Integer.toString(pickaxeItemMeta.getForward()));
        return false;
    }
}

class GivePickaxeMPM{

}
