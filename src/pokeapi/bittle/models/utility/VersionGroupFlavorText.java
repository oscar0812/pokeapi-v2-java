package pokeapi.bittle.models.utility;

import pokeapi.bittle.models.games.VersionGroup;

public class VersionGroupFlavorText {
	// The localized name for an API resource in a specific language.
	private String text;

	// The language this name is in.
	private Language language;

	// The version group which uses this flavor text.
	private VersionGroup version_group;

	public String getText() {
		return text;
	}

	public VersionGroupFlavorText setText(String text) {
		this.text = text;
		return this;
	}

	public Language getLanguage() {
		if(!language.getIsFetched()) {
			language = language.get();
		}
		return language;
	}

	public VersionGroupFlavorText setLanguage(Language language) {
		this.language = language;
		return this;
	}

	public VersionGroup getVersionGroup() {
		if(!version_group.getIsFetched()) {
			version_group = version_group.get();
		}
		return version_group;
	}

	public VersionGroupFlavorText setVersionGroup(VersionGroup version_group) {
		this.version_group = version_group;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}