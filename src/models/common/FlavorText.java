package models.common;
public class FlavorText {
	// The localized flavor text for an API resource in a specific language
	private String flavor_text;

	// The language this name is in
	private models.utility.Language language;

	public String getFlavorText() {
		return flavor_text;
	}

	public FlavorText setFlavorText(String flavor_text) {
		this.flavor_text = flavor_text;
		return this;
	}

	public models.utility.Language getLanguage() {
		return language;
	}

	public FlavorText setLanguage(models.utility.Language language) {
		this.language = language;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}