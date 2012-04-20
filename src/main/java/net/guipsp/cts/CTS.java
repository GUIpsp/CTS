package net.guipsp.cts;

import org.bukkit.plugin.java.JavaPlugin;

public class CTS extends JavaPlugin {
	ItemFinder itemFinder = new ItemFinder(this, 2, 5);
	Thread itemFinderThread = new Thread(itemFinder, "ItemFinder");

	@Override
	public void onDisable() {
		System.out.println("Disabling CTS");
		itemFinder.running = false;
	}

	@Override
	public void onEnable() {
		System.out.println("Enabling CTS");
		getServer().getPluginManager()
				.registerEvents(new Eventificator(), this);
		itemFinderThread.start();
	}

}
