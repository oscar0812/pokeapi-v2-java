/* Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out Bulbapedia for greater detail. */

package com.github.oscar0812.pokeapi.models.evolution;

import com.github.oscar0812.pokeapi.models.pokemon.PokemonSpecies;
import com.github.oscar0812.pokeapi.models.resources.NamedAPIResourceList;
import com.github.oscar0812.pokeapi.models.utility.Name;
import com.github.oscar0812.pokeapi.models.utility.NamedAPIResource;
import com.github.oscar0812.pokeapi.utils.Information;
import java.util.ArrayList;

public class EvolutionTrigger extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	// A list of pokemon species that result from this evolution trigger.
	private ArrayList<PokemonSpecies> pokemon_species;

	public int getId() {
		return id;
	}

	public EvolutionTrigger setId(int id) {
		this.id = id;
		return this;
	}

	public ArrayList<Name> getNames() {
		return names;
	}

	public EvolutionTrigger setNames(ArrayList<Name> names) {
		this.names = names;
		return this;
	}

	public ArrayList<PokemonSpecies> getPokemonSpecies() {
		return pokemon_species;
	}

	public EvolutionTrigger setPokemonSpecies(ArrayList<PokemonSpecies> pokemon_species) {
		this.pokemon_species = pokemon_species;
		return this;
	}

	private static EvolutionTrigger get(String url) {
		EvolutionTrigger obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), EvolutionTrigger.class);
		obj.setIsFetched(true);
		return obj;
	}

	public EvolutionTrigger get() {
		return EvolutionTrigger.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("evolution-trigger", limit, offset);
	}

	public static EvolutionTrigger getById(int id) {
		return get("https://pokeapi.co/api/v2/evolution-trigger/" + id);
	}

	public static EvolutionTrigger getByName(String name) {
		return get("https://pokeapi.co/api/v2/evolution-trigger/" + name);
	}
}