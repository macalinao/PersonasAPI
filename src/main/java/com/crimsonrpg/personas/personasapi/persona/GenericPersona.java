/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.personas.personasapi.persona;

import com.crimsonrpg.personas.personasapi.event.npc.NPCCreateEvent;
import com.crimsonrpg.personas.personasapi.event.npc.NPCDeleteEvent;
import com.crimsonrpg.personas.personasapi.event.npc.NPCDespawnEvent;
import com.crimsonrpg.personas.personasapi.event.npc.NPCLeftClickEvent;
import com.crimsonrpg.personas.personasapi.event.npc.NPCRightClickEvent;
import com.crimsonrpg.personas.personasapi.event.npc.NPCSpawnEvent;

/**
 * A generic persona.
 */
public class GenericPersona implements Persona {

    public String getName() {
        return "generic";
    }

    /**
     * Called when an NPC is created.
     * 
     * @param event The event to call
     */
    public void onNPCCreate(NPCCreateEvent event) {
    }

    /**
     * Called when an NPC is deleted.
     * 
     * @param event The event to call
     */
    public void onNPCDelete(NPCDeleteEvent event) {
    }

    /**
     * Called when an NPC is despawned.
     * 
     * @param event The event to call
     */
    public void onNPCDespawn(NPCDespawnEvent event) {
    }

    /**
     * Called when an NPC is left clicked.
     * 
     * @param event The event to call
     */
    public void onNPCLeftClick(NPCLeftClickEvent event) {
    }

    /**
     * Called when an NPC is right clicked.
     * 
     * @param event The event to call
     */
    public void onNPCRightClick(NPCRightClickEvent event) {
    }

    /**
     * Called when an NPC is spawned.
     * 
     * @param event The event to call
     */
    public void onNPCSpawn(NPCSpawnEvent event) {
    }
}
