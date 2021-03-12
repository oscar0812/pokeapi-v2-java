/* Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out Bulbapedia for greater detail. */

package com.github.oscar0812.pokeapi.models.pokemon;

import java.util.ArrayList;

import com.github.oscar0812.pokeapi.models.games.Generation;
import com.github.oscar0812.pokeapi.utils.Information;
import com.github.oscar0812.pokeapi.models.resources.NamedAPIResourceList;
import com.github.oscar0812.pokeapi.models.utility.Name;
import com.github.oscar0812.pokeapi.models.utility.NamedAPIResource;
import com.github.oscar0812.pokeapi.models.utility.VerboseEffect;

public class Ability extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// Whether or not this ability originated in the main series of the video games.
	private boolean is_main_series;

	// The generation this ability originated in.
	private Generation generation;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	// The effect of this ability listed in different languages.
	private ArrayList<VerboseEffect> effect_entries;

	// The list of previous effects this ability has had across version groups.
	private ArrayList<AbilityEffectChange> effect_changes;

	// The flavor text of this ability listed in different languages.
	private ArrayList<AbilityFlavorText> flavor_text_entries;

	// A list of Pokémon that could potentially have this ability.
	private ArrayList<AbilityPokemon> pokemon;

	public int getId() {
		return id;
	}

	public Ability setId(int id) {
		this.id = id;
		return this;
	}

	public boolean getIsMainSeries() {
		return is_main_series;
	}

	public Ability setIsMainSeries(boolean is_main_series) {
		this.is_main_series = is_main_series;
		return this;
	}

	public Generation getGeneration() {
		if(!generation.getIsFetched()) {
			generation = generation.get();
		}
		return generation;
	}

	public Ability setGeneration(Generation generation) {
		this.generation = generation;
		return this;
	}

	public ArrayList<Name> getNames() {
		return names;
	}

	public Ability setNames(ArrayList<Name> names) {
		this.names = names;
		return this;
	}

	public ArrayList<VerboseEffect> getEffectEntries() {
		return effect_entries;
	}

	public Ability setEffectEntries(ArrayList<VerboseEffect> effect_entries) {
		this.effect_entries = effect_entries;
		return this;
	}

	public ArrayList<AbilityEffectChange> getEffectChanges() {
		return effect_changes;
	}

	public Ability setEffectChanges(ArrayList<AbilityEffectChange> effect_changes) {
		this.effect_changes = effect_changes;
		return this;
	}

	public ArrayList<AbilityFlavorText> getFlavorTextEntries() {
		return flavor_text_entries;
	}

	public Ability setFlavorTextEntries(ArrayList<AbilityFlavorText> flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
		return this;
	}

	public ArrayList<AbilityPokemon> getPokemon() {
		return pokemon;
	}

	public Ability setPokemon(ArrayList<AbilityPokemon> pokemon) {
		this.pokemon = pokemon;
		return this;
	}

	private static Ability get(String url) {
		Ability obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), Ability.class);
		obj.setIsFetched(true);
		return obj;
	}

	public Ability get() {
		return Ability.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("ability", limit, offset);
	}

	public static Ability getById(int id) {
		return get("https://pokeapi.co/api/v2/ability/" + id);
	}

	public static Ability getByName(String name) {
		return get("https://pokeapi.co/api/v2/ability/" + name);
	}
}