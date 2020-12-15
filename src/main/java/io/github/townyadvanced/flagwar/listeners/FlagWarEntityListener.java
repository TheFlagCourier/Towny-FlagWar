package io.github.townyadvanced.flagwar.listeners;

import io.github.townyadvanced.flagwar.FlagWar;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class FlagWarEntityListener implements Listener {

	@EventHandler(priority = EventPriority.LOWEST)
	public void onEntityExplode(EntityExplodeEvent event) {

		for (Block block : event.blockList())
			FlagWar.checkBlock(null, block, event);
	}
}
