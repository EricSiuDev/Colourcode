package eric.me.colourcode;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class WorkWithMessage {
    public static void messageHandler(Player p, String m) {
        m = ChatColor.translateAlternateColorCodes('&', m);
        p.chat(m);
    }
}