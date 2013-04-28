package net.sperms;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;


public class SpermListener implements Listener {
	
    Sperms plugin;
    public SpermListener(Sperms plug) {
            super();
            this.plugin = plug;
    }
    
    @EventHandler
    public void onSperms(SpermCreateEvent e){
    	
    }

}
