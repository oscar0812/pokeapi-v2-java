/* Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles. */

package com.github.oscar0812.pokeapi.models.pokemon;

import java.util.ArrayList;

public class MoveStatAffectSets {
	// A list of moves and how they change the referenced stat.
	private ArrayList<MoveStatAffect> increase;

	// A list of moves and how they change the referenced stat.
	private ArrayList<MoveStatAffect> decrease;

	public ArrayList<MoveStatAffect> getIncrease() {
		return increase;
	}

	public MoveStatAffectSets setIncrease(ArrayList<MoveStatAffect> increase) {
		this.increase = increase;
		return this;
	}

	public ArrayList<MoveStatAffect> getDecrease() {
		return decrease;
	}

	public MoveStatAffectSets setDecrease(ArrayList<MoveStatAffect> decrease) {
		this.decrease = decrease;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}