/* A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant. */

package com.github.oscar0812.pokeapi.models.pokemon;

public class PokemonSpeciesVariety {
	// Whether this variety is the default variety.
	private boolean is_default;

	// The Pokémon variety.
	private Pokemon pokemon;

	public boolean getIsDefault() {
		return is_default;
	}

	public PokemonSpeciesVariety setIsDefault(boolean is_default) {
		this.is_default = is_default;
		return this;
	}

	public Pokemon getPokemon() {
		if(!pokemon.getIsFetched()) {
			pokemon = pokemon.get();
		}
		return pokemon;
	}

	public PokemonSpeciesVariety setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}