/* Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See Bulbapedia for greater detail. */

package com.github.oscar0812.pokeapi.models.pokemon;

public class PokemonAbility {
	// Whether or not this is a hidden ability.
	private boolean is_hidden;

	// The slot this ability occupies in this Pokémon species.
	private int slot;

	// The ability the Pokémon may have.
	private Ability ability;

	public boolean getIsHidden() {
		return is_hidden;
	}

	public PokemonAbility setIsHidden(boolean is_hidden) {
		this.is_hidden = is_hidden;
		return this;
	}

	public int getSlot() {
		return slot;
	}

	public PokemonAbility setSlot(int slot) {
		this.slot = slot;
		return this;
	}

	public Ability getAbility() {
		if(!ability.getIsFetched()) {
			ability = ability.get();
		}
		return ability;
	}

	public PokemonAbility setAbility(Ability ability) {
		this.ability = ability;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}