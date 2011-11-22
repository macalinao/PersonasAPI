/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.personas.personasapi.event.npc;

import com.crimsonrpg.personas.personasapi.event.EventType;
import com.crimsonrpg.personas.personasapi.event.PersonasEvent;
import com.crimsonrpg.personas.personasapi.npc.NPC;
import org.bukkit.event.Cancellable;

/**
 * Represents an NPC-related event.
 */
public class NPCEvent extends PersonasEvent implements Cancellable {
    private final NPC npc;
    private boolean cancelled = false;

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

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
