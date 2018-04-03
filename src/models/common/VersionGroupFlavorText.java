package models.common;
public class VersionGroupFlavorText {
	// The localized name for an API resource in a specific language
	private String text;

	// The language this name is in
	private models.utility.Language language;

	// The version group which uses this flavor text
	private models.games.VersionGroup version_group;

	public String getText() {
		return text;
	}

	public VersionGroupFlavorText setText(String text) {
		this.text = text;
		return this;
	}

	public models.utility.Language getLanguage() {
		return language;
	}

	public VersionGroupFlavorText setLanguage(models.utility.Language language) {
		this.language = language;
		return this;
	}

	public models.games.VersionGroup getVersionGroup() {
		return version_group;
	}

	public VersionGroupFlavorText setVersionGroup(models.games.VersionGroup version_group) {
		this.version_group = version_group;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}