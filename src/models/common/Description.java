package models.common;
public class Description {
	// The localized description for an API models.resource in a specific language
	private String description;

	// The language this name is in
	private models.utility.Language language;

	public String getDescription() {
		return description;
	}

	public Description setDescription(String description) {
		this.description = description;
		return this;
	}

	public models.utility.Language getLanguage() {
		return language;
	}

	public Description setLanguage(models.utility.Language language) {
		this.language = language;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}