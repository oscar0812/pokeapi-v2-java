/* Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon. */

package pokeapi.bittle.models.pokemon;
/*
{
  "id": 1,
  "name": "cave",
  "names": [
    {
      "name": "grottes",
      "language": {
        "name": "fr",
        "url": "https://pokeapi.co/api/v2/language/5/"
      }
    }
  ],
  "pokemon_species": [
    {
      "name": "zubat",
      "url": "https://pokeapi.co/api/v2/pokemon-species/41/"
    }
  ]
}
*/

import java.util.ArrayList;
import pokeapi.bittle.models.resources.NamedAPIResourceList;
import pokeapi.bittle.models.utility.Name;
import pokeapi.bittle.models.utility.NamedAPIResource;
import pokeapi.bittle.utils.Information;

public class PokemonHabitat extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	// A list of the Pokémon species that can be found in this habitat.
	private ArrayList<PokemonSpecies> pokemon_species;

	public int getId() {
		return id;
	}

	public PokemonHabitat setId(int id) {
		this.id = id;
		return this;
	}

	public ArrayList<Name> getNames() {
		return names;
	}

	public PokemonHabitat setNames(ArrayList<Name> names) {
		this.names = names;
		return this;
	}

	public ArrayList<PokemonSpecies> getPokemonSpecies() {
		return pokemon_species;
	}

	public PokemonHabitat setPokemonSpecies(ArrayList<PokemonSpecies> pokemon_species) {
		this.pokemon_species = pokemon_species;
		return this;
	}

	private static PokemonHabitat get(String url) {
		PokemonHabitat obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), PokemonHabitat.class);
		obj.setIsFetched(true);
		return obj;
	}

	public PokemonHabitat get() {
		return PokemonHabitat.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("pokemon-habitat", limit, offset);
	}

	public static PokemonHabitat getById(int id) {
		return get("https://pokeapi.co/api/v2/pokemon-habitat/" + id);
	}

	public static PokemonHabitat getByName(String name) {
		return get("https://pokeapi.co/api/v2/pokemon-habitat/" + name);
	}
}