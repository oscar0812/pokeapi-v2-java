/* An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area. */

package com.github.oscar0812.pokeapi.models.items;

public class ItemSprites {
	// The default depiction of this item.
	@com.fasterxml.jackson.annotation.JsonProperty("default")
	private String default_val;

	public String getDefault() {
		return default_val;
	}

	public ItemSprites setDefault(String default_val) {
		this.default_val = default_val;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}