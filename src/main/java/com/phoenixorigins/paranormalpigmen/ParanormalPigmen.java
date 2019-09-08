package com.phoenixorigins.paranormalpigmen;

import org.bukkit.plugin.java.JavaPlugin;

public class ParanormalPigmen extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		getServer().getPluginManager().registerEvents(new MobListener(), this);
		getLogger().info("ParanormalPigmen listener enabled.");
		getLogger().info("Zombie Pigmen spawned from portals will have their collision set to false.");
	}

	@Override
	public void onDisable()
	{
		getLogger().info("ParanormalPigmen listener disabled.");
	}
}