package com.toke1597.crop;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Commands implements CommandExecutor {

    static List<String> toggled = new ArrayList<String>();

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(label.equalsIgnoreCase("autocrop")){
            if(!(sender instanceof Player)){
                sender.sendMessage(ChatColor.RED+"당신은 게임 내에서 이 명령어를 실행할 수 있습니다.");
                return false;
            }
            Player player = (Player) sender;
            if(toggled.contains(player.getName())){
                player.sendMessage(ChatColor.RED+"자동심기를 비활성화했습니다.");
                toggled.remove(player.getName());
                return true;
            }
            player.sendMessage(ChatColor.GREEN+"자동심기를 활성화했습니다.");
            toggled.add(player.getName());
            return true;
        }
        return false;
    }
}
