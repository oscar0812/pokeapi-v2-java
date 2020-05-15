package pokeapi.bittle.models.utility;

import java.util.ArrayList;
import pokeapi.bittle.models.games.Version;

public class VersionEncounterDetail {
	// The game version this encounter happens in.
	private Version version;

	// The total percentage of all encounter potential.
	private int max_chance;

	// A list of encounters and their specifics.
	private ArrayList<Encounter> encounter_details;

	public Version getVersion() {
		if(!version.getIsFetched()) {
			version = version.get();
		}
		return version;
	}

	public VersionEncounterDetail setVersion(Version version) {
		this.version = version;
		return this;
	}

	public int getMaxChance() {
		return max_chance;
	}

	public VersionEncounterDetail setMaxChance(int max_chance) {
		this.max_chance = max_chance;
		return this;
	}

	public ArrayList<Encounter> getEncounterDetails() {
		return encounter_details;
	}

	public VersionEncounterDetail setEncounterDetails(ArrayList<Encounter> encounter_details) {
		this.encounter_details = encounter_details;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}