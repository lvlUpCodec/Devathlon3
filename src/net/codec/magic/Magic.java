package net.codec.magic;

import net.codec.magic.listener.MagicBeamListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Codec on 16.07.2016.
 */
public class Magic extends JavaPlugin{

    private static Magic me;

    @Override
    public void onEnable() {
        me = this;
        registerListener();
    }

    @Override
    public void onDisable() {

    }

    private void registerListener()
    {
        Bukkit.getPluginManager().registerEvents(new MagicBeamListener(), this);
    }

    public static Magic getMagic()
    {
        return me;
    }
}
