/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.personas.personasapi.event.npc;

import org.bukkit.event.CustomEventListener;
import org.bukkit.event.Event;

/**
 * A listener for NPC-related events.
 * 
 * TODO: this
 */
public class NPCListener extends CustomEventListener {
    @Override
    public void onCustomEvent(Event event) {
        if (!(event instanceof NPCEvent)) return;
        NPCEvent npcEvent = (NPCEvent) event;
    }
}
