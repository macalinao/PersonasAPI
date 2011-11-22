/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.personas.personasapi.npc;

import com.crimsonrpg.personas.personasapi.persona.Persona;
import java.util.List;
import org.bukkit.Location;

/**
 * Represents a manager for {@link NPC}s.
 */
public interface NPCManager {
    /**
     * Registers a {@link Trait} with the NPC manager.
     * <p>NOTE: Register {@link Trait}s in the constructor of your
     * plugin otherwise traits may not load correctly.
     * 
     * @param trait The type of the {@link Trait}.
     */
    public void registerTrait(Class<? extends Trait> type);
    
    /**
     * Gets a registered trait from its name.
     * 
     * @param name The name of the Trait.
     * @return The Trait's type.
     */
    public Class<? extends Trait> getTraitType(String name);
    
    /**
     * Spawns an {@link NPC} with the given parameters.
     * 
     * @param name The name of the {@link NPC} as shown in-game. (Must be 16 characters or less)
     * @param location The location to spawn the (@link NPC} at.
     * @param traits The {@link Trait}s of the {@link NPC}.
     * @param persona  The {@link Persona} that this {@link NPC} possesses.
     * @return The {@link NPC} that was spawned.
     */
    public NPC spawnNPC(String name, Location location, List<Trait> traits, Persona persona);
    
    /**
     * Spawns an {@link NPC} with the given parameters.
     * 
     * @param id The internal ID of the {@link NPC}.
     *      If this ID is taken, then the {@link NPC} will not be spawned.
     *      Instead, the old NPC with that ID will be returned.
     * @param name The name of the {@link NPC} as shown in-game. (Must be 16 characters or less)
     * @param location The location to spawn the (@link NPC} at.
     * @param traits The {@link Trait}s of the {@link NPC}.
     * @param persona  The {@link Persona} that this {@link NPC} possesses.
     * @return The NPC that was spawned or the original NPC.
     */
    public NPC spawnNPC(String id, String name, Location location, List<Trait> traits, Persona persona);
    
    /**
     * Despawns the {@link NPC} with the given id if found and removes
     * it from the server permanently.
     * 
     * @param id The id of the {@link NPC} to despawn.
     * @return True if the despawn was successful.
     */
    public boolean despawnNPC(String id);
    
    /**
     * Despawns the given {@link NPC} and removes it from the server permanently.
     * 
     * @param npc The {@link NPC} to despawn.
     */
    public void despawnNPC(NPC npc);
    
    /**
     * Gets an {@link NPC} from its ID.
     * 
     * @param id
     * @return The {@link NPC} associated with the given id.
     */
    public NPC getNPC(String id);
    
    /**
     * Gets a list of all {@link NPC}s on the server.
     * 
     * @return A list of all {@link NPC}s.
     */
    public List<NPC> getNPCs();
}