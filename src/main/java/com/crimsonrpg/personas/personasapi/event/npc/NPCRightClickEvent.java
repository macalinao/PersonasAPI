/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.personas.personasapi.event.npc;

import com.crimsonrpg.personas.personasapi.event.EventType;
import com.crimsonrpg.personas.personasapi.npc.NPC;
import org.bukkit.entity.Player;

/**
 * Called when an NPC is right-clicked (interacted with)
 */
public class NPCRightClickEvent extends NPCEvent {
    private final Player player;
    
    public NPCRightClickEvent(NPC npc, Player player) {
        super(EventType.NPC_LEFT_CLICK, npc);
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }
}
