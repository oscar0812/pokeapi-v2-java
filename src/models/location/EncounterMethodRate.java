package models.location;

import models.resource.named.EncounterMethod;

import java.util.ArrayList;

public class EncounterMethodRate {
    // The method in which Pokémon may be encountered in an area.
    private EncounterMethod encounter_method;

    // The chance of the encounter to occur on a version of the game.
    private ArrayList<EncounterVersionDetails> version_details;

    public EncounterMethodRate(EncounterMethod encounter_method,ArrayList<EncounterVersionDetails> version_details) {
        this.encounter_method = encounter_method;
        this.version_details = version_details;
    }

    public EncounterMethod getEncounterMethod() {
        return encounter_method;
    }

    public ArrayList<EncounterVersionDetails> getVersionDetails() {
        return version_details;
    }
}