/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.personas.personasapi;

import com.crimsonrpg.personas.personasapi.npc.NPCManager;
import com.crimsonrpg.personas.personasapi.persona.PersonaManager;

/**
 * The main way to hook into Personas.
 */
public class Personas {
    private static Personas instance = new Personas();
    
    private NPCManager npcManager = null;
    private PersonaManager personaManager = null;
    
    private Personas() {}
    
    /**
     * Gets the instance of Personas.
     * 
     * @return The Personas instance.
     */
    public static Personas getInstance() {
        return instance;
    }
    
    /**
     * Gets the Personas NPC manager.
     * 
     * @return The NPC Manager
     */
    public static NPCManager getNPCManager() {
        return getInstance().npcManager;
    }
    
    public void setNPCManager(NPCManager npcManager) {
        if (this.npcManager == null) {
            this.npcManager = npcManager;
        }
    }
    
    /**
     * Gets the Personas Persona Manager.
     * 
     * @return The Persona manager
     */
    public static PersonaManager getPersonaManager() {
        return getInstance().personaManager;
    }
    
    public void setPersonaManager(PersonaManager personaManager) {
        if (this.personaManager == null) {
            this.personaManager = personaManager;
        }
    }
}
