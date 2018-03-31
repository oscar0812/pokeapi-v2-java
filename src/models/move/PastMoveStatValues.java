package models.move;

import models.VerboseEffect;
import models.resource.named.Type;
import models.resource.named.VersionGroup;

import java.util.ArrayList;

public class PastMoveStatValues {
    // The percent value of how likely this move is to be successful
    private int accuracy;

    // The percent value of how likely it is this moves effect will take effect
    private int effect_chance;

    // The base power of this move with a value of 0 if it does not have a base power
    private int power;

    // Power points. The number of times this move can be used
    private int pp;

    // The effect of this move listed in different languages
    private ArrayList<VerboseEffect> effect_entries;

    // The elemental type of this move
    private Type type;

    // The version group in which these move stat values were in effect
    private VersionGroup version_group;

    public PastMoveStatValues(int accuracy, int effect_chance, int power, int pp, ArrayList<VerboseEffect> effect_entries, Type type, VersionGroup version_group) {
        this.accuracy = accuracy;
        this.effect_chance = effect_chance;
        this.power = power;
        this.pp = pp;
        this.effect_entries = effect_entries;
        this.type = type;
        this.version_group = version_group;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public int getEffectChance() {
        return effect_chance;
    }

    public int getPower() {
        return power;
    }

    public int getPP() {
        return pp;
    }

    public ArrayList<VerboseEffect> getEffectEntries() {
        return effect_entries;
    }

    public Type getType() {
        return type;
    }

    public VersionGroup getVersionGroup() {
        return version_group;
    }
}
