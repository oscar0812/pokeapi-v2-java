package pokeapi.bittle.models.utility;

public class FlavorText {
	// The localized flavor text for an API resource in a specific language.
	private String flavor_text;

	// The language this name is in.
	private pokeapi.bittle.models.utility.Language language;

	// The game version this flavor text is extracted from.
	private pokeapi.bittle.models.games.Version version;

	public String getFlavorText() {
		return flavor_text;
	}

	public FlavorText setFlavorText(String flavor_text) {
		this.flavor_text = flavor_text;
		return this;
	}

	public pokeapi.bittle.models.utility.Language getLanguage() {
		if(!language.getIsFetched()) {
			language = language.get();
		}
		return language;
	}

	public FlavorText setLanguage(pokeapi.bittle.models.utility.Language language) {
		this.language = language;
		return this;
	}

	public pokeapi.bittle.models.games.Version getVersion() {
		if(!version.getIsFetched()) {
			version = version.get();
		}
		return version;
	}

	public FlavorText setVersion(pokeapi.bittle.models.games.Version version) {
		this.version = version;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}