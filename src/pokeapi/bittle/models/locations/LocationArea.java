/* Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters. */

package pokeapi.bittle.models.locations;
/*
{
  "id": 1,
  "name": "canalave-city-area",
  "game_index": 1,
  "encounter_method_rates": [
    {
      "encounter_method": {
        "name": "old-rod",
        "url": "https://pokeapi.co/api/v2/encounter-method/2/"
      },
      "version_details": [
        {
          "rate": 25,
          "version": {
            "name": "platinum",
            "url": "https://pokeapi.co/api/v2/version/14/"
          }
        }
      ]
    }
  ],
  "location": {
    "name": "canalave-city",
    "url": "https://pokeapi.co/api/v2/location/1/"
  },
  "names": [
    {
      "name": "",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "pokemon_encounters": [
    {
      "pokemon": {
        "name": "tentacool",
        "url": "https://pokeapi.co/api/v2/pokemon/72/"
      },
      "version_details": [
        {
          "version": {
            "name": "diamond",
            "url": "https://pokeapi.co/api/v2/version/12/"
          },
          "max_chance": 60,
          "encounter_details": [
            {
              "min_level": 20,
              "max_level": 30,
              "condition_values": [],
              "chance": 60,
              "method": {
                "name": "surf",
                "url": "https://pokeapi.co/api/v2/encounter-method/5/"
              }
            }
          ]
        }
      ]
    }
  ]
}
*/

public class LocationArea extends pokeapi.bittle.models.utility.NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The internal id of an API resource within game data.
	private int game_index;

	// A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game.
	private java.util.ArrayList<pokeapi.bittle.models.locations.EncounterMethodRate> encounter_method_rates;

	// The region this location area can be found in.
	private pokeapi.bittle.models.locations.Location location;

	// The name of this resource listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Name> names;

	// A list of Pokémon that can be encountered in this area along with version specific details about the encounter.
	private java.util.ArrayList<pokeapi.bittle.models.locations.PokemonEncounter> pokemon_encounters;

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

	public java.util.ArrayList<pokeapi.bittle.models.locations.EncounterMethodRate> getEncounterMethodRates() {
		return encounter_method_rates;
	}

	public LocationArea setEncounterMethodRates(java.util.ArrayList<pokeapi.bittle.models.locations.EncounterMethodRate> encounter_method_rates) {
		this.encounter_method_rates = encounter_method_rates;
		return this;
	}

	public pokeapi.bittle.models.locations.Location getLocation() {
		if(!location.getIsFetched()) {
			location = location.get();
		}
		return location;
	}

	public LocationArea setLocation(pokeapi.bittle.models.locations.Location location) {
		this.location = location;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Name> getNames() {
		return names;
	}

	public LocationArea setNames(java.util.ArrayList<pokeapi.bittle.models.utility.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.locations.PokemonEncounter> getPokemonEncounters() {
		return pokemon_encounters;
	}

	public LocationArea setPokemonEncounters(java.util.ArrayList<pokeapi.bittle.models.locations.PokemonEncounter> pokemon_encounters) {
		this.pokemon_encounters = pokemon_encounters;
		return this;
	}

	private static LocationArea get(String url) {
		LocationArea obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), LocationArea.class);
		obj.setIsFetched(true);
		return obj;
	}

	public LocationArea get() {
		return LocationArea.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("location-area", limit, offset);
	}

	public static LocationArea getById(int id) {
		return get("https://pokeapi.co/api/v2/location-area/" + id);
	}

	public static LocationArea getByName(String name) {
		return get("https://pokeapi.co/api/v2/location-area/" + name);
	}
}