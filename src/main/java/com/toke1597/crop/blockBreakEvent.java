package com.toke1597.crop;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import static com.toke1597.crop.Commands.toggled;

public class blockBreakEvent implements Listener {

    int delay = 2;

    public static Plugin plugin;

    public blockBreakEvent(Plugin plugin) {
        blockBreakEvent.plugin = plugin;
    }

    @EventHandler
    public void blockBreakEvent1(BlockBreakEvent e) {
        Player p = e.getPlayer();
        final Block b = e.getBlock();
        final Material material = b.getType();

        if (p.hasPermission("autocrop.on")) {
            if (toggled.contains(p.getName())) {
                if (material == (Material.WHEAT)) {
                    //p.sendMessage("작물을 수확했습니다.");
                    Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {
                        @Override
                        public void run() {
                            //p.sendMessage("씨앗을 설치했습니다.");
                            if (p.getInventory().contains(Material.WHEAT_SEEDS, 1)) {
                                ItemStack ammo = new ItemStack(Material.WHEAT_SEEDS, 1);
                                p.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_EGG, 1, 1);
                                p.getInventory().removeItem(ammo);
                                b.setType(material);
                            }
                        }
                    }, delay * 20L);
                }

                if (material == (Material.CARROTS)) {
                    //p.sendMessage("작물을 수확했습니다.");
                    Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {
                        @Override
                        public void run() {
                            //p.sendMessage("씨앗을 설치했습니다.");
                            if (p.getInventory().contains(Material.CARROT, 1)) {

                                ItemStack ammo = new ItemStack(Material.CARROT, 1);
                                p.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_EGG, 1, 1);
                                p.getInventory().removeItem(ammo);
                                b.setType(material);
                            }
                        }
                    }, delay * 20L);
                }

                if (material == (Material.POTATOES)) {
                    //p.sendMessage("작물을 수확했습니다.");
                    Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {
                        @Override
                        public void run() {
                            //p.sendMessage("씨앗을 설치했습니다.");
                            if (p.getInventory().contains(Material.POTATO, 1)) {
                                ItemStack ammo = new ItemStack(Material.POTATO, 1);
                                p.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_EGG, 1, 1);
                                p.getInventory().removeItem(ammo);
                                b.setType(material);
                            }
                        }
                    }, delay * 20L);
                }

                if (material == (Material.NETHER_WART)) {
                    //p.sendMessage("작물을 수확했습니다.");
                    Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {
                        @Override
                        public void run() {
                            //p.sendMessage("씨앗을 설치했습니다.");
                            if (p.getInventory().contains(Material.NETHER_WART, 1)) {

                                ItemStack ammo = new ItemStack(Material.NETHER_WART, 1);
                                p.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_EGG, 1, 1);
                                p.getInventory().removeItem(ammo);
                                b.setType(material);
                            }
                        }
                    }, delay * 20L);
                }

                if (material == (Material.BEETROOTS)) {
                    //p.sendMessage("작물을 수확했습니다.");
                    Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {
                        @Override
                        public void run() {
                            //p.sendMessage("씨앗을 설치했습니다.");
                            if (p.getInventory().contains(Material.BEETROOT_SEEDS, 1)) {

                                ItemStack ammo = new ItemStack(Material.BEETROOT_SEEDS, 1);
                                p.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_EGG, 1, 1);
                                p.getInventory().removeItem(ammo);
                                b.setType(material);
                            }
                        }
                    }, delay * 20L);
                }
            }
        }
    }
}
