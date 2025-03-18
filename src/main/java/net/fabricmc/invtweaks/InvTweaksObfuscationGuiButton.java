package net.fabricmc.invtweaks;

import net.minecraft.src.Minecraft;
import net.minecraft.src.GuiButton;
import net.minecraft.src.ResourceLocation;
import net.minecraft.src.TextureMap;

/**
 * Obfuscation layer for gui buttons.
 * @author Jimeo Wan
 *
 */
public class InvTweaksObfuscationGuiButton extends GuiButton {

    public InvTweaksObfuscationGuiButton(int id, int x, int y, int w, int h, String string) {
        super(id, x, y, w, h, string);
    }
    
    protected String getDisplayString() {
        return displayString;
    }
    
    protected int getTexture(Minecraft mc, String texture) {
        return mc.renderEngine.getTexture(new ResourceLocation(texture)).getGlTextureId();
    }
    
    protected boolean isEnabled() {
        return enabled;
    }
    
    protected int getXPosition() {
        return xPosition;
    }
    
    protected int getYPosition() {
        return yPosition;
    }
    
    protected int getWidth() {
        return width;
    }
    
    protected int getHeight() {
        return height;
    }
}