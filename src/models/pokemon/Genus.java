package models.pokemon;
public class Genus {
	// The localized genus for the referenced Pokémon species
	private String genus;

	// The language this genus is in
	private models.utility.Language language;

	public String getGenus() {
		return genus;
	}

	public Genus setGenus(String genus) {
		this.genus = genus;
		return this;
	}

	public models.utility.Language getLanguage() {
		return language;
	}

	public Genus setLanguage(models.utility.Language language) {
		this.language = language;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}