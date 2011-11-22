/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.personas.personasapi.event.npc;

import com.crimsonrpg.personas.personasapi.event.EventType;
import com.crimsonrpg.personas.personasapi.event.PersonasEvent;
import com.crimsonrpg.personas.personasapi.npc.NPC;

/**
 * Represents an NPC-related event.
 */
public class NPCEvent extends PersonasEvent {
    private final NPC npc;

    public NPCEvent(EventType type, NPC npc) {
        super(type);
        this.npc = npc;
    }
    
    /**
     * Gets the NPC involved in this event.
     * 
     * @return NPC event
     */
    public NPC getNpc() {
        return npc;
    }
}
