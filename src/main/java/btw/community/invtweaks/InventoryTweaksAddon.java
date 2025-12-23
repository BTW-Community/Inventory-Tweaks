package btw.community.invtweaks;

import api.AddonHandler;
import api.BTWAddon;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.invtweaks.InvTweaks;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InventoryTweaksAddon extends BTWAddon implements ModInitializer {
    public static String addonName = "InventoryTweaks";
    public static String versionString = "1.0.0";

    public static InvTweaks invtweaks;

    public static Logger Logger = LogManager.getLogger();

    public InventoryTweaksAddon() {
        super();
    }

    @Override
    public void preInitialize() {

    }

    @Override
    public void initialize() {
        AddonHandler.logMessage(this.getName() + " Version " + this.getVersionString() + " Initializing...");
    }

    @Override
    public void onInitialize() {

    }
}
