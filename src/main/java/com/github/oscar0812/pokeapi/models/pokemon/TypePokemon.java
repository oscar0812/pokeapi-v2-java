/* Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against. */

package com.github.oscar0812.pokeapi.models.pokemon;

public class TypePokemon {
	// The order the Pokémon's types are listed in.
	private int slot;

	// The Pokémon that has the referenced type.
	private Pokemon pokemon;

	public int getSlot() {
		return slot;
	}

	public TypePokemon setSlot(int slot) {
		this.slot = slot;
		return this;
	}

	public Pokemon getPokemon() {
		if(!pokemon.getIsFetched()) {
			pokemon = pokemon.get();
		}
		return pokemon;
	}

	public TypePokemon setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}