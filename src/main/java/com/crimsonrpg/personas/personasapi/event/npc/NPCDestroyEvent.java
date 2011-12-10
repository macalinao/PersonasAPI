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
public class NPCDestroyEvent extends NPCEvent {

    public NPCDestroyEvent(NPC npc) {
        super(EventType.NPC_DESTROY, npc);
    }
}
