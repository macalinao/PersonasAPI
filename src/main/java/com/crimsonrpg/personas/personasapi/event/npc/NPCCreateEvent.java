/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.personas.personasapi.event.npc;

import com.crimsonrpg.personas.personasapi.event.EventType;
import com.crimsonrpg.personas.personasapi.npc.NPC;

/**
 * Called when an NPC is created.
 */
public class NPCCreateEvent extends NPCEvent {
    private CreateReason createReason;

    public NPCCreateEvent(NPC npc, CreateReason createReason) {
        super(EventType.NPC_CREATE, npc);
        this.createReason = createReason;
    }
    
    public enum CreateReason {
        COMMAND,
        
        UNKNOWN;
    }
}
