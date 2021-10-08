/* Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out Bulbapedia for greater detail. */

package com.github.oscar0812.pokeapi.models.pokemon;

import com.github.oscar0812.pokeapi.models.games.VersionGroup;
import com.github.oscar0812.pokeapi.models.utility.Effect;
import java.util.ArrayList;

public class AbilityEffectChange {
	// The previous effect of this ability listed in different languages.
	private ArrayList<Effect> effect_entries;

	// The version group in which the previous effect of this ability originated.
	private VersionGroup version_group;

	public ArrayList<Effect> getEffectEntries() {
		return effect_entries;
	}

	public AbilityEffectChange setEffectEntries(ArrayList<Effect> effect_entries) {
		this.effect_entries = effect_entries;
		return this;
	}

	public VersionGroup getVersionGroup() {
		if(!version_group.getIsFetched()) {
			version_group = version_group.get();
		}
		return version_group;
	}

	public AbilityEffectChange setVersionGroup(VersionGroup version_group) {
		this.version_group = version_group;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}