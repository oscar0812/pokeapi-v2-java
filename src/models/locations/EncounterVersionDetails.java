package models.locations;
public class EncounterVersionDetails {
	// The chance of an encounter to occur.
	private int rate;

	// The version of the game in which the encounter can occur with the given chance.
	private models.games.Version version;

	public int getRate() {
		return rate;
	}

	public EncounterVersionDetails setRate(int rate) {
		this.rate = rate;
		return this;
	}

	public models.games.Version getVersion() {
		return version;
	}

	public EncounterVersionDetails setVersion(models.games.Version version) {
		this.version = version;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}