/* Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See Bulbapedia for greater detail. */

package com.github.oscar0812.pokeapi.models.pokemon;

import com.github.oscar0812.pokeapi.models.games.Version;

public class PokemonHeldItemVersion {
	// The version in which the item is held.
	private Version version;

	// How often the item is held.
	private int rarity;

	public Version getVersion() {
		if(!version.getIsFetched()) {
			version = version.get();
		}
		return version;
	}

	public PokemonHeldItemVersion setVersion(Version version) {
		this.version = version;
		return this;
	}

	public int getRarity() {
		return rarity;
	}

	public PokemonHeldItemVersion setRarity(int rarity) {
		this.rarity = rarity;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}