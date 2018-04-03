package models.moves;
public class MoveFlavorText {
	// The localized flavor text for an api models.resource in a specific language
	private String flavor_text;

	// The language this name is in
	private models.utility.Language language;

	// The version group that uses this flavor text
	private models.games.VersionGroup version_group;

	public String getFlavorText() {
		return flavor_text;
	}

	public MoveFlavorText setFlavorText(String flavor_text) {
		this.flavor_text = flavor_text;
		return this;
	}

	public models.utility.Language getLanguage() {
		return language;
	}

	public MoveFlavorText setLanguage(models.utility.Language language) {
		this.language = language;
		return this;
	}

	public models.games.VersionGroup getVersionGroup() {
		return version_group;
	}

	public MoveFlavorText setVersionGroup(models.games.VersionGroup version_group) {
		this.version_group = version_group;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}