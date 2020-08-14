package me.techiepi.forcetexurepack.management;


import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.logging.Logger;

public class LoadTextures {
    String textureUrl;
    String hash;

    public void loadTextures(Player player){
        if(hash != null){
            player.setResourcePack(textureUrl, hash);
        }
        else{
            Logger logger = Bukkit.getLogger();
            logger.warning("The method used to load the texture pack doesn't uses hash, this is deprecated and will be removed in the future, check the config.yml of the plugin and add the resource pack hash");
        }

    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public void setTextureUrl(String textureUrl) {
        this.textureUrl = textureUrl;
    }
}
