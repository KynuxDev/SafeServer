package kynux.cloud.safeServer;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BlockedItems {
    private static final Set<Material> BLOCKED_MATERIALS = new HashSet<>(Arrays.asList(
            Material.TNT,
            Material.TNT_MINECART,
            Material.END_CRYSTAL,
            Material.RAIL,
            Material.POWERED_RAIL,
            Material.DETECTOR_RAIL,
            Material.ACTIVATOR_RAIL,
            Material.MINECART,
            Material.CHEST_MINECART,
            Material.FURNACE_MINECART,
            Material.TNT_MINECART,
            Material.HOPPER_MINECART,
            Material.COMMAND_BLOCK_MINECART
    ));

    public static boolean isBlocked(Material material) {
        return BLOCKED_MATERIALS.contains(material);
    }

    public static boolean isBlocked(ItemStack item) {
        return item != null && isBlocked(item.getType());
    }
    
    public static Set<Material> getBlockedMaterials() {
        return new HashSet<>(BLOCKED_MATERIALS);
    }
}
