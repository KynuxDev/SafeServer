package kynux.cloud.safeServer;

import kynux.cloud.safeServer.listeners.BlockedItemListener;
import kynux.cloud.safeServer.listeners.ExploitPreventionListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Set;
import java.util.logging.Level;
import java.util.stream.Collectors;

public final class SafeServer extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("SafeServer güvenlik eklentisi başlatılıyor...");
        
        registerListeners();
        
        logBlockedItems();
        
        getLogger().info(ChatColor.GREEN + "SafeServer eklentisi başarıyla başlatıldı!");
        getLogger().info(ChatColor.GREEN + "Minecraft v1.21.1 sürümü için optimize edilmiştir.");
    }

    @Override
    public void onDisable() {
        getLogger().info("SafeServer güvenlik eklentisi kapatılıyor...");
    }
    
    private void registerListeners() {
        PluginManager pluginManager = getServer().getPluginManager();
        
        pluginManager.registerEvents(new BlockedItemListener(this), this);
        
        pluginManager.registerEvents(new ExploitPreventionListener(this), this);
        
        getLogger().info("Tüm listener'lar başarıyla kaydedildi.");
    }
    
    private void logBlockedItems() {
        Set<Material> blockedMaterials = BlockedItems.getBlockedMaterials();
        
        getLogger().log(Level.INFO, "Toplam {0} adet yasaklı öğe bulunuyor:", blockedMaterials.size());
        
        String blockedItemsList = blockedMaterials.stream()
                .map(Material::name)
                .collect(Collectors.joining(", "));
        
        getLogger().info("Yasaklı öğeler: " + blockedItemsList);
    }
}
