package pokemon;
public class AbilityFlavorText {
	// The localized name for an API resource in a specific language
	private String flavor_text;

	// The language this name is in
	private utility.Language language;

	// The version group that uses this flavor text
	private games.VersionGroup version_group;

	public String getFlavorText() {
		return flavor_text;
	}

	public AbilityFlavorText setFlavorText(String flavor_text) {
		this.flavor_text = flavor_text;
		return this;
	}

	public utility.Language getLanguage() {
		return language;
	}

	public AbilityFlavorText setLanguage(utility.Language language) {
		this.language = language;
		return this;
	}

	public games.VersionGroup getVersionGroup() {
		return version_group;
	}

	public AbilityFlavorText setVersionGroup(games.VersionGroup version_group) {
		this.version_group = version_group;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}