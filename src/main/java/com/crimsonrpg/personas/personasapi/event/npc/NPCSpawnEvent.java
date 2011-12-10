/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.personas.personasapi.event.npc;

import com.crimsonrpg.personas.personasapi.event.EventType;
import com.crimsonrpg.personas.personasapi.npc.NPC;
import org.bukkit.Location;

/**
 * Called when an NPC is spawned.
 */
public class NPCSpawnEvent extends NPCEvent {

    private Location location;

    public NPCSpawnEvent(NPC npc, Location location) {
        super(EventType.NPC_SPAWN, npc);
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
