/* Pokémon Location Areas are ares where Pokémon can be found. */

package com.github.oscar0812.pokeapi.models.pokemon;

import com.github.oscar0812.pokeapi.models.locations.LocationArea;
import com.github.oscar0812.pokeapi.models.utility.VersionEncounterDetail;
import java.util.ArrayList;

public class LocationAreaEncounter {
	// The location area the referenced Pokémon can be encountered in.
	private LocationArea location_area;

	// A list of versions and encounters with the referenced Pokémon that might happen.
	private ArrayList<VersionEncounterDetail> version_details;

	public LocationArea getLocationArea() {
		if(!location_area.getIsFetched()) {
			location_area = location_area.get();
		}
		return location_area;
	}

	public LocationAreaEncounter setLocationArea(LocationArea location_area) {
		this.location_area = location_area;
		return this;
	}

	public ArrayList<VersionEncounterDetail> getVersionDetails() {
		return version_details;
	}

	public LocationAreaEncounter setVersionDetails(ArrayList<VersionEncounterDetail> version_details) {
		this.version_details = version_details;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}