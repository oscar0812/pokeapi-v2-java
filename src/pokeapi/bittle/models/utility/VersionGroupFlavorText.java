package pokeapi.bittle.models.utility;

public class VersionGroupFlavorText {
	public String getText() {
				return text;
	}

	public VersionGroupFlavorText setText(String text) {
		this.text = text;
		return this;
	}

	public pokeapi.bittle.models.utility.Language getLanguage() {
		if(!language.getIsFetched()) {
			language = language.get();
		}

		return language;
	}

	public VersionGroupFlavorText setLanguage(pokeapi.bittle.models.utility.Language language) {
		this.language = language;
		return this;
	}

	public pokeapi.bittle.models.games.VersionGroup getVersionGroup() {
		if(!version_group.getIsFetched()) {
			version_group = version_group.get();
		}

		return version_group;
	}

	public VersionGroupFlavorText setVersionGroup(pokeapi.bittle.models.games.VersionGroup version_group) {
		this.version_group = version_group;
		return this;
	}

	// The localized name for an API resource in a specific language.
	private String text;

	// The language this name is in.
	private pokeapi.bittle.models.utility.Language language;

	// The version group which uses this flavor text.
	private pokeapi.bittle.models.games.VersionGroup version_group;

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}