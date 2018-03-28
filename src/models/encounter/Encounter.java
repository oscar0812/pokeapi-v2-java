package models.encounter;

import models.resource.named.EncounterConditionValue;
import models.resource.named.EncounterMethod;

import java.util.ArrayList;

public class Encounter {
    // The lowest level the Pokémon could be encountered at
    private int min_level;

    // The highest level the Pokémon could be encountered at
    private int max_level;

    // A list of condition values that must be in effect for this encounter to occur
    private ArrayList<EncounterConditionValue> conditionValues;

    // percent chance that this encounter will occur
    private int chance;

    // The method by which this encounter happens
    private EncounterMethod method;

    public Encounter(int min_level, int max_level, int chance, EncounterMethod method) {
        this.min_level = min_level;
        this.max_level = max_level;
        this.chance = chance;
        this.method = method;
    }

    public int getMinLevel() {
        return min_level;
    }

    public int getMaxLevel() {
        return max_level;
    }

    public ArrayList<EncounterConditionValue> getConditionValues() {
        return conditionValues;
    }

    public int getChance() {
        return chance;
    }

    public EncounterMethod getMethod() {
        return method;
    }

    public void setConditionValues(ArrayList<EncounterConditionValue> conditionValues) {
        this.conditionValues = conditionValues;
    }
}
