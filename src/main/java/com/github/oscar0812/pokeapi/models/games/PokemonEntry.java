/* A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See Bulbapedia for greater detail. */

package com.github.oscar0812.pokeapi.models.games;

import com.github.oscar0812.pokeapi.models.pokemon.PokemonSpecies;

public class PokemonEntry {
	// The index of this Pokémon species entry within the Pokédex.
	private int entry_number;

	// The Pokémon species being encountered.
	private PokemonSpecies pokemon_species;

	public int getEntryNumber() {
		return entry_number;
	}

	public PokemonEntry setEntryNumber(int entry_number) {
		this.entry_number = entry_number;
		return this;
	}

	public PokemonSpecies getPokemonSpecies() {
		if(!pokemon_species.getIsFetched()) {
			pokemon_species = pokemon_species.get();
		}
		return pokemon_species;
	}

	public PokemonEntry setPokemonSpecies(PokemonSpecies pokemon_species) {
		this.pokemon_species = pokemon_species;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}