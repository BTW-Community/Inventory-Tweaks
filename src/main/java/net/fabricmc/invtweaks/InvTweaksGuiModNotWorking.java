package net.fabricmc.invtweaks;

import java.util.logging.Logger;

import net.minecraft.client.Minecraft;
import net.minecraft.src.GuiButton;
import net.minecraft.src.GuiScreen;


/**
 * A help menu for the NoCheatPlus conflict.
 * 
 * @author Jimeo Wan
 * 
 */
public class InvTweaksGuiModNotWorking extends InvTweaksGuiSettingsAbstract {
	
    private static final Logger log = Logger.getLogger("InvTweaks");

    public InvTweaksGuiModNotWorking(Minecraft mc, GuiScreen parentScreen, InvTweaksConfig config) {
        super(mc, parentScreen, config);
    }

	public void drawScreen(int i, int j, float f) {
        super.drawScreen(i, j, f);
        
        int x = obf.getWindowWidth(this) / 2;
        drawCenteredString(obf.getFontRenderer(), InvTweaksLocalization.get("invtweaks.help.bugsorting.pt1"), x, 80, 0xBBBBBB); 
        drawCenteredString(obf.getFontRenderer(), InvTweaksLocalization.get("invtweaks.help.bugsorting.pt2"), x, 95, 0xBBBBBB);
        drawCenteredString(obf.getFontRenderer(), InvTweaksLocalization.get("invtweaks.help.bugsorting.pt3"), x, 110, 0xBBBBBB);
        drawCenteredString(obf.getFontRenderer(), InvTweaksLocalization.get("invtweaks.help.bugsorting.pt4"), x, 150, 0xFFFF99);
    }
    
    protected void actionPerformed(GuiButton guibutton) {
        // Back to main settings screen
        if (obf.getId(guibutton) == ID_DONE) {
            obf.displayGuiScreen(new InvTweaksGuiSettings(mc, parentScreen, config));
        }
    }

}
