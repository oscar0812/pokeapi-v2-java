/* Shapes used for sorting Pokémon in a Pokédex. */

package pokeapi.bittle.models.pokemon;
/*
{
  "id": 1,
  "name": "ball",
  "awesome_names": [
    {
      "awesome_name": "Pomaceous",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "names": [
    {
      "name": "Ball",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "pokemon_species": [
    {
      "name": "shellder",
      "url": "https://pokeapi.co/api/v2/pokemon-species/90/"
    }
  ]
}
*/

public class PokemonShape extends pokeapi.bittle.models.utility.NamedAPIResource {
	public int getId() {
				return id;
	}

	public PokemonShape setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.pokemon.AwesomeName> getAwesomeNames() {
				return awesome_names;
	}

	public PokemonShape setAwesomeNames(java.util.ArrayList<pokeapi.bittle.models.pokemon.AwesomeName> awesome_names) {
		this.awesome_names = awesome_names;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Name> getNames() {
				return names;
	}

	public PokemonShape setNames(java.util.ArrayList<pokeapi.bittle.models.utility.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.pokemon.PokemonSpecies> getPokemonSpecies() {
				return pokemon_species;
	}

	public PokemonShape setPokemonSpecies(java.util.ArrayList<pokeapi.bittle.models.pokemon.PokemonSpecies> pokemon_species) {
		this.pokemon_species = pokemon_species;
		return this;
	}

	// The identifier for this resource.
	private int id;

	// The "scientific" name of this Pokémon shape listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.pokemon.AwesomeName> awesome_names;

	// The name of this resource listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Name> names;

	// A list of the Pokémon species that have this shape.
	private java.util.ArrayList<pokeapi.bittle.models.pokemon.PokemonSpecies> pokemon_species;

	private static PokemonShape get(String url) {
		PokemonShape obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), PokemonShape.class);
		obj.setIsFetched(true);
		return obj;
	}

	public PokemonShape get() {
		return PokemonShape.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("pokemon-shape", limit, offset);
	}

	public static PokemonShape getById(int id) {
		return get("https://pokeapi.co/api/v2/pokemon-shape/" + id);
	}

	public static PokemonShape getByName(String name) {
		return get("https://pokeapi.co/api/v2/pokemon-shape/" + name);
	}
}