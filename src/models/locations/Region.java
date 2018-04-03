package models.locations;
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

public class Region extends models.common.NamedAPIResource {
	// The identifier for this region resource
	private int id;

	// A list of locations that can be found in this region
	private java.util.ArrayList<models.locations.Location> locations;

	// The generation this region was introduced in
	private models.games.Generation main_generation;

	// The name of this region listed in different languages
	private java.util.ArrayList<models.common.Name> names;

	// A list of pokédexes that catalogue Pokémon in this region
	private java.util.ArrayList<models.games.Pokedex> pokedexes;

	// A list of version groups where this region can be visited
	private java.util.ArrayList<models.games.VersionGroup> version_groups;

	private static Region get(String url) {
		String json = api.Information.fromInternet(url);
		Region obj = new com.google.gson.Gson().fromJson(json, Region.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static Region getById(int id) {
		return get("https://pokeapi.co/api/v2/region/" + id);
	}

	public static Region getByName(String name) {
		return get("https://pokeapi.co/api/v2/region/" + name);
	}

	public int getId() {
		return id;
	}

	public Region setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<models.locations.Location> getLocations() {
		return locations;
	}

	public Region setLocations(java.util.ArrayList<models.locations.Location> locations) {
		this.locations = locations;
		return this;
	}

	public models.games.Generation getMainGeneration() {
		return main_generation;
	}

	public Region setMainGeneration(models.games.Generation main_generation) {
		this.main_generation = main_generation;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getNames() {
		return names;
	}

	public Region setNames(java.util.ArrayList<models.common.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<models.games.Pokedex> getPokedexes() {
		return pokedexes;
	}

	public Region setPokedexes(java.util.ArrayList<models.games.Pokedex> pokedexes) {
		this.pokedexes = pokedexes;
		return this;
	}

	public java.util.ArrayList<models.games.VersionGroup> getVersionGroups() {
		return version_groups;
	}

	public Region setVersionGroups(java.util.ArrayList<models.games.VersionGroup> version_groups) {
		this.version_groups = version_groups;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}