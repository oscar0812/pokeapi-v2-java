/* A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released. */

package com.github.oscar0812.pokeapi.models.games;

import com.github.oscar0812.pokeapi.models.locations.Region;
import com.github.oscar0812.pokeapi.models.moves.Move;
import com.github.oscar0812.pokeapi.models.pokemon.Ability;
import com.github.oscar0812.pokeapi.models.pokemon.PokemonSpecies;
import com.github.oscar0812.pokeapi.models.pokemon.Type;
import com.github.oscar0812.pokeapi.models.resources.NamedAPIResourceList;
import com.github.oscar0812.pokeapi.models.utility.Name;
import com.github.oscar0812.pokeapi.models.utility.NamedAPIResource;
import com.github.oscar0812.pokeapi.utils.Information;
import java.util.ArrayList;

public class Generation extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// A list of abilities that were introduced in this generation.
	private ArrayList<Ability> abilities;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	// The main region travelled in this generation.
	private Region main_region;

	// A list of moves that were introduced in this generation.
	private ArrayList<Move> moves;

	// A list of Pokémon species that were introduced in this generation.
	private ArrayList<PokemonSpecies> pokemon_species;

	// A list of types that were introduced in this generation.
	private ArrayList<Type> types;

	// A list of version groups that were introduced in this generation.
	private ArrayList<VersionGroup> version_groups;

	public int getId() {
		return id;
	}

	public Generation setId(int id) {
		this.id = id;
		return this;
	}

	public ArrayList<Ability> getAbilities() {
		return abilities;
	}

	public Generation setAbilities(ArrayList<Ability> abilities) {
		this.abilities = abilities;
		return this;
	}

	public ArrayList<Name> getNames() {
		return names;
	}

	public Generation setNames(ArrayList<Name> names) {
		this.names = names;
		return this;
	}

	public Region getMainRegion() {
		if(!main_region.getIsFetched()) {
			main_region = main_region.get();
		}
		return main_region;
	}

	public Generation setMainRegion(Region main_region) {
		this.main_region = main_region;
		return this;
	}

	public ArrayList<Move> getMoves() {
		return moves;
	}

	public Generation setMoves(ArrayList<Move> moves) {
		this.moves = moves;
		return this;
	}

	public ArrayList<PokemonSpecies> getPokemonSpecies() {
		return pokemon_species;
	}

	public Generation setPokemonSpecies(ArrayList<PokemonSpecies> pokemon_species) {
		this.pokemon_species = pokemon_species;
		return this;
	}

	public ArrayList<Type> getTypes() {
		return types;
	}

	public Generation setTypes(ArrayList<Type> types) {
		this.types = types;
		return this;
	}

	public ArrayList<VersionGroup> getVersionGroups() {
		return version_groups;
	}

	public Generation setVersionGroups(ArrayList<VersionGroup> version_groups) {
		this.version_groups = version_groups;
		return this;
	}

	private static Generation get(String url) {
		Generation obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), Generation.class);
		obj.setIsFetched(true);
		return obj;
	}

	public Generation get() {
		return Generation.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("generation", limit, offset);
	}

	public static Generation getById(int id) {
		return get("https://pokeapi.co/api/v2/generation/" + id);
	}

	public static Generation getByName(String name) {
		return get("https://pokeapi.co/api/v2/generation/" + name);
	}
}