package com.thelagg.laggview.games;

import java.util.ArrayList;
import java.util.List;

import com.thelagg.laggview.LaggView;
import com.thelagg.laggview.hud.Hud.HudText;
import com.thelagg.laggview.hud.Hud.Priority;

import net.minecraft.client.Minecraft;

public class Lobby extends Game {

	public Lobby(String serverId, Minecraft mc, LaggView laggView) {
		super(GameType.LOBBY, serverId, mc, laggView);
	}
	
	@Override
	public ArrayList<HudText> getHudText() {
		for(HudText ht : super.getHudText().toArray(new HudText[super.getHudText().size()])) {
			if(ht.getPriority()==Priority.COINS) {
				super.getHudText().remove(ht);
			}
		}
		return super.getHudText();
	}

}