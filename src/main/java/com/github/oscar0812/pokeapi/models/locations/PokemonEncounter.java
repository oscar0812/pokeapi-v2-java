/* Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters. */

package com.github.oscar0812.pokeapi.models.locations;

import com.github.oscar0812.pokeapi.models.pokemon.Pokemon;
import com.github.oscar0812.pokeapi.models.utility.VersionEncounterDetail;
import java.util.ArrayList;

public class PokemonEncounter {
	// The Pokémon being encountered.
	private Pokemon pokemon;

	// A list of versions and encounters with Pokémon that might happen in the referenced location area.
	private ArrayList<VersionEncounterDetail> version_details;

	public Pokemon getPokemon() {
		if(!pokemon.getIsFetched()) {
			pokemon = pokemon.get();
		}
		return pokemon;
	}

	public PokemonEncounter setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
		return this;
	}

	public ArrayList<VersionEncounterDetail> getVersionDetails() {
		return version_details;
	}

	public PokemonEncounter setVersionDetails(ArrayList<VersionEncounterDetail> version_details) {
		this.version_details = version_details;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}