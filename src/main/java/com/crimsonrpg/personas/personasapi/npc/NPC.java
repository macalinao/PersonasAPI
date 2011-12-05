/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.personas.personasapi.npc;

import com.crimsonrpg.flaggables.api.Flaggable;
import org.bukkit.Location;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.LivingEntity;

/**
 * Represents an NPC.
 */
public interface NPC<T extends LivingEntity> extends Flaggable {

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