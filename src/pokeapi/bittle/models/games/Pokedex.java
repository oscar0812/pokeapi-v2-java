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

public class Pokedex extends pokeapi.bittle.models.utility.NamedAPIResource {
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

	public java.util.ArrayList<pokeapi.bittle.models.utility.Description> getDescriptions() {
				return descriptions;
	}

	public Pokedex setDescriptions(java.util.ArrayList<pokeapi.bittle.models.utility.Description> descriptions) {
		this.descriptions = descriptions;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Name> getNames() {
				return names;
	}

	public Pokedex setNames(java.util.ArrayList<pokeapi.bittle.models.utility.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.games.PokemonEntry> getPokemonEntries() {
				return pokemon_entries;
	}

	public Pokedex setPokemonEntries(java.util.ArrayList<pokeapi.bittle.models.games.PokemonEntry> pokemon_entries) {
		this.pokemon_entries = pokemon_entries;
		return this;
	}

	public pokeapi.bittle.models.locations.Region getRegion() {
		if(!region.getIsFetched()) {
			region = region.get();
		}

		return region;
	}

	public Pokedex setRegion(pokeapi.bittle.models.locations.Region region) {
		this.region = region;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.games.VersionGroup> getVersionGroups() {
				return version_groups;
	}

	public Pokedex setVersionGroups(java.util.ArrayList<pokeapi.bittle.models.games.VersionGroup> version_groups) {
		this.version_groups = version_groups;
		return this;
	}

	// The identifier for this resource.
	private int id;

	// Whether or not this Pokédex originated in the main series of the video games.
	private boolean is_main_series;

	// The description of this resource listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Description> descriptions;

	// The name of this resource listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Name> names;

	// A list of Pokémon catalogued in this Pokédex and their indexes.
	private java.util.ArrayList<pokeapi.bittle.models.games.PokemonEntry> pokemon_entries;

	// The region this Pokédex catalogues Pokémon for.
	private pokeapi.bittle.models.locations.Region region;

	// A list of version groups this Pokédex is relevant to.
	private java.util.ArrayList<pokeapi.bittle.models.games.VersionGroup> version_groups;

	private static Pokedex get(String url) {
		Pokedex obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), Pokedex.class);
		obj.setIsFetched(true);
		return obj;
	}

	public Pokedex get() {
		return Pokedex.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("pokedex", limit, offset);
	}

	public static Pokedex getById(int id) {
		return get("https://pokeapi.co/api/v2/pokedex/" + id);
	}

	public static Pokedex getByName(String name) {
		return get("https://pokeapi.co/api/v2/pokedex/" + name);
	}
}