/* Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park . */

package com.github.oscar0812.pokeapi.models.locations;

import com.github.oscar0812.pokeapi.models.pokemon.PokemonSpecies;

public class PalParkEncounterSpecies {
	// The base score given to the player when this Pokémon is caught during a pal park run.
	private int base_score;

	// The base rate for encountering this Pokémon in this pal park area.
	private int rate;

	// The Pokémon species being encountered.
	private PokemonSpecies pokemon_species;

	public int getBaseScore() {
		return base_score;
	}

	public PalParkEncounterSpecies setBaseScore(int base_score) {
		this.base_score = base_score;
		return this;
	}

	public int getRate() {
		return rate;
	}

	public PalParkEncounterSpecies setRate(int rate) {
		this.rate = rate;
		return this;
	}

	public PokemonSpecies getPokemonSpecies() {
		if(!pokemon_species.getIsFetched()) {
			pokemon_species = pokemon_species.get();
		}
		return pokemon_species;
	}

	public PalParkEncounterSpecies setPokemonSpecies(PokemonSpecies pokemon_species) {
		this.pokemon_species = pokemon_species;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}