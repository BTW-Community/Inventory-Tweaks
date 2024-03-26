package net.fabricmc.invtweaks.mixin;

import btw.community.invtweaks.InventoryTweaksAddon;
import net.fabricmc.invtweaks.InvTweaks;
import net.minecraft.client.Minecraft;
import net.minecraft.src.GuiAchievement;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiAchievement.class)
public class GuiAchievementMixin {
    @Inject(method = "updateAchievementWindow()V", at = @At("HEAD"))
    private void updateAchievementWindow(CallbackInfo info) {
        if (Minecraft.getMinecraft().theWorld != null) {
            if(InventoryTweaksAddon.invtweaks == null) {
                InventoryTweaksAddon.invtweaks = new InvTweaks(Minecraft.getMinecraft(), InventoryTweaksAddon.addonName, InventoryTweaksAddon.versionString);
            }
            if (Minecraft.getMinecraft().currentScreen != null) {
                InventoryTweaksAddon.invtweaks.onTickInGUI(Minecraft.getMinecraft().currentScreen);
            }
            else {
                InventoryTweaksAddon.invtweaks.onTickInGame();
            }
        }
    }
}
