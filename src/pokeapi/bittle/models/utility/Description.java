package pokeapi.bittle.models.utility;

public class Description {
	// The localized description for an API resource in a specific language.
	private String description;

	// The language this name is in.
	private Language language;

	public String getDescription() {
		return description;
	}

	public Description setDescription(String description) {
		this.description = description;
		return this;
	}

	public Language getLanguage() {
		if(!language.getIsFetched()) {
			language = language.get();
		}
		return language;
	}

	public Description setLanguage(Language language) {
		this.language = language;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}