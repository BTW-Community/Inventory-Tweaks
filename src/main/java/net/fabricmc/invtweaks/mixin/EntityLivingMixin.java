package net.fabricmc.invtweaks.mixin;

import btw.community.invtweaks.InventoryTweaksAddon;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityLiving.class)
public class EntityLivingMixin {
    @Inject(method = "onItemPickup", at = @At("RETURN"))
    private void onItemPickup(Entity par1Entity, int par2, CallbackInfo info) {
        InventoryTweaksAddon.invtweaks.setItemPickupPending(true);
    }
}
