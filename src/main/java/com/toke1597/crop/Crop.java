package com.toke1597.crop;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Crop extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println(ChatColor.GREEN + "[AutoCrop] 플러그인이 활성화되었습니다.");
        getServer().getPluginManager().registerEvents(new blockBreakEvent(this), this);
        getCommand("autocrop").setExecutor(new Commands());
    }

    @Override
    public void onDisable() {
        System.out.println(ChatColor.RED + "플러그인이 비활성화되었습니다.");
    }
}
