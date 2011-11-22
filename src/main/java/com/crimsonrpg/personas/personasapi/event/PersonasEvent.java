/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.personas.personasapi.event;

import org.bukkit.event.Event;

/**
 * Represents a Personas-related event.
 */
public class PersonasEvent extends Event {
    private EventType type;
    
    public PersonasEvent(EventType type) {
        super("PERSONAS_" + type.name());
    }

    public EventType getEventType() {
        return type;
    }
    
}
