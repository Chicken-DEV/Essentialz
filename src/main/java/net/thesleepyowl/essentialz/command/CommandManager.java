package net.thesleepyowl.essentialz.command;

import net.thesleepyowl.essentialz.Essentialz;
import net.thesleepyowl.essentialz.command.commands.CommandFly;

public class CommandManager {

    private final Essentialz instance;

    public CommandManager(Essentialz instance) {
        this.instance = instance;

        instance.getCommand("Fly").setExecutor(new CommandFly());



    }


}
