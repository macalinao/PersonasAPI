/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.personas.personasapi.npc;

import com.crimsonrpg.flaggables.api.Flaggable;
import com.crimsonrpg.personas.personasapi.persona.Persona;
import org.bukkit.Location;
import org.bukkit.entity.HumanEntity;

/**
 * Represents an NPC.
 */
public interface NPC extends Flaggable {

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
    public HumanEntity getBukkitHandle();

}