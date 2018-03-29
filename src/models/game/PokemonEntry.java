package models.game;

import models.resource.named.PokemonSpecies;

public class PokemonEntry {
    // The index of this Pokémon species entry within the Pokédex
    private int entry_number;

    // The Pokémon species being encountered
    private PokemonSpecies pokemon_species;

    public PokemonEntry(int entry_number, PokemonSpecies pokemon_species){
        this.entry_number = entry_number;
        this.pokemon_species = pokemon_species;
    }

    public int getEntryNumber() {
        return entry_number;
    }

    public PokemonSpecies getPokemonSpecies() {
        return pokemon_species;
    }
}
