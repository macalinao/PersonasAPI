/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.personas.personasapi.event.npc;

import com.crimsonrpg.personas.personasapi.event.EventType;
import com.crimsonrpg.personas.personasapi.npc.NPC;

/**
 * Called when an NPC is deleted.
 */
public class NPCDeleteEvent extends NPCEvent {
    private DeleteReason deleteReason;

    public NPCDeleteEvent(NPC npc, DeleteReason deleteReason) {
        super(EventType.NPC_DELETE, npc);
        this.deleteReason = deleteReason;
    }

    public DeleteReason getDeleteReason() {
        return deleteReason;
    }
    
    public enum DeleteReason {
        UNKNOWN;
    }
}
