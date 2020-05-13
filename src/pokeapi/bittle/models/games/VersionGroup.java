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

public class VersionGroup extends pokeapi.bittle.models.utility.NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// Order for sorting. Almost by date of release, except similar versions are grouped together.
	private int order;

	// The generation this version was introduced in.
	private pokeapi.bittle.models.games.Generation generation;

	// A list of methods in which Pokémon can learn moves in this version group.
	private java.util.ArrayList<pokeapi.bittle.models.moves.MoveLearnMethod> move_learn_methods;

	// A list of Pokédexes introduces in this version group.
	private java.util.ArrayList<pokeapi.bittle.models.games.Pokedex> pokedexes;

	// A list of regions that can be visited in this version group.
	private java.util.ArrayList<pokeapi.bittle.models.locations.Region> regions;

	// The versions this version group owns.
	private java.util.ArrayList<pokeapi.bittle.models.games.Version> versions;

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

	public pokeapi.bittle.models.games.Generation getGeneration() {
		if(!generation.getIsFetched()) {
			generation = generation.get();
		}
		return generation;
	}

	public VersionGroup setGeneration(pokeapi.bittle.models.games.Generation generation) {
		this.generation = generation;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.moves.MoveLearnMethod> getMoveLearnMethods() {
		return move_learn_methods;
	}

	public VersionGroup setMoveLearnMethods(java.util.ArrayList<pokeapi.bittle.models.moves.MoveLearnMethod> move_learn_methods) {
		this.move_learn_methods = move_learn_methods;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.games.Pokedex> getPokedexes() {
		return pokedexes;
	}

	public VersionGroup setPokedexes(java.util.ArrayList<pokeapi.bittle.models.games.Pokedex> pokedexes) {
		this.pokedexes = pokedexes;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.locations.Region> getRegions() {
		return regions;
	}

	public VersionGroup setRegions(java.util.ArrayList<pokeapi.bittle.models.locations.Region> regions) {
		this.regions = regions;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.games.Version> getVersions() {
		return versions;
	}

	public VersionGroup setVersions(java.util.ArrayList<pokeapi.bittle.models.games.Version> versions) {
		this.versions = versions;
		return this;
	}

	private static VersionGroup get(String url) {
		VersionGroup obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), VersionGroup.class);
		obj.setIsFetched(true);
		return obj;
	}

	public VersionGroup get() {
		return VersionGroup.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("version-group", limit, offset);
	}

	public static VersionGroup getById(int id) {
		return get("https://pokeapi.co/api/v2/version-group/" + id);
	}

	public static VersionGroup getByName(String name) {
		return get("https://pokeapi.co/api/v2/version-group/" + name);
	}
}