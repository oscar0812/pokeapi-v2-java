/* Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out Bulbapedia for greater detail. */

package pokeapi.bittle.models.pokemon;
/*
{
  "id": 1,
  "name": "female",
  "pokemon_species_details": [
    {
      "rate": 1,
      "pokemon_species": {
        "name": "bulbasaur",
        "url": "https://pokeapi.co/api/v2/pokemon-species/1/"
      }
    }
  ],
  "required_for_evolution": [
    {
      "name": "wormadam",
      "url": "https://pokeapi.co/api/v2/pokemon-species/413/"
    }
  ]
}
*/

public class PokemonSpeciesGender {
	// The chance of this Pokémon being female, in eighths; or -1 for genderless.
	private int rate;

	// A Pokémon species that can be the referenced gender.
	private PokemonSpecies pokemon_species;

	public int getRate() {
		return rate;
	}

	public PokemonSpeciesGender setRate(int rate) {
		this.rate = rate;
		return this;
	}

	public PokemonSpecies getPokemonSpecies() {
		if(!pokemon_species.getIsFetched()) {
			pokemon_species = pokemon_species.get();
		}
		return pokemon_species;
	}

	public PokemonSpeciesGender setPokemonSpecies(PokemonSpecies pokemon_species) {
		this.pokemon_species = pokemon_species;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}