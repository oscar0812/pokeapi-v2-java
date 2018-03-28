package models.resource.named;

import models.*;

import java.util.ArrayList;

public class Ability extends NamedAPIResource {
    // The identifier for this ability resource
    private int id;

    // Whether or not this ability originated in the main series of the video games
    private boolean is_main_series;

    // The generation this ability originated in
    private Generation generation;

    // The name of this ability listed in different languages
    private ArrayList<Name> names;

    // The effect of this ability listed in different languages
    private VerboseEffect effect_entries;

    // The list of previous effects this ability has had across version groups
    private ArrayList<AbilityEffectChange> effect_changes;

    // The flavor text of this ability listed in different languages
    private ArrayList<AbilityFlavorText> flavor_text_entries;

    // A list of Pokémon that could potentially have this ability
    private ArrayList<AbilityPokemon> pokemon;

    public Ability(String url, String name, int id, boolean is_main_series, Generation generation,
                   ArrayList<Name> names, VerboseEffect effect_entries, ArrayList<AbilityEffectChange> effect_changes,
                   ArrayList<AbilityFlavorText> flavor_text_entries, ArrayList<AbilityPokemon> pokemon){
        this.url = url;
        this.name = name;
        this.id =id;
        this.is_main_series = is_main_series;
        this.generation = generation;
        this.names = names;
        this.effect_entries = effect_entries;
        this.effect_changes = effect_changes;
        this.flavor_text_entries = flavor_text_entries;
        this.pokemon = pokemon;
    }

    public boolean isMainSeries() {
        return is_main_series;
    }

    public Generation getGeneration() {
        return generation;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public VerboseEffect getEffectEntries() {
        return effect_entries;
    }

    public ArrayList<AbilityEffectChange> getEffectChanges() {
        return effect_changes;
    }

    public ArrayList<AbilityFlavorText> getFlavorTextEntries() {
        return flavor_text_entries;
    }

    public ArrayList<AbilityPokemon> getPokemon() {
        return pokemon;
    }
}
