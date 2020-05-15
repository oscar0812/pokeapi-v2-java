/* Version groups categorize highly similar versions of the games. */

package pokeapi.bittle.models.games;
/*
{
  "id": 1,
  "name": "red-blue",
  "order": 1,
  "generation": {
    "name": "generation-i",
    "url": "https://pokeapi.co/api/v2/generation/1/"
  },
  "move_learn_methods": [
    {
      "name": "level-up",
      "url": "https://pokeapi.co/api/v2/move-learn-method/1/"
    }
  ],
  "pokedexes": [
    {
      "name": "kanto",
      "url": "https://pokeapi.co/api/v2/pokedex/2/"
    }
  ],
  "regions": [
    {
      "name": "kanto",
      "url": "https://pokeapi.co/api/v2/region/1/"
    }
  ],
  "versions": [
    {
      "name": "red",
      "url": "https://pokeapi.co/api/v2/version/1/"
    }
  ]
}
*/

import java.util.ArrayList;
import pokeapi.bittle.models.locations.Region;
import pokeapi.bittle.models.moves.MoveLearnMethod;
import pokeapi.bittle.models.resources.NamedAPIResourceList;
import pokeapi.bittle.models.utility.NamedAPIResource;
import pokeapi.bittle.utils.Information;

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