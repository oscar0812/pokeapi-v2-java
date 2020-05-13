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

public class PokemonHabitat extends pokeapi.bittle.models.utility.NamedAPIResource {
	public int getId() {
				return id;
	}

	public PokemonHabitat setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Name> getNames() {
				return names;
	}

	public PokemonHabitat setNames(java.util.ArrayList<pokeapi.bittle.models.utility.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.pokemon.PokemonSpecies> getPokemonSpecies() {
				return pokemon_species;
	}

	public PokemonHabitat setPokemonSpecies(java.util.ArrayList<pokeapi.bittle.models.pokemon.PokemonSpecies> pokemon_species) {
		this.pokemon_species = pokemon_species;
		return this;
	}

	// The identifier for this resource.
	private int id;

	// The name of this resource listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Name> names;

	// A list of the Pokémon species that can be found in this habitat.
	private java.util.ArrayList<pokeapi.bittle.models.pokemon.PokemonSpecies> pokemon_species;

	private static PokemonHabitat get(String url) {
		PokemonHabitat obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), PokemonHabitat.class);
		obj.setIsFetched(true);
		return obj;
	}

	public PokemonHabitat get() {
		return PokemonHabitat.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("pokemon-habitat", limit, offset);
	}

	public static PokemonHabitat getById(int id) {
		return get("https://pokeapi.co/api/v2/pokemon-habitat/" + id);
	}

	public static PokemonHabitat getByName(String name) {
		return get("https://pokeapi.co/api/v2/pokemon-habitat/" + name);
	}
}