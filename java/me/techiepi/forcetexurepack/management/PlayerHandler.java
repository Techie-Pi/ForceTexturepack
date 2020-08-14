package me.techiepi.forcetexurepack.management;

import com.destroystokyo.paper.Title;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerHandler implements Listener {

    private LoadTextures loadTextures;

    @EventHandler
    public void onPlayerJoined(PlayerJoinEvent event){
        startTextureManagement(event.getPlayer());
    }

    private void startTextureManagement(Player player){
        player.sendTitle(new Title("Loading textures...", "This might take up to 10 seconds", 20, 100, 20));
        loadTextures.loadTextures(player);
    }

    public void setLoadTextures(LoadTextures loadTextures){
        this.loadTextures = loadTextures;
    }
}
