package eric.me.colourcode;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.ArrayList;
import java.util.List;

public class ListenerClass implements Listener {
    @EventHandler
    public static void playerChatEvent(AsyncPlayerChatEvent e){
        Player p = e.getPlayer();
        if(!(e.getMessage().contains("&"))){
            return;
        }
        if(e.getMessage().contains("&")){
            String m = e.getMessage();
            e.setCancelled(true);
            WorkWithMessage.messageHandler(p, m);
            return;
        }
    }
}
