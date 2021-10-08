/* A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant. */

package com.github.oscar0812.pokeapi.models.pokemon;

import com.github.oscar0812.pokeapi.models.locations.PalParkArea;

public class PalParkEncounterArea {
	// The base score given to the player when the referenced Pokémon is caught during a pal park run.
	private int base_score;

	// The base rate for encountering the referenced Pokémon in this pal park area.
	private int rate;

	// The pal park area where this encounter happens.
	private PalParkArea area;

	public int getBaseScore() {
		return base_score;
	}

	public PalParkEncounterArea setBaseScore(int base_score) {
		this.base_score = base_score;
		return this;
	}

	public int getRate() {
		return rate;
	}

	public PalParkEncounterArea setRate(int rate) {
		this.rate = rate;
		return this;
	}

	public PalParkArea getArea() {
		if(!area.getIsFetched()) {
			area = area.get();
		}
		return area;
	}

	public PalParkEncounterArea setArea(PalParkArea area) {
		this.area = area;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}