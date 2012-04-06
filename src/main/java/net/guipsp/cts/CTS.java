package net.guipsp.cts;

import org.bukkit.plugin.java.JavaPlugin;

public class CTS extends JavaPlugin {
	@Override
	public void onDisable() {
		System.out.println("Disabling CTS");
	}

	@Override
	public void onEnable() {
		getServer().getPluginManager()
				.registerEvents(new Eventificator(), this);
		System.out.println("Enabling CTS");
	}

}
