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

import java.util.ArrayList;
import pokeapi.bittle.models.resources.NamedAPIResourceList;
import pokeapi.bittle.models.utility.NamedAPIResource;
import pokeapi.bittle.utils.Information;

public class Gender extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// A list of Pokémon species that can be this gender and how likely it is that they will be.
	private ArrayList<PokemonSpeciesGender> pokemon_species_details;

	// A list of Pokémon species that required this gender in order for a Pokémon to evolve into them.
	private ArrayList<PokemonSpecies> required_for_evolution;

	public int getId() {
		return id;
	}

	public Gender setId(int id) {
		this.id = id;
		return this;
	}

	public ArrayList<PokemonSpeciesGender> getPokemonSpeciesDetails() {
		return pokemon_species_details;
	}

	public Gender setPokemonSpeciesDetails(ArrayList<PokemonSpeciesGender> pokemon_species_details) {
		this.pokemon_species_details = pokemon_species_details;
		return this;
	}

	public ArrayList<PokemonSpecies> getRequiredForEvolution() {
		return required_for_evolution;
	}

	public Gender setRequiredForEvolution(ArrayList<PokemonSpecies> required_for_evolution) {
		this.required_for_evolution = required_for_evolution;
		return this;
	}

	private static Gender get(String url) {
		Gender obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), Gender.class);
		obj.setIsFetched(true);
		return obj;
	}

	public Gender get() {
		return Gender.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("gender", limit, offset);
	}

	public static Gender getById(int id) {
		return get("https://pokeapi.co/api/v2/gender/" + id);
	}

	public static Gender getByName(String name) {
		return get("https://pokeapi.co/api/v2/gender/" + name);
	}
}