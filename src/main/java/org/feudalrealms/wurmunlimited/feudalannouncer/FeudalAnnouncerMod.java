package org.feudalrealms.wurmunlimited.feudalannouncer;

import com.wurmonline.server.players.Player;

import org.gotti.wurmunlimited.modloader.interfaces.*;
import org.nyxcode.wurm.discordrelay.DiscordRelay;

public class FeudalAnnouncerMod implements WurmServerMod, ServerShutdownListener, ServerStartedListener, PlayerLoginListener {

    @Override
    public void onPlayerLogin(Player player) {
        DiscordRelay.sendToDiscord("gl-freedom", "Player " + player.getName() + " has logged in.", false);
    }

    public void onPlayerLogout(Player player) {
        DiscordRelay.sendToDiscord("gl-freedom", "Player " + player.getName() + " has logged out.", false);
    }

    public void onServerShutdown() {
        DiscordRelay.sendToDiscord("gl-freedom", "The Server has shutdown.", false);
    }

    public void onServerStarted() {
        DiscordRelay.sendToDiscord("gl-freedom", "The Server has started.", false);
    }
}
