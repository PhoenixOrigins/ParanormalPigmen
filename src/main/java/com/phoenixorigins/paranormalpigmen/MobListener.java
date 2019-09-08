package com.phoenixorigins.paranormalpigmen;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class MobListener implements Listener
{
	@EventHandler
	public void onEntitySpawn(CreatureSpawnEvent e)
	{
		if (e.getSpawnReason() == CreatureSpawnEvent.SpawnReason.NETHER_PORTAL
				&& e.getEntityType() == EntityType.PIG_ZOMBIE)
		{
			e.getEntity().setCollidable(false);
		}
	}
}