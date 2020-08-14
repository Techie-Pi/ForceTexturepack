package me.techiepi.forcetexurepack;

import me.techiepi.forcetexurepack.management.LoadTextures;
import me.techiepi.forcetexurepack.management.PlayerHandler;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    PlayerHandler playerHandler;
    LoadTextures loadTextures;

    @Override
    public void onEnable() {
        playerHandler = new PlayerHandler();
        loadTextures = new LoadTextures();

        String resourcePackUrl = getConfig().getString("resource-pack-url");
        String resourcePackHash = getConfig().getString("resource-pack-hash");

        if(resourcePackHash != null){
            resourcePackHash.toLowerCase();
        }

        playerHandler.setLoadTextures(loadTextures);

        loadTextures.setTextureUrl(resourcePackUrl);
        loadTextures.setHash(resourcePackHash);

        saveDefaultConfig();

        getServer().getPluginManager().registerEvents(playerHandler, this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
