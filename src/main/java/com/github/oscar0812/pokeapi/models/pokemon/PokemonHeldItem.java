/* Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See Bulbapedia for greater detail. */

package com.github.oscar0812.pokeapi.models.pokemon;

import com.github.oscar0812.pokeapi.models.items.Item;
import java.util.ArrayList;

public class PokemonHeldItem {
	// The item the referenced Pokémon holds.
	private Item item;

	// The details of the different versions in which the item is held.
	private ArrayList<PokemonHeldItemVersion> version_details;

	public Item getItem() {
		if(!item.getIsFetched()) {
			item = item.get();
		}
		return item;
	}

	public PokemonHeldItem setItem(Item item) {
		this.item = item;
		return this;
	}

	public ArrayList<PokemonHeldItemVersion> getVersionDetails() {
		return version_details;
	}

	public PokemonHeldItem setVersionDetails(ArrayList<PokemonHeldItemVersion> version_details) {
		this.version_details = version_details;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}