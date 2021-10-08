/* Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See Bulbapedia for greater detail. */

package com.github.oscar0812.pokeapi.models.pokemon;

public class PokemonStat {
	// The stat the Pokémon has.
	private Stat stat;

	// The effort points (EV) the Pokémon has in the stat.
	private int effort;

	// The base value of the stat.
	private int base_stat;

	public Stat getStat() {
		if(!stat.getIsFetched()) {
			stat = stat.get();
		}
		return stat;
	}

	public PokemonStat setStat(Stat stat) {
		this.stat = stat;
		return this;
	}

	public int getEffort() {
		return effort;
	}

	public PokemonStat setEffort(int effort) {
		this.effort = effort;
		return this;
	}

	public int getBaseStat() {
		return base_stat;
	}

	public PokemonStat setBaseStat(int base_stat) {
		this.base_stat = base_stat;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}