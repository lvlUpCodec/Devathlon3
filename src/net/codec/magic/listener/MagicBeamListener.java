package net.codec.magic.listener;

import com.sun.media.jfxmedia.logging.Logger;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.logging.Level;

/**
 * Created by CHome on 16.07.2016.
 */
public class MagicBeamListener implements Listener{

    @EventHandler
    public void onMagicBeam(PlayerInteractEvent e)
    {
        if(e.getAction() == Action.RIGHT_CLICK_AIR)
        {
            if(e.getPlayer().getItemInHand().getType() == Material.STICK)
            {
                Logger.logMsg(0,"Clicked");
            }
        }
    }
}
