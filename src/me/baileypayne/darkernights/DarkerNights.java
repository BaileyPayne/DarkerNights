
package me.baileypayne.darkernights;

import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

/**
 *
 * @author Bailey
 */
public class DarkerNights extends JavaPlugin implements Listener {
    
    @Override
    public void onEnable(){
        getServer().getPluginManager().registerEvents(this, this);
        
    }
    @EventHandler
    public void onPlayerMoveEvent(PlayerMoveEvent e){
        Player p = e.getPlayer();
        Location l = p.getLocation();
        int lightlevel = p.getLocation().getBlock().getLightLevel();
        if(lightlevel < 5){
            p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Integer.MAX_VALUE, 1));
        }
        else {
            p.removePotionEffect(PotionEffectType.BLINDNESS);
        }
    }
    
}
