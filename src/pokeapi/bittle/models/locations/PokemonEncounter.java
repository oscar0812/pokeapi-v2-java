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

public class PokemonEncounter {
	// The Pokémon being encountered.
	private pokeapi.bittle.models.pokemon.Pokemon pokemon;

	// A list of versions and encounters with Pokémon that might happen in the referenced location area.
	private java.util.ArrayList<pokeapi.bittle.models.utility.VersionEncounterDetail> version_details;

	public pokeapi.bittle.models.pokemon.Pokemon getPokemon() {
		if(!pokemon.getIsFetched()) {
			pokemon = pokemon.get();
		}
		return pokemon;
	}

	public PokemonEncounter setPokemon(pokeapi.bittle.models.pokemon.Pokemon pokemon) {
		this.pokemon = pokemon;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.VersionEncounterDetail> getVersionDetails() {
		return version_details;
	}

	public PokemonEncounter setVersionDetails(java.util.ArrayList<pokeapi.bittle.models.utility.VersionEncounterDetail> version_details) {
		this.version_details = version_details;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}