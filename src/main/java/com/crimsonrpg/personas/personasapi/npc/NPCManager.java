/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.personas.personasapi.npc;

import org.bukkit.Location;

import com.crimsonrpg.flaggables.api.FlaggableManager;

/**
 * Represents a manager for {@link NPC}s.
 */
public interface NPCManager extends FlaggableManager<NPC> {

    public void spawnNPC(String id, Location location);

    public void spawnNPC(NPC npc, Location location);

    public void despawnNPC(String id);

    public void despawnNPC(NPC npc);

}