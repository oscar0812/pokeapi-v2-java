package models.location;

import models.resource.named.PokemonSpecies;

public class PalParkEncounterSpecies {
    // The base score given to the player when this Pokémon is caught during a pal park run
    private int base_score;

    // The base rate for encountering this Pokémon in this pal park area
    private int rate;

    // The Pokémon species being encountered
    private PokemonSpecies pokemon_species;

    public PalParkEncounterSpecies(int base_score, int rate, PokemonSpecies pokemon_species) {
        this.base_score = base_score;
        this.rate = rate;
        this.pokemon_species = pokemon_species;
    }

    public int getBaseScore() {
        return base_score;
    }

    public int getRate() {
        return rate;
    }

    public PokemonSpecies getPokemonSpecies() {
        return pokemon_species;
    }
}
