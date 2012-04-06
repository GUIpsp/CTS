package net.guipsp.cts;

import org.bukkit.event.*;
import org.bukkit.event.player.PlayerJoinEvent;

public class Eventificator implements Listener {
	public Eventificator() {
	}

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		event.getPlayer().sendMessage(
				"Welcome, " + event.getPlayer().getDisplayName() + "!");
	}
}
