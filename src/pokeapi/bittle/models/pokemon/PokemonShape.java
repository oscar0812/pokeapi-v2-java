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

import java.util.ArrayList;
import pokeapi.bittle.models.resources.NamedAPIResourceList;
import pokeapi.bittle.models.utility.Name;
import pokeapi.bittle.models.utility.NamedAPIResource;
import pokeapi.bittle.utils.Information;

public class PokemonShape extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The "scientific" name of this Pokémon shape listed in different languages.
	private ArrayList<AwesomeName> awesome_names;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	// A list of the Pokémon species that have this shape.
	private ArrayList<PokemonSpecies> pokemon_species;

	public int getId() {
		return id;
	}

	public PokemonShape setId(int id) {
		this.id = id;
		return this;
	}

	public ArrayList<AwesomeName> getAwesomeNames() {
		return awesome_names;
	}

	public PokemonShape setAwesomeNames(ArrayList<AwesomeName> awesome_names) {
		this.awesome_names = awesome_names;
		return this;
	}

	public ArrayList<Name> getNames() {
		return names;
	}

	public PokemonShape setNames(ArrayList<Name> names) {
		this.names = names;
		return this;
	}

	public ArrayList<PokemonSpecies> getPokemonSpecies() {
		return pokemon_species;
	}

	public PokemonShape setPokemonSpecies(ArrayList<PokemonSpecies> pokemon_species) {
		this.pokemon_species = pokemon_species;
		return this;
	}

	private static PokemonShape get(String url) {
		PokemonShape obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), PokemonShape.class);
		obj.setIsFetched(true);
		return obj;
	}

	public PokemonShape get() {
		return PokemonShape.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("pokemon-shape", limit, offset);
	}

	public static PokemonShape getById(int id) {
		return get("https://pokeapi.co/api/v2/pokemon-shape/" + id);
	}

	public static PokemonShape getByName(String name) {
		return get("https://pokeapi.co/api/v2/pokemon-shape/" + name);
	}
}