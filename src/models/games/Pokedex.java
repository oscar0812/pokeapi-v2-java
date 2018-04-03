package models.games;
/*
{
    "id": 2,
    "name": "kanto",
    "is_main_series": true,
    "descriptions": [{
        "description": "Rot/Blau/Gelb Kanto Dex",
        "language": {
            "name": "de",
            "url": "http://pokeapi.co/api/v2/language/6/"
        }
    }],
    "names": [{
        "name": "Kanto",
        "language": {
            "name": "de",
            "url": "http://pokeapi.co/api/v2/language/6/"
        }
    }],
    "pokemon_entries": [{
        "entry_number": 1,
        "pokemon_species": {
            "name": "bulbasaur",
            "url": "http://pokeapi.co/api/v2/pokemon-species/1/"
        }
    }],
    "region": {
        "name": "kanto",
        "url": "http://pokeapi.co/api/v2/region/1/"
    },
    "version_groups": [{
        "name": "red-blue",
        "url": "http://pokeapi.co/api/v2/version-group/1/"
    }]
}
*/

public class Pokedex extends models.common.NamedAPIResource {
	// The identifier for this Pokédex models.resource
	private int id;

	// Whether or not this Pokédex originated in the main series of the video models.games
	private boolean is_main_series;

	// The description of this Pokédex listed in different languages
	private java.util.ArrayList<models.common.Description> descriptions;

	// The name of this Pokédex listed in different languages
	private java.util.ArrayList<models.common.Name> names;

	// A list of Pokémon catalogued in this Pokédex and their indexes
	private java.util.ArrayList<models.games.PokemonEntry> pokemon_entries;

	// The region this Pokédex catalogues Pokémon for
	private models.locations.Region region;

	// A list of version groups this Pokédex is relevant to
	private java.util.ArrayList<models.games.VersionGroup> version_groups;

	private static Pokedex get(String url) {
		String json = api.Information.fromInternet(url);
		Pokedex obj = new com.google.gson.Gson().fromJson(json, Pokedex.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static Pokedex getById(int id) {
		return get("https://pokeapi.co/api/v2/pokedex/" + id);
	}

	public static Pokedex getByName(String name) {
		return get("https://pokeapi.co/api/v2/pokedex/" + name);
	}

	public int getId() {
		return id;
	}

	public Pokedex setId(int id) {
		this.id = id;
		return this;
	}

	public boolean isMainSeries() {
		return is_main_series;
	}

	public Pokedex setIsMainSeries(boolean is_main_series) {
		this.is_main_series = is_main_series;
		return this;
	}

	public java.util.ArrayList<models.common.Description> getDescriptions() {
		return descriptions;
	}

	public Pokedex setDescriptions(java.util.ArrayList<models.common.Description> descriptions) {
		this.descriptions = descriptions;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getNames() {
		return names;
	}

	public Pokedex setNames(java.util.ArrayList<models.common.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<models.games.PokemonEntry> getPokemonEntries() {
		return pokemon_entries;
	}

	public Pokedex setPokemonEntries(java.util.ArrayList<models.games.PokemonEntry> pokemon_entries) {
		this.pokemon_entries = pokemon_entries;
		return this;
	}

	public models.locations.Region getRegion() {
		return region;
	}

	public Pokedex setRegion(models.locations.Region region) {
		this.region = region;
		return this;
	}

	public java.util.ArrayList<models.games.VersionGroup> getVersionGroups() {
		return version_groups;
	}

	public Pokedex setVersionGroups(java.util.ArrayList<models.games.VersionGroup> version_groups) {
		this.version_groups = version_groups;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}