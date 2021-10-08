/* Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas. */

package com.github.oscar0812.pokeapi.models.moves;

import com.github.oscar0812.pokeapi.models.games.VersionGroup;
import com.github.oscar0812.pokeapi.models.utility.Language;

public class MoveFlavorText {
	// The localized flavor text for an api resource in a specific language.
	private String flavor_text;

	// The language this name is in.
	private Language language;

	// The version group that uses this flavor text.
	private VersionGroup version_group;

	public String getFlavorText() {
		return flavor_text;
	}

	public MoveFlavorText setFlavorText(String flavor_text) {
		this.flavor_text = flavor_text;
		return this;
	}

	public Language getLanguage() {
		if(!language.getIsFetched()) {
			language = language.get();
		}
		return language;
	}

	public MoveFlavorText setLanguage(Language language) {
		this.language = language;
		return this;
	}

	public VersionGroup getVersionGroup() {
		if(!version_group.getIsFetched()) {
			version_group = version_group.get();
		}
		return version_group;
	}

	public MoveFlavorText setVersionGroup(VersionGroup version_group) {
		this.version_group = version_group;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}