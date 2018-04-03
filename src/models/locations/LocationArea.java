package models.locations;
/*
{
    "id": 1,
    "name": "canalave-city-area",
    "game_index": 1,
    "encounter_method_rates": [{
        "encounter_method": {
            "name": "old-rod",
            "url": "http://pokeapi.co/api/v2/encounter-method/2/"
        },
        "version_details": [{
            "rate": 25,
            "version": {
                "name": "platinum",
                "url": "http://pokeapi.co/api/v2/version/14/"
            }
        }]
    }],
    "location": {
        "name": "canalave-city",
        "url": "http://pokeapi.co/api/v2/location/1/"
    },
    "names": [{
        "name": "",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }],
    "pokemon_encounters": [{
        "models.pokemon": {
            "name": "tentacool",
            "url": "http://pokeapi.co/api/v2/pokemon/72/"
        },
        "version_details": [{
            "version": {
                "name": "diamond",
                "url": "http://pokeapi.co/api/v2/version/12/"
            },
            "max_chance": 60,
            "encounter_details": [{
                "min_level": 20,
                "max_level": 30,
                "condition_values": [],
                "chance": 60,
                "method": {
                    "name": "surf",
                    "url": "http://pokeapi.co/api/v2/encounter-method/5/"
                }
            }]
        }]
    }]
}
*/

public class LocationArea extends models.common.NamedAPIResource {
	// The identifier for this location models.resource
	private int id;

	// The internal id of an API models.resource within game data
	private int game_index;

	// A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game
	private java.util.ArrayList<models.locations.EncounterMethodRate> encounter_method_rates;

	// The region this location can be found in
	private models.locations.Region location;

	// The name of this location area listed in different languages
	private java.util.ArrayList<models.common.Name> names;

	// A list of Pokémon that can be encountered in this area along with version specific details about the encounter
	private java.util.ArrayList<models.locations.PokemonEncounter> pokemon_encounters;

	private static LocationArea get(String url) {
		String json = api.Information.fromInternet(url);
		LocationArea obj = new com.google.gson.Gson().fromJson(json, LocationArea.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static LocationArea getById(int id) {
		return get("https://pokeapi.co/api/v2/location-area/" + id);
	}

	public int getId() {
		return id;
	}

	public LocationArea setId(int id) {
		this.id = id;
		return this;
	}

	public int getGameIndex() {
		return game_index;
	}

	public LocationArea setGameIndex(int game_index) {
		this.game_index = game_index;
		return this;
	}

	public java.util.ArrayList<models.locations.EncounterMethodRate> getEncounterMethodRates() {
		return encounter_method_rates;
	}

	public LocationArea setEncounterMethodRates(java.util.ArrayList<models.locations.EncounterMethodRate> encounter_method_rates) {
		this.encounter_method_rates = encounter_method_rates;
		return this;
	}

	public models.locations.Region getLocation() {
		return location;
	}

	public LocationArea setLocation(models.locations.Region location) {
		this.location = location;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getNames() {
		return names;
	}

	public LocationArea setNames(java.util.ArrayList<models.common.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<models.locations.PokemonEncounter> getPokemonEncounters() {
		return pokemon_encounters;
	}

	public LocationArea setPokemonEncounters(java.util.ArrayList<models.locations.PokemonEncounter> pokemon_encounters) {
		this.pokemon_encounters = pokemon_encounters;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}