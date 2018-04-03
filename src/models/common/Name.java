package models.common;
public class Name {
	// The localized name for an API resource in a specific language
	private String name;

	// The language this name is in
	private models.utility.Language language;

	public String getName() {
		return name;
	}

	public Name setName(String name) {
		this.name = name;
		return this;
	}

	public models.utility.Language getLanguage() {
		return language;
	}

	public Name setLanguage(models.utility.Language language) {
		this.language = language;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}