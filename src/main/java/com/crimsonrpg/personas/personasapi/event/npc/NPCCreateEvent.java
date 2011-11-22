/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.personas.personasapi.event.npc;

import com.crimsonrpg.personas.personasapi.event.EventType;
import com.crimsonrpg.personas.personasapi.npc.NPC;
import org.bukkit.Location;

/**
 * Called when an NPC is created.
 */
public class NPCCreateEvent extends NPCEvent {
    private Location location;
    private CreateReason createReason;

    public NPCCreateEvent(NPC npc, Location location, CreateReason createReason) {
        super(EventType.NPC_CREATE, npc);
        this.location = location;
        this.createReason = createReason;
    }
    
    public enum CreateReason {
        COMMAND,
        
        UNKNOWN;
    }
}
