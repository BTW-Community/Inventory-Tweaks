package net.fabricmc.invtweaks.mixin;

import btw.community.invtweaks.InventoryTweaksAddon;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityPlayerSP;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityPlayerSP.class)
public class EntityPlayerSPMixin {
    @Inject(method = "onItemPickup", at = @At("RETURN"))
    private void onItemPickup(Entity par1Entity, int par2, CallbackInfo info) {
        InventoryTweaksAddon.invtweaks.setItemPickupPending(true);
    }
}
