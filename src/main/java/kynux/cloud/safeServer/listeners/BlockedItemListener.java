package kynux.cloud.safeServer.listeners;

import kynux.cloud.safeServer.BlockedItems;
import kynux.cloud.safeServer.SafeServer;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.ItemStack;

public class BlockedItemListener implements Listener {

    private final SafeServer plugin;

    public BlockedItemListener(SafeServer plugin) {
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPrepareItemCraft(PrepareItemCraftEvent event) {
        if (event.getRecipe() != null && BlockedItems.isBlocked(event.getRecipe().getResult())) {
            event.getInventory().setResult(null);
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockPlace(BlockPlaceEvent event) {
        if (BlockedItems.isBlocked(event.getItemInHand())) {
            event.setCancelled(true);
            event.getPlayer().sendMessage(ChatColor.RED + "Bu öğe güvenlik nedeniyle yere yerleştirilemez!");
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerInteract(PlayerInteractEvent event) {
        ItemStack item = event.getItem();
        if (BlockedItems.isBlocked(item)) {
            event.setCancelled(true);
            Player player = event.getPlayer();
            player.sendMessage(ChatColor.RED + "Bu öğe güvenlik nedeniyle kullanılamaz!");
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockDispense(BlockDispenseEvent event) {
        if (BlockedItems.isBlocked(event.getItem())) {
            event.setCancelled(true);
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPrepareAnvil(PrepareAnvilEvent event) {
        AnvilInventory inventory = event.getInventory();
        
        if (BlockedItems.isBlocked(inventory.getItem(0)) || BlockedItems.isBlocked(inventory.getItem(1))) {
            event.setResult(null);
            if (event.getView().getPlayer() instanceof Player) {
                Player player = (Player) event.getView().getPlayer();
                player.sendMessage(ChatColor.RED + "Bu öğe güvenlik nedeniyle örste kullanılamaz!");
            }
        }
        
        if (BlockedItems.isBlocked(event.getResult())) {
            event.setResult(null);
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onInventoryClick(InventoryClickEvent event) {
        if (event.getInventory().getType() == InventoryType.ANVIL) {
            if (BlockedItems.isBlocked(event.getCurrentItem()) || BlockedItems.isBlocked(event.getCursor())) {
                event.setCancelled(true);
                if (event.getWhoClicked() instanceof Player) {
                    Player player = (Player) event.getWhoClicked();
                    player.sendMessage(ChatColor.RED + "Bu öğe güvenlik nedeniyle örste kullanılamaz!");
                }
            }
        } else if (event.getInventory().getType() == InventoryType.CRAFTING || 
                   event.getInventory().getType() == InventoryType.WORKBENCH) {
            if (event.getSlotType() == InventoryType.SlotType.RESULT && 
                BlockedItems.isBlocked(event.getCurrentItem())) {
                event.setCancelled(true);
                if (event.getWhoClicked() instanceof Player) {
                    Player player = (Player) event.getWhoClicked();
                    player.sendMessage(ChatColor.RED + "Bu öğe güvenlik nedeniyle craftlanamaz!");
                }
            }
        }
    }
}
