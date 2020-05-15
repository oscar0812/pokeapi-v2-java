/* A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See Bulbapedia for greater detail. */

package pokeapi.bittle.models.games;
/*
{
  "id": 2,
  "name": "kanto",
  "is_main_series": true,
  "descriptions": [
    {
      "description": "Rot/Blau/Gelb Kanto Dex",
      "language": {
        "name": "de",
        "url": "https://pokeapi.co/api/v2/language/6/"
      }
    }
  ],
  "names": [
    {
      "name": "Kanto",
      "language": {
        "name": "de",
        "url": "https://pokeapi.co/api/v2/language/6/"
      }
    }
  ],
  "pokemon_entries": [
    {
      "entry_number": 1,
      "pokemon_species": {
        "name": "bulbasaur",
        "url": "https://pokeapi.co/api/v2/pokemon-species/1/"
      }
    }
  ],
  "region": {
    "name": "kanto",
    "url": "https://pokeapi.co/api/v2/region/1/"
  },
  "version_groups": [
    {
      "name": "red-blue",
      "url": "https://pokeapi.co/api/v2/version-group/1/"
    }
  ]
}
*/

import java.util.ArrayList;
import pokeapi.bittle.models.locations.Region;
import pokeapi.bittle.models.resources.NamedAPIResourceList;
import pokeapi.bittle.models.utility.Description;
import pokeapi.bittle.models.utility.Name;
import pokeapi.bittle.models.utility.NamedAPIResource;
import pokeapi.bittle.utils.Information;

public class Pokedex extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// Whether or not this Pokédex originated in the main series of the video games.
	private boolean is_main_series;

	// The description of this resource listed in different languages.
	private ArrayList<Description> descriptions;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	// A list of Pokémon catalogued in this Pokédex and their indexes.
	private ArrayList<PokemonEntry> pokemon_entries;

	// The region this Pokédex catalogues Pokémon for.
	private Region region;

	// A list of version groups this Pokédex is relevant to.
	private ArrayList<VersionGroup> version_groups;

	public int getId() {
		return id;
	}

	public Pokedex setId(int id) {
		this.id = id;
		return this;
	}

	public boolean getIsMainSeries() {
		return is_main_series;
	}

	public Pokedex setIsMainSeries(boolean is_main_series) {
		this.is_main_series = is_main_series;
		return this;
	}

	public ArrayList<Description> getDescriptions() {
		return descriptions;
	}

	public Pokedex setDescriptions(ArrayList<Description> descriptions) {
		this.descriptions = descriptions;
		return this;
	}

	public ArrayList<Name> getNames() {
		return names;
	}

	public Pokedex setNames(ArrayList<Name> names) {
		this.names = names;
		return this;
	}

	public ArrayList<PokemonEntry> getPokemonEntries() {
		return pokemon_entries;
	}

	public Pokedex setPokemonEntries(ArrayList<PokemonEntry> pokemon_entries) {
		this.pokemon_entries = pokemon_entries;
		return this;
	}

	public Region getRegion() {
		if(!region.getIsFetched()) {
			region = region.get();
		}
		return region;
	}

	public Pokedex setRegion(Region region) {
		this.region = region;
		return this;
	}

	public ArrayList<VersionGroup> getVersionGroups() {
		return version_groups;
	}

	public Pokedex setVersionGroups(ArrayList<VersionGroup> version_groups) {
		this.version_groups = version_groups;
		return this;
	}

	private static Pokedex get(String url) {
		Pokedex obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), Pokedex.class);
		obj.setIsFetched(true);
		return obj;
	}

	public Pokedex get() {
		return Pokedex.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("pokedex", limit, offset);
	}

	public static Pokedex getById(int id) {
		return get("https://pokeapi.co/api/v2/pokedex/" + id);
	}

	public static Pokedex getByName(String name) {
		return get("https://pokeapi.co/api/v2/pokedex/" + name);
	}
}