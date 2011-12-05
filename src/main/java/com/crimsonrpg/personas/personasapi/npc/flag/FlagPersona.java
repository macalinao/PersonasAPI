/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrpg.personas.personasapi.npc.flag;

import com.crimsonrpg.flaggables.api.FlagId;
import com.crimsonrpg.flaggables.api.GenericFlag;
import com.crimsonrpg.personas.personasapi.Personas;
import com.crimsonrpg.personas.personasapi.npc.NPC;
import com.crimsonrpg.personas.personasapi.persona.Persona;
import org.bukkit.configuration.ConfigurationSection;

/**
 *
 * @author simplyianm
 */
@FlagId("npc-persona")
public class FlagPersona extends GenericFlag<NPC> {
    private Persona persona;

    @Override
    public void load(ConfigurationSection section) {
        persona = Personas.getPersonaManager().getPersona(section.getString("name"));
    }

    @Override
    public void save(ConfigurationSection section) {
        section.set("name", persona.getName());
    }

    @Override
    public void reset() {
        persona = null;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
