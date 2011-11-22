/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.personas.personasapi.persona;

/**
 * Represents a Persona, an organized pattern of 
 * behavioral characteristics of an NPC.
 */
public interface Persona {
    /**
     * Gets the user-friendly, unique name of the Persona.
     * 
     * @return The Persona's name.
     */
    public String getName();
}