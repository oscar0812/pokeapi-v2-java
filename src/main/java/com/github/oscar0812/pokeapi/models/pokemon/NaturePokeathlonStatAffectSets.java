/* Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See Bulbapedia for greater detail. */

package com.github.oscar0812.pokeapi.models.pokemon;

import java.util.ArrayList;

public class NaturePokeathlonStatAffectSets {
	// A list of natures and how they change the referenced Pokéathlon stat.
	private ArrayList<NaturePokeathlonStatAffect> increase;

	// A list of natures and how they change the referenced Pokéathlon stat.
	private ArrayList<NaturePokeathlonStatAffect> decrease;

	public ArrayList<NaturePokeathlonStatAffect> getIncrease() {
		return increase;
	}

	public NaturePokeathlonStatAffectSets setIncrease(ArrayList<NaturePokeathlonStatAffect> increase) {
		this.increase = increase;
		return this;
	}

	public ArrayList<NaturePokeathlonStatAffect> getDecrease() {
		return decrease;
	}

	public NaturePokeathlonStatAffectSets setDecrease(ArrayList<NaturePokeathlonStatAffect> decrease) {
		this.decrease = decrease;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}