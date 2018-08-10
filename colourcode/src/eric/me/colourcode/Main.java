package eric.me.colourcode;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable(){
        getLogger().info("Colourcode plugin has been enabled.");
        getServer().getPluginManager().registerEvents(new ListenerClass(), this);
    }
    @Override
    public void onDisable(){
        getLogger().info("Colourcode plugin has been disabled.");
    }
}
