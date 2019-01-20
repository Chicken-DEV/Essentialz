package net.thesleepyowl.essentialz;

import lombok.Getter;
import net.thesleepyowl.essentialz.command.CommandManager;
import net.thesleepyowl.essentialz.util.Methods;
import net.thesleepyowl.essentialz.util.ServerVersion;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.ConsoleCommandSender;

public class Essentialz extends JavaPlugin implements Listener {

    @Getter private static Essentialz instance;
    @Getter private final ServerVersion serverVersion = ServerVersion.fromPackageName(Bukkit.getServer().getClass().getPackage().getName());
    @Getter private CommandManager commandManager;
    private ConsoleCommandSender console;

    @Override
    public void onEnable() {
        instance = this;
        console = getServer().getConsoleSender();
        console.sendMessage(Methods.formatText("&a============================="));
        console.sendMessage(Methods.formatText("&7Essentialz " + this.getDescription().getVersion() + " by &5TheSleepyOwl made with <3&7!"));
        console.sendMessage(Methods.formatText("&7Action: &aEnabling&7..."));

        getConfig().options().copyDefaults(true);
        saveConfig();

        this.commandManager = new CommandManager(this);

        PluginManager manager = Bukkit.getServer().getPluginManager();
        //register new events here:
        //manager.registerEvents(new PlayerCommandListener(), this);


        console.sendMessage(Methods.formatText("&a============================="));
    }


    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }

}
