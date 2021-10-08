/* Version groups categorize highly similar versions of the games. */

package com.github.oscar0812.pokeapi.models.games;

import com.github.oscar0812.pokeapi.models.locations.Region;
import com.github.oscar0812.pokeapi.models.moves.MoveLearnMethod;
import com.github.oscar0812.pokeapi.models.resources.NamedAPIResourceList;
import com.github.oscar0812.pokeapi.models.utility.NamedAPIResource;
import com.github.oscar0812.pokeapi.utils.Information;
import java.util.ArrayList;

public class VersionGroup extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// Order for sorting. Almost by date of release, except similar versions are grouped together.
	private int order;

	// The generation this version was introduced in.
	private Generation generation;

	// A list of methods in which Pokémon can learn moves in this version group.
	private ArrayList<MoveLearnMethod> move_learn_methods;

	// A list of Pokédexes introduces in this version group.
	private ArrayList<Pokedex> pokedexes;

	// A list of regions that can be visited in this version group.
	private ArrayList<Region> regions;

	// The versions this version group owns.
	private ArrayList<Version> versions;

	public int getId() {
		return id;
	}

	public VersionGroup setId(int id) {
		this.id = id;
		return this;
	}

	public int getOrder() {
		return order;
	}

	public VersionGroup setOrder(int order) {
		this.order = order;
		return this;
	}

	public Generation getGeneration() {
		if(!generation.getIsFetched()) {
			generation = generation.get();
		}
		return generation;
	}

	public VersionGroup setGeneration(Generation generation) {
		this.generation = generation;
		return this;
	}

	public ArrayList<MoveLearnMethod> getMoveLearnMethods() {
		return move_learn_methods;
	}

	public VersionGroup setMoveLearnMethods(ArrayList<MoveLearnMethod> move_learn_methods) {
		this.move_learn_methods = move_learn_methods;
		return this;
	}

	public ArrayList<Pokedex> getPokedexes() {
		return pokedexes;
	}

	public VersionGroup setPokedexes(ArrayList<Pokedex> pokedexes) {
		this.pokedexes = pokedexes;
		return this;
	}

	public ArrayList<Region> getRegions() {
		return regions;
	}

	public VersionGroup setRegions(ArrayList<Region> regions) {
		this.regions = regions;
		return this;
	}

	public ArrayList<Version> getVersions() {
		return versions;
	}

	public VersionGroup setVersions(ArrayList<Version> versions) {
		this.versions = versions;
		return this;
	}

	private static VersionGroup get(String url) {
		VersionGroup obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), VersionGroup.class);
		obj.setIsFetched(true);
		return obj;
	}

	public VersionGroup get() {
		return VersionGroup.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("version-group", limit, offset);
	}

	public static VersionGroup getById(int id) {
		return get("https://pokeapi.co/api/v2/version-group/" + id);
	}

	public static VersionGroup getByName(String name) {
		return get("https://pokeapi.co/api/v2/version-group/" + name);
	}
}