/* A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant. */

package com.github.oscar0812.pokeapi.models.pokemon;

import com.github.oscar0812.pokeapi.models.utility.Language;

public class Genus {
	// The localized genus for the referenced Pokémon species
	private String genus;

	// The language this genus is in.
	private Language language;

	public String getGenus() {
		return genus;
	}

	public Genus setGenus(String genus) {
		this.genus = genus;
		return this;
	}

	public Language getLanguage() {
		if(!language.getIsFetched()) {
			language = language.get();
		}
		return language;
	}

	public Genus setLanguage(Language language) {
		this.language = language;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}