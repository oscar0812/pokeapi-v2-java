/* Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown. */

package pokeapi.bittle.models.pokemon;
/*
{
  "id": 1,
  "name": "black",
  "names": [
    {
      "name": "é»’ã„",
      "language": {
        "name": "ja",
        "url": "https://pokeapi.co/api/v2/language/1/"
      }
    }
  ],
  "pokemon_species": [
    {
      "name": "snorlax",
      "url": "https://pokeapi.co/api/v2/pokemon-species/143/"
    }
  ]
}
*/

public class PokemonColor extends pokeapi.bittle.models.utility.NamedAPIResource {
	public int getId() {
				return id;
	}

	public PokemonColor setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Name> getNames() {
				return names;
	}

	public PokemonColor setNames(java.util.ArrayList<pokeapi.bittle.models.utility.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.pokemon.PokemonSpecies> getPokemonSpecies() {
				return pokemon_species;
	}

	public PokemonColor setPokemonSpecies(java.util.ArrayList<pokeapi.bittle.models.pokemon.PokemonSpecies> pokemon_species) {
		this.pokemon_species = pokemon_species;
		return this;
	}

	// The identifier for this resource.
	private int id;

	// The name of this resource listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Name> names;

	// A list of the Pokémon species that have this color.
	private java.util.ArrayList<pokeapi.bittle.models.pokemon.PokemonSpecies> pokemon_species;

	private static PokemonColor get(String url) {
		PokemonColor obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), PokemonColor.class);
		obj.setIsFetched(true);
		return obj;
	}

	public PokemonColor get() {
		return PokemonColor.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("pokemon-color", limit, offset);
	}

	public static PokemonColor getById(int id) {
		return get("https://pokeapi.co/api/v2/pokemon-color/" + id);
	}

	public static PokemonColor getByName(String name) {
		return get("https://pokeapi.co/api/v2/pokemon-color/" + name);
	}
}