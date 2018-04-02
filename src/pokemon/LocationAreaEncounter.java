package pokemon;
public class LocationAreaEncounter {
	// The location area the referenced Pokémon can be encountered in
	private locations.LocationArea location_area;

	// A list of versions and encounters with the referenced Pokémon that might happen
	private java.util.ArrayList<common.VersionEncounterDetail> version_details;

	public locations.LocationArea getLocationArea() {
		return location_area;
	}

	public LocationAreaEncounter setLocationArea(locations.LocationArea location_area) {
		this.location_area = location_area;
		return this;
	}

	public java.util.ArrayList<common.VersionEncounterDetail> getVersionDetails() {
		return version_details;
	}

	public LocationAreaEncounter setVersionDetails(java.util.ArrayList<common.VersionEncounterDetail> version_details) {
		this.version_details = version_details;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}