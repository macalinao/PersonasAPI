/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.personas.personasapi.event.npc;

import com.crimsonrpg.personas.personasapi.event.EventType;
import com.crimsonrpg.personas.personasapi.npc.NPC;
import org.bukkit.entity.Player;

/**
 * Called when an NPC is left-clicked.
 */
public class NPCLeftClickEvent extends NPCPlayerEvent {
    private boolean damaging = false;
    
    public NPCLeftClickEvent(NPC npc, Player player) {
        super(EventType.NPC_LEFT_CLICK, npc, player);
    }

    public boolean isDamaging() {
        return damaging;
    }

    public void setDamaging(boolean damaging) {
        this.damaging = damaging;
    }
}
