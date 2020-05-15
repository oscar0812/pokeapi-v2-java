package pokeapi.bittle.models.utility;

public class Name {
	// The localized name for an API resource in a specific language.
	private String name;

	// The language this name is in.
	private Language language;

	public String getName() {
		return name;
	}

	public Name setName(String name) {
		this.name = name;
		return this;
	}

	public Language getLanguage() {
		if(!language.getIsFetched()) {
			language = language.get();
		}
		return language;
	}

	public Name setLanguage(Language language) {
		this.language = language;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}