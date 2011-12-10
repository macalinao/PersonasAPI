/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.personas.personasapi.event.npc;

import com.crimsonrpg.personas.personasapi.event.EventType;
import com.crimsonrpg.personas.personasapi.npc.NPC;
import org.bukkit.entity.Player;

/**
 *
 * @author simplyianm
 */
public class NPCPlayerEvent extends NPCEvent {
    private final Player player;

    public NPCPlayerEvent(EventType type, NPC npc, Player player) {
        super(type, npc);
        this.player = player;
    }

    /**
     * Gets the player that left clicked an NPC.
     * 
     * @return The player that left clicked the NPC.
     */
    public Player getPlayer() {
        return player;
    }
}
