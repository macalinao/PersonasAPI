/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.personas.personasapi.event.npc;

import org.bukkit.event.CustomEventListener;
import org.bukkit.event.Event;

/**
 * A listener for NPC-related events.
 */
public class NPCListener extends CustomEventListener {

    /**
     * Called when an NPC is created.
     * 
     * @param event The event to call
     */
    public void onNPCCreate(NPCCreateEvent event) {
    }

    /**
     * Called when an NPC is despawned.
     * 
     * @param event The event to call
     */
    public void onNPCDespawn(NPCDespawnEvent event) {
    }

    /**
     * Called when an NPC is deleted.
     * 
     * @param event The event to call
     */
    public void onNPCDestroy(NPCDestroyEvent event) {
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

    @Override
    public void onCustomEvent(Event event) {
        if (!(event instanceof NPCEvent)) {
            return;
        }
        NPCEvent npcEvent = (NPCEvent) event;

        switch (npcEvent.getEventType()) {
            case NPC_CREATE:
                this.onNPCCreate((NPCCreateEvent) event);
                return;

            case NPC_DESPAWN:
                this.onNPCDespawn((NPCDespawnEvent) event);
                return;

            case NPC_DESTROY:
                this.onNPCDestroy((NPCDestroyEvent) event);
                return;

            case NPC_LEFT_CLICK:
                this.onNPCLeftClick((NPCLeftClickEvent) event);
                return;

            case NPC_RIGHT_CLICK:
                this.onNPCRightClick((NPCRightClickEvent) event);
                return;

            case NPC_SPAWN:
                this.onNPCSpawn((NPCSpawnEvent) event);
                return;

        }
    }
}
