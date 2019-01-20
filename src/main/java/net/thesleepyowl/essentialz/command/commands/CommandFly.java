package net.thesleepyowl.essentialz.command.commands;

import net.minecraft.server.v1_12_R1.CommandExecute;
import net.thesleepyowl.essentialz.Essentialz;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

public class CommandFly extends CommandExecute implements Listener, CommandExecutor {

    private Plugin plugin = Essentialz.getPlugin(Essentialz.class);
    public String fly = "fly";


    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){

        Player player = (Player) sender;
        //String perm = new String();
        String perm = "essentialz.fly";
        String prefix = plugin.getConfig().getString("Config.Prefix");

        if (!(sender instanceof Player)) {
            if (args.length == 0) {
                if (player.hasPermission(perm)) {
                    //enable/disable fly
                } else {
                    player.sendMessage(prefix + ChatColor.RED + "You need the permission " + ChatColor.BOLD + ChatColor.RED + perm + ChatColor.RESET + ChatColor.RED + " to use this.");
                }
            } else {
                if (args.length == 1) {
                    //enable/disable fly for other player
                } else {
                    sender.sendMessage(ChatColor.RED + "FIX ME!" );
                }
            }
        } else {
            sender.sendMessage(ChatColor.RED + "This command can only be executed by a Player!");
        }
        return true;
    }


}
