package io.cadeluinenburg.electricshock.electricshock;

import org.bukkit.plugin.java.JavaPlugin;

public final class ElectricShock extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        // Plugin startup logic
        getLogger().info("Charging my power...");

        getLogger().info("Power charged!");
    }

    @Override
    public void onDisable()
    {
        getLogger().info("Power discharging...");

        getLogger().info("Power discharged.");
    }
}