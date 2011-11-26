/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.personas.personasapi.npc;

import com.crimsonrpg.personas.personasapi.persona.Persona;
import java.util.List;
import org.bukkit.Location;
import org.bukkit.entity.HumanEntity;

/**
 * Represents an NPC.
 */
public interface NPC extends HumanEntity {

    /**
     * Gets the ID of this NPC.
     * 
     * @return 
     */
    public String getId();

    /**
     * Gets the in-game display name of this NPC.
     * 
     * @return 
     */
    public String getName();

    /**
     * Gets a certain {@link Trait} of this NPC.
     * 
     * @param <T> The type of {@link Trait}.
     * @param type The type of {@link Trait}.
     * @return The {@link Trait}.
     */
    public <T extends Trait> T getTrait(Class<T> type);

    /**
     * Sets a {@link Trait} of this NPC.
     * 
     * @param trait The {@link Trait} to set.
     */
    public void setTrait(Trait trait);

    /**
     * Gets a list of all of an NPC's traits.
     * 
     * @return 
     */
    public List<Trait> getTraits();

    /**
     * Gets the {@link Persona} this NPC is affiliated with.
     * 
     * @return 
     */
    public Persona getPersona();

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
     * Deletes this NPC from the server.
     */
    public void delete();

    /**
     * Gets the corresponding Bukkit handle of the NPC.
     * 
     * @return The Bukkit handle of the NPC.
     */
    public HumanEntity getBukkitHandle();

}