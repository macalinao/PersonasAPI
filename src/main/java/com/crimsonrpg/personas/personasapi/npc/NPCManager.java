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
     * Creates an {@link NPC} with the given parameters.
     * 
     * @param name The name of the {@link NPC} as shown in-game. (Must be 16 characters or less)
     * @param traits The {@link Trait}s of the {@link NPC}.
     * @param persona  The {@link Persona} that this {@link NPC} possesses.
     * @return The {@link NPC} that was spawned.
     */
    public NPC createNPC(String name, List<Trait> traits, Persona persona);

    /**
     * Creates an {@link NPC} with the given parameters.
     * 
     * @param id The internal ID of the {@link NPC}.
     *      If this ID is taken, then the {@link NPC} will not be spawned.
     *      Instead, the old NPC with that ID will be returned.
     * @param name The name of the {@link NPC} as shown in-game. (Must be 16 characters or less)
     * @param traits The {@link Trait}s of the {@link NPC}.
     * @param persona  The {@link Persona} that this {@link NPC} possesses.
     * @return The NPC that was created or the original NPC.
     */
    public NPC createNPC(String id, String name, List<Trait> traits, Persona persona);

    /**
     * Deletes the {@link NPC} from the server permanently.
     * 
     * @param id The id of the {@link NPC} to delete.
     * @return True if the deletion was successful.
     */
    public boolean deleteNPC(String id);

    /**
     * Deletes the given {@link NPC} from the server permanently.
     * 
     * @param npc The {@link NPC} to delete.
     */
    public void deleteNPC(NPC npc);

    public void spawnNPC(String id, Location location);

    public void spawnNPC(NPC npc, Location location);

    public void despawnNPC(String id);

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