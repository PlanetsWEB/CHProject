package me.antiHack.Move;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import me.antiHack.AntiHack;
import me.antiHack.Detector;
import me.hub.MiniPlugin;
import me.hub.API.Util.UtilPlayer;

public class NoSlowDown
extends MiniPlugin
implements Detector
{
	  public NoSlowDown(AntiHack host)
	  {
	    super("NoSlowDown Detector", host.GetPlugin());
	    this.Host = host;
	  }
	  
	 private AntiHack Host;
     	 
	 
	  @EventHandler
	  public void onslowCheck(FoodLevelChangeEvent e)
	  {
	    Player p = (Player)e.getEntity();

	    if ((p.isSprinting()) && (e.getFoodLevel() > p.getFoodLevel()))
	    {
	      e.setCancelled(true);
	      this.Host.addSuspicion(p, "Suspeito de NoSlowDown");
	    }
	  }


@Override
public void Reset(Player paramPlayer) {
	// TODO Auto-generated method stub
	
}
}
