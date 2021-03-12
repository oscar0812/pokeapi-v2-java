/* Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out Bulbapedia for greater detail. */

package com.github.oscar0812.pokeapi.models.pokemon;

import com.github.oscar0812.pokeapi.models.games.VersionGroup;
import com.github.oscar0812.pokeapi.models.utility.Language;

public class AbilityFlavorText {
	// The localized name for an API resource in a specific language.
	private String flavor_text;

	// The language this text resource is in.
	private Language language;

	// The version group that uses this flavor text.
	private VersionGroup version_group;

	public String getFlavorText() {
		return flavor_text;
	}

	public AbilityFlavorText setFlavorText(String flavor_text) {
		this.flavor_text = flavor_text;
		return this;
	}

	public Language getLanguage() {
		if(!language.getIsFetched()) {
			language = language.get();
		}
		return language;
	}

	public AbilityFlavorText setLanguage(Language language) {
		this.language = language;
		return this;
	}

	public VersionGroup getVersionGroup() {
		if(!version_group.getIsFetched()) {
			version_group = version_group.get();
		}
		return version_group;
	}

	public AbilityFlavorText setVersionGroup(VersionGroup version_group) {
		this.version_group = version_group;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}