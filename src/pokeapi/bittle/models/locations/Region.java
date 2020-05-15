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

import java.util.ArrayList;
import pokeapi.bittle.models.games.Generation;
import pokeapi.bittle.models.games.Pokedex;
import pokeapi.bittle.models.games.VersionGroup;
import pokeapi.bittle.models.resources.NamedAPIResourceList;
import pokeapi.bittle.models.utility.Name;
import pokeapi.bittle.models.utility.NamedAPIResource;
import pokeapi.bittle.utils.Information;

public class Region extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// A list of locations that can be found in this region.
	private ArrayList<Location> locations;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	// The generation this region was introduced in.
	private Generation main_generation;

	// A list of pokédexes that catalogue Pokémon in this region.
	private ArrayList<Pokedex> pokedexes;

	// A list of version groups where this region can be visited.
	private ArrayList<VersionGroup> version_groups;

	public int getId() {
		return id;
	}

	public Region setId(int id) {
		this.id = id;
		return this;
	}

	public ArrayList<Location> getLocations() {
		return locations;
	}

	public Region setLocations(ArrayList<Location> locations) {
		this.locations = locations;
		return this;
	}

	public ArrayList<Name> getNames() {
		return names;
	}

	public Region setNames(ArrayList<Name> names) {
		this.names = names;
		return this;
	}

	public Generation getMainGeneration() {
		if(!main_generation.getIsFetched()) {
			main_generation = main_generation.get();
		}
		return main_generation;
	}

	public Region setMainGeneration(Generation main_generation) {
		this.main_generation = main_generation;
		return this;
	}

	public ArrayList<Pokedex> getPokedexes() {
		return pokedexes;
	}

	public Region setPokedexes(ArrayList<Pokedex> pokedexes) {
		this.pokedexes = pokedexes;
		return this;
	}

	public ArrayList<VersionGroup> getVersionGroups() {
		return version_groups;
	}

	public Region setVersionGroups(ArrayList<VersionGroup> version_groups) {
		this.version_groups = version_groups;
		return this;
	}

	private static Region get(String url) {
		Region obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), Region.class);
		obj.setIsFetched(true);
		return obj;
	}

	public Region get() {
		return Region.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("region", limit, offset);
	}

	public static Region getById(int id) {
		return get("https://pokeapi.co/api/v2/region/" + id);
	}

	public static Region getByName(String name) {
		return get("https://pokeapi.co/api/v2/region/" + name);
	}
}