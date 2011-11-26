/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.personas.personasapi;

import com.crimsonrpg.personas.personasapi.npc.NPCManager;

/**
 * The main way to hook into Personas.
 */
public class Personas {
    private static Personas instance = new Personas();
    
    private NPCManager npcManager = null;
    
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
     * @return 
     */
    public static NPCManager getNPCManager() {
        return getInstance().npcManager;
    }
    
    public void setNPCManager(NPCManager npcManager) {
        if (this.npcManager == null) {
            this.npcManager = npcManager;
        }
    }
}
