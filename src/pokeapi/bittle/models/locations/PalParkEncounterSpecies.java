/* Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park. */

package pokeapi.bittle.models.locations;
/*
{
  "id": 1,
  "name": "forest",
  "names": [
    {
      "name": "Forest",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "pokemon_encounters": [
    {
      "base_score": 30,
      "rate": 50,
      "pokemon_species": {
        "name": "caterpie",
        "url": "https://pokeapi.co/api/v2/pokemon-species/10/"
      }
    }
  ]
}
*/

public class PalParkEncounterSpecies {
	public int getBaseScore() {
				return base_score;
	}

	public PalParkEncounterSpecies setBaseScore(int base_score) {
		this.base_score = base_score;
		return this;
	}

	public int getRate() {
				return rate;
	}

	public PalParkEncounterSpecies setRate(int rate) {
		this.rate = rate;
		return this;
	}

	public pokeapi.bittle.models.pokemon.PokemonSpecies getPokemonSpecies() {
		if(!pokemon_species.getIsFetched()) {
			pokemon_species = pokemon_species.get();
		}

		return pokemon_species;
	}

	public PalParkEncounterSpecies setPokemonSpecies(pokeapi.bittle.models.pokemon.PokemonSpecies pokemon_species) {
		this.pokemon_species = pokemon_species;
		return this;
	}

	// The base score given to the player when this Pokémon is caught during a pal park run.
	private int base_score;

	// The base rate for encountering this Pokémon in this pal park area.
	private int rate;

	// The Pokémon species being encountered.
	private pokeapi.bittle.models.pokemon.PokemonSpecies pokemon_species;

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}