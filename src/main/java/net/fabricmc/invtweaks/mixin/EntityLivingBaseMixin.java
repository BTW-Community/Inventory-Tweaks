package net.fabricmc.invtweaks.mixin;

import btw.community.invtweaks.InventoryTweaksAddon;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLivingBase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityLivingBase.class)
public class EntityLivingBaseMixin {
    @Inject(method = "onItemPickup", at = @At("RETURN"))
    private void onItemPickup(Entity par1Entity, int par2, CallbackInfo info) {
        InventoryTweaksAddon.invtweaks.setItemPickupPending(true);
    }
}
