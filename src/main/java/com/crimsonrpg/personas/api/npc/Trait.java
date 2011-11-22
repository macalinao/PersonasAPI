/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.personas.api.npc;

import org.bukkit.configuration.ConfigurationSection;

/**
 * Represents a trait of an NPC.
 */
public interface Trait {
    /**
     * Loads the trait from a ConfigurationSection.
     * @param section 
     */
    public void load(ConfigurationSection section);
    
    /**
     * Saves the trait to a ConfigurationSection.
     * @param section 
     */
    public void save(ConfigurationSection section);
    
    /**
     * Resets the trait to defaults.
     */
    public void reset();
}
