/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.personas.personasapi.npc;

import com.crimsonrpg.flaggables.api.Flag;
import org.bukkit.Location;

import com.crimsonrpg.flaggables.api.FlaggableManager;
import com.crimsonrpg.personas.personasapi.persona.Persona;
import java.util.List;
import org.bukkit.entity.LivingEntity;

/**
 * Represents a manager for {@link NPC}s.
 */
public interface NPCManager extends FlaggableManager<NPC> {

    public NPC createNPC(String name, List<Flag> flags, Persona persona);

    public NPC createNPC(String id, String name, List<Flag> flags, Persona persona);

    public void spawnNPC(String id, Location location);

    public void spawnNPC(NPC npc, Location location);

    public void despawnNPC(String id);

    public void despawnNPC(NPC npc);

    /**
     * Gets the NPC associated with the given Bukkit entity if it exists.
     * 
     * @param entity The Bukkit entity.
     * @return The NPC associated with the LivingEntity.
     */
    public NPC fromBukkitEntity(LivingEntity entity);
}