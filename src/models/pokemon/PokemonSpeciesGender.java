package models.pokemon;

import models.resource.named.PokemonSpecies;

public class PokemonSpeciesGender {
    // The chance of this Pokémon being female, in eighths; or -1 for genderless
    private int rate;

    // A Pokémon species that can be the referenced gender
    private PokemonSpecies pokemon_species;

    public PokemonSpeciesGender(int rate, PokemonSpecies pokemon_species) {
        this.rate = rate;
        this.pokemon_species = pokemon_species;
    }

    public int getRate() {
        return rate;
    }

    public PokemonSpecies getPokemonSpecies() {
        return pokemon_species;
    }
}
