package net.sperms;

import org.bukkit.plugin.java.JavaPlugin;

public class Sperms extends JavaPlugin{
	
	
	public void onEnable(){
		System.out.println(getDescription().getName() + " is enabled!");
		getServer().getPluginManager().registerEvents(new SpermListener(this), this);
		
	}
	
	public void onDisable(){
		System.out.println(getDescription().getName() + " sleeping!");
		
		
	}
	

}
