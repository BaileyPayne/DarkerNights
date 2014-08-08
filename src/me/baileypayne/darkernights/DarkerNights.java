
package me.baileypayne.darkernights;

import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
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
        
    }
    //check if night
    public boolean day() {
    Server server = getServer();
    long time = server.getWorld("world").getTime();
    if(time > 0 || time < 12300){
        return true;
    }
        return false;
    }
    public void darkNights(Player player, boolean day){
        if(day == false){
            player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Integer.MAX_VALUE, 1));
        }
        if(day == true){
            player.removePotionEffect(PotionEffectType.BLINDNESS);
        }
    }
    
}
