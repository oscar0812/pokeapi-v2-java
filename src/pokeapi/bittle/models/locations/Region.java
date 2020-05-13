/* A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them. */

package pokeapi.bittle.models.locations;
/*
{
  "id": 1,
  "name": "kanto",
  "locations": [
    {
      "name": "celadon-city",
      "url": "https://pokeapi.co/api/v2/location/67/"
    }
  ],
  "main_generation": {
    "name": "generation-i",
    "url": "https://pokeapi.co/api/v2/generation/1/"
  },
  "names": [
    {
      "name": "Kanto",
      "language": {
        "name": "de",
        "url": "https://pokeapi.co/api/v2/language/6/"
      }
    }
  ],
  "pokedexes": [
    {
      "name": "kanto",
      "url": "https://pokeapi.co/api/v2/pokedex/2/"
    }
  ],
  "version_groups": [
    {
      "name": "red-blue",
      "url": "https://pokeapi.co/api/v2/version-group/1/"
    }
  ]
}
*/

public class Region extends pokeapi.bittle.models.utility.NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// A list of locations that can be found in this region.
	private java.util.ArrayList<pokeapi.bittle.models.locations.Location> locations;

	// The name of this resource listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Name> names;

	// The generation this region was introduced in.
	private pokeapi.bittle.models.games.Generation main_generation;

	// A list of pokédexes that catalogue Pokémon in this region.
	private java.util.ArrayList<pokeapi.bittle.models.games.Pokedex> pokedexes;

	// A list of version groups where this region can be visited.
	private java.util.ArrayList<pokeapi.bittle.models.games.VersionGroup> version_groups;

	public int getId() {
		return id;
	}

	public Region setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.locations.Location> getLocations() {
		return locations;
	}

	public Region setLocations(java.util.ArrayList<pokeapi.bittle.models.locations.Location> locations) {
		this.locations = locations;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Name> getNames() {
		return names;
	}

	public Region setNames(java.util.ArrayList<pokeapi.bittle.models.utility.Name> names) {
		this.names = names;
		return this;
	}

	public pokeapi.bittle.models.games.Generation getMainGeneration() {
		if(!main_generation.getIsFetched()) {
			main_generation = main_generation.get();
		}
		return main_generation;
	}

	public Region setMainGeneration(pokeapi.bittle.models.games.Generation main_generation) {
		this.main_generation = main_generation;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.games.Pokedex> getPokedexes() {
		return pokedexes;
	}

	public Region setPokedexes(java.util.ArrayList<pokeapi.bittle.models.games.Pokedex> pokedexes) {
		this.pokedexes = pokedexes;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.games.VersionGroup> getVersionGroups() {
		return version_groups;
	}

	public Region setVersionGroups(java.util.ArrayList<pokeapi.bittle.models.games.VersionGroup> version_groups) {
		this.version_groups = version_groups;
		return this;
	}

	private static Region get(String url) {
		Region obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), Region.class);
		obj.setIsFetched(true);
		return obj;
	}

	public Region get() {
		return Region.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("region", limit, offset);
	}

	public static Region getById(int id) {
		return get("https://pokeapi.co/api/v2/region/" + id);
	}

	public static Region getByName(String name) {
		return get("https://pokeapi.co/api/v2/region/" + name);
	}
}