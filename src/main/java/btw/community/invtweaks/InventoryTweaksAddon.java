package btw.community.invtweaks;

import btw.AddonHandler;
import btw.BTWAddon;
import net.fabricmc.invtweaks.InvTweaks;
import net.minecraft.client.Minecraft;

public class InventoryTweaksAddon extends BTWAddon {

    public static String addonName = "Inventory Tweaks Addon";
    public static String versionString = "V1.0.0";

    public static InvTweaks invtweaks;

    private InventoryTweaksAddon() {
        super(addonName, versionString, "ITA");
    }

    @Override
    public void initialize() {
        // Instantiate mod core

    }

    public static void ModLogger(String s) {
        AddonHandler.logMessage(s);
    }

}
