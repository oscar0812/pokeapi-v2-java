/* Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles. */

package com.github.oscar0812.pokeapi.models.pokemon;

import java.util.ArrayList;

public class NatureStatAffectSets {
	// A list of natures and how they change the referenced stat.
	private ArrayList<Nature> increase;

	// A list of nature sand how they change the referenced stat.
	private ArrayList<Nature> decrease;

	public ArrayList<Nature> getIncrease() {
		return increase;
	}

	public NatureStatAffectSets setIncrease(ArrayList<Nature> increase) {
		this.increase = increase;
		return this;
	}

	public ArrayList<Nature> getDecrease() {
		return decrease;
	}

	public NatureStatAffectSets setDecrease(ArrayList<Nature> decrease) {
		this.decrease = decrease;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}