package games;
/*
{
    "id": 1,
    "name": "red-blue",
    "order": 1,
    "generation": {
        "name": "generation-i",
        "url": "http://pokeapi.co/api/v2/generation/1/"
    },
    "move_learn_methods": [{
        "name": "level-up",
        "url": "http://pokeapi.co/api/v2/move-learn-method/1/"
    }],
    "pokedexes": [{
        "name": "kanto",
        "url": "http://pokeapi.co/api/v2/pokedex/2/"
    }],
    "regions": [{
        "name": "kanto",
        "url": "http://pokeapi.co/api/v2/region/1/"
    }],
    "versions": [{
        "name": "red",
        "url": "http://pokeapi.co/api/v2/version/1/"
    }]
}
*/

public class VersionGroup extends common.NamedAPIResource {
	// The identifier for this version group resource
	private int id;

	// Order for sorting. Almost by date of release, except similar versions are grouped together.
	private int order;

	// The generation this version was introduced in
	private games.Generation generation;

	// A list of methods in which Pokémon can learn moves in this version group
	private java.util.ArrayList<moves.MoveLearnMethod> move_learn_methods;

	// A list of Pokédexes introduces in this version group
	private java.util.ArrayList<games.Pokedex> pokedexes;

	// A list of regions that can be visited in this version group
	private java.util.ArrayList<locations.Region> regions;

	// The versions this version group owns
	private java.util.ArrayList<games.Version> versions;

	public static VersionGroup getById(int id) {
		String url = "https://pokeapi.co/api/v2/version-group/" + id;
		String json = tools.Internet.get(url);
		VersionGroup obj = new com.google.gson.Gson().fromJson(json, VersionGroup.class);
		return obj;
	}

	public static VersionGroup getByName(String name) {
		String url = "https://pokeapi.co/api/v2/version-group/" + name;
		String json = tools.Internet.get(url);
		VersionGroup obj = new com.google.gson.Gson().fromJson(json, VersionGroup.class);
		return obj;
	}

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

	public games.Generation getGeneration() {
		return generation;
	}

	public VersionGroup setGeneration(games.Generation generation) {
		this.generation = generation;
		return this;
	}

	public java.util.ArrayList<moves.MoveLearnMethod> getMoveLearnMethods() {
		return move_learn_methods;
	}

	public VersionGroup setMoveLearnMethods(java.util.ArrayList<moves.MoveLearnMethod> move_learn_methods) {
		this.move_learn_methods = move_learn_methods;
		return this;
	}

	public java.util.ArrayList<games.Pokedex> getPokedexes() {
		return pokedexes;
	}

	public VersionGroup setPokedexes(java.util.ArrayList<games.Pokedex> pokedexes) {
		this.pokedexes = pokedexes;
		return this;
	}

	public java.util.ArrayList<locations.Region> getRegions() {
		return regions;
	}

	public VersionGroup setRegions(java.util.ArrayList<locations.Region> regions) {
		this.regions = regions;
		return this;
	}

	public java.util.ArrayList<games.Version> getVersions() {
		return versions;
	}

	public VersionGroup setVersions(java.util.ArrayList<games.Version> versions) {
		this.versions = versions;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}