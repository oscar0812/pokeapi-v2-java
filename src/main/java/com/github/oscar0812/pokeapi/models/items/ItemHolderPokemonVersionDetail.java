/* An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area. */

package com.github.oscar0812.pokeapi.models.items;

import com.github.oscar0812.pokeapi.models.games.Version;

public class ItemHolderPokemonVersionDetail {
	// How often this Pokémon holds this item in this version.
	private int rarity;

	// The version that this item is held in by the Pokémon.
	private Version version;

	public int getRarity() {
		return rarity;
	}

	public ItemHolderPokemonVersionDetail setRarity(int rarity) {
		this.rarity = rarity;
		return this;
	}

	public Version getVersion() {
		if(!version.getIsFetched()) {
			version = version.get();
		}
		return version;
	}

	public ItemHolderPokemonVersionDetail setVersion(Version version) {
		this.version = version;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}