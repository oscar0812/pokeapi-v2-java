/* Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See Bulbapedia for greater detail. */

package com.github.oscar0812.pokeapi.models.pokemon;

public class PokemonType {
	// The order the Pokémon's types are listed in.
	private int slot;

	// The type the referenced Pokémon has.
	private Type type;

	public int getSlot() {
		return slot;
	}

	public PokemonType setSlot(int slot) {
		this.slot = slot;
		return this;
	}

	public Type getType() {
		if(!type.getIsFetched()) {
			type = type.get();
		}
		return type;
	}

	public PokemonType setType(Type type) {
		this.type = type;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}