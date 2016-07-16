package net.codec.magic.listener;

import com.sun.media.jfxmedia.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.util.Vector;

import java.util.logging.Level;

/**
 * Created by Codec on 16.07.2016.
 */
public class MagicBeamListener implements Listener{

    @EventHandler
    public void onMagicBeam(PlayerInteractEvent e)
    {
        if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK)
        {
            if(e.getPlayer().getItemInHand().getType() == Material.STICK)
            {
                Vector vec = e.getPlayer().getEyeLocation().getDirection();

                for(double i = 0.5; i < 20; i+=0.5) // bei 1 anfange ist extrem wichtig
                {
                    Location spawnLoc = e.getPlayer().getLocation().add(vec.normalize().multiply(i)); // later implement length of this combined with the time
                    for(Player all : Bukkit.getOnlinePlayers())
                    {
                        if(all.getLocation().distance(spawnLoc) <= 0.9)all.setHealth( all.getHealth() / 2);
                    }
                    e.getPlayer().spawnParticle(Particle.WATER_DROP, spawnLoc, 1);
                    //TEST
                }
            }
        }
    }
}
