package locations;
/*
{
    "id": 1,
    "name": "kanto",
    "locations": [{
        "name": "celadon-city",
        "url": "http://pokeapi.co/api/v2/location/67/"
    }],
    "main_generation": {
        "name": "generation-i",
        "url": "http://pokeapi.co/api/v2/generation/1/"
    },
    "names": [{
        "name": "Kanto",
        "language": {
            "name": "de",
            "url": "http://pokeapi.co/api/v2/language/6/"
        }
    }],
    "pokedexes": [{
        "name": "kanto",
        "url": "http://pokeapi.co/api/v2/pokedex/2/"
    }],
    "version_groups": [{
        "name": "red-blue",
        "url": "http://pokeapi.co/api/v2/version-group/1/"
    }]
}
*/

public class Region extends common.NamedAPIResource {
	// The identifier for this region resource
	private int id;

	// A list of locations that can be found in this region
	private java.util.ArrayList<locations.Location> locations;

	// The generation this region was introduced in
	private games.Generation main_generation;

	// The name of this region listed in different languages
	private java.util.ArrayList<common.Name> names;

	// A list of pokédexes that catalogue Pokémon in this region
	private java.util.ArrayList<games.Pokedex> pokedexes;

	// A list of version groups where this region can be visited
	private java.util.ArrayList<games.VersionGroup> version_groups;

	public static Region getById(int id) {
		String url = "https://pokeapi.co/api/v2/region/" + id;
		String json = tools.Internet.get(url);
		Region obj = new com.google.gson.Gson().fromJson(json, Region.class);
		return obj;
	}

	public static Region getByName(String name) {
		String url = "https://pokeapi.co/api/v2/region/" + name;
		String json = tools.Internet.get(url);
		Region obj = new com.google.gson.Gson().fromJson(json, Region.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public Region setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<locations.Location> getLocations() {
		return locations;
	}

	public Region setLocations(java.util.ArrayList<locations.Location> locations) {
		this.locations = locations;
		return this;
	}

	public games.Generation getMainGeneration() {
		return main_generation;
	}

	public Region setMainGeneration(games.Generation main_generation) {
		this.main_generation = main_generation;
		return this;
	}

	public java.util.ArrayList<common.Name> getNames() {
		return names;
	}

	public Region setNames(java.util.ArrayList<common.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<games.Pokedex> getPokedexes() {
		return pokedexes;
	}

	public Region setPokedexes(java.util.ArrayList<games.Pokedex> pokedexes) {
		this.pokedexes = pokedexes;
		return this;
	}

	public java.util.ArrayList<games.VersionGroup> getVersionGroups() {
		return version_groups;
	}

	public Region setVersionGroups(java.util.ArrayList<games.VersionGroup> version_groups) {
		this.version_groups = version_groups;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}