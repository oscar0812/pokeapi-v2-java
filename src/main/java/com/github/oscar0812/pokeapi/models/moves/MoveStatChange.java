/* Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas. */

package com.github.oscar0812.pokeapi.models.moves;

import com.github.oscar0812.pokeapi.models.pokemon.Stat;

public class MoveStatChange {
	// The amount of change.
	private int change;

	// The stat being affected.
	private Stat stat;

	public int getChange() {
		return change;
	}

	public MoveStatChange setChange(int change) {
		this.change = change;
		return this;
	}

	public Stat getStat() {
		if(!stat.getIsFetched()) {
			stat = stat.get();
		}
		return stat;
	}

	public MoveStatChange setStat(Stat stat) {
		this.stat = stat;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}