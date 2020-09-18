package me.sgray.template.spigotplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ExampleCommand implements CommandExecutor {
    SpigotPlugin plugin;

    public ExampleCommand(SpigotPlugin plugin) {
        this.plugin = plugin;
    }
@EventHandler
public void onUse(PlayerInteractEvent e) {
Player p = e.getPlayer();
if(p.getInventory().getItemInHand() != null && p.getInventory().getItemInHand().getType() == Material.BLAZE_ROD) {
p.launchProjectile(Snowball.class);
}

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        String cmdName = cmd.getName().toLowerCase();

        if (!cmdName.equals("example")) {
            return false;
        }

        sender.sendMessage("Successfully used example command!");

        return true;
    }
}
