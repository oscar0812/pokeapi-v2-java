/* Natures influence how a Pokémon's stats grow. See Bulbapedia for greater detail. */

package com.github.oscar0812.pokeapi.models.pokemon;

public class NatureStatChange {
	// The amount of change.
	private int max_change;

	// The stat being affected.
	private PokeathlonStat pokeathlon_stat;

	public int getMaxChange() {
		return max_change;
	}

	public NatureStatChange setMaxChange(int max_change) {
		this.max_change = max_change;
		return this;
	}

	public PokeathlonStat getPokeathlonStat() {
		if(!pokeathlon_stat.getIsFetched()) {
			pokeathlon_stat = pokeathlon_stat.get();
		}
		return pokeathlon_stat;
	}

	public NatureStatChange setPokeathlonStat(PokeathlonStat pokeathlon_stat) {
		this.pokeathlon_stat = pokeathlon_stat;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}