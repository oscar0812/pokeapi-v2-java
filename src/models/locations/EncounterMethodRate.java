package models.locations;
public class EncounterMethodRate {
	// The method in which Pokémon may be encountered in an area.
	private models.encounters.EncounterMethod encounter_method;

	// The chance of the encounter to occur on a version of the game.
	private java.util.ArrayList<models.locations.EncounterVersionDetails> version_details;

	public models.encounters.EncounterMethod getEncounterMethod() {
		return encounter_method;
	}

	public EncounterMethodRate setEncounterMethod(models.encounters.EncounterMethod encounter_method) {
		this.encounter_method = encounter_method;
		return this;
	}

	public java.util.ArrayList<models.locations.EncounterVersionDetails> getVersionDetails() {
		return version_details;
	}

	public EncounterMethodRate setVersionDetails(java.util.ArrayList<models.locations.EncounterVersionDetails> version_details) {
		this.version_details = version_details;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}