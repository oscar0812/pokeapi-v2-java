package models.pokemon;
public class AwesomeName {
	// The localized "scientific" name for an API resource in a specific language
	private String awesome_name;

	// The language this "scientific" name is in
	private models.utility.Language language;

	public String getAwesomeName() {
		return awesome_name;
	}

	public AwesomeName setAwesomeName(String awesome_name) {
		this.awesome_name = awesome_name;
		return this;
	}

	public models.utility.Language getLanguage() {
		return language;
	}

	public AwesomeName setLanguage(models.utility.Language language) {
		this.language = language;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}