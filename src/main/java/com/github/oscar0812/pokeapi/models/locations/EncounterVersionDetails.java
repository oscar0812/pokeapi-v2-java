/* Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters. */

package com.github.oscar0812.pokeapi.models.locations;

import com.github.oscar0812.pokeapi.models.games.Version;

public class EncounterVersionDetails {
	// The chance of an encounter to occur.
	private int rate;

	// The version of the game in which the encounter can occur with the given chance.
	private Version version;

	public int getRate() {
		return rate;
	}

	public EncounterVersionDetails setRate(int rate) {
		this.rate = rate;
		return this;
	}

	public Version getVersion() {
		if(!version.getIsFetched()) {
			version = version.get();
		}
		return version;
	}

	public EncounterVersionDetails setVersion(Version version) {
		this.version = version;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}