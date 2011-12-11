/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.personas.personasapi.npc;

import com.crimsonrpg.flaggables.api.Flaggable;
import com.crimsonrpg.personas.personasapi.persona.Persona;
import org.bukkit.Location;
import org.bukkit.entity.LivingEntity;

/**
 * Represents an NPC.
 */
public interface NPC<T extends LivingEntity> extends Flaggable {
    /**
     * Gets the Persona of the NPC.
     * 
     * @return The Persona of the NPC.
     */
    public Persona getPersona();
    
    /**
     * Sets the persona.
     * 
     * @param persona The name of the persona to set.
     * @return The NPC.
     */
    public NPC<T> setPersona(String persona);
    
    /**
     * Gets the name of this NPC.
     * 
     * @return The NPC's name
     */
    public String getName();
    
    /**
     * Gets the full name of this NPC.
     * 
     * @return The NPC's full name
     */
    public String getFullName();
    
    /**
     * Sets the name of this NPC.
     * 
     * @param name The name of the NPC.
     * @return 
     */
    public NPC<T> setName(String name);
    
    /**
     * Spawns this NPC at the given location.
     * 
     * @param location The Location to spawn the NPC at.
     */
    public void spawn(Location location);

    /**
     * Despawns this NPC.
     */
    public void despawn();

    /**
     * Gets the corresponding Bukkit handle of the NPC.
     * 
     * @return The Bukkit handle of the NPC.
     */
    public T getBukkitHandle();

}