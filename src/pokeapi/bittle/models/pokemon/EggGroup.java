/* Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out Bulbapedia for greater detail. */

package pokeapi.bittle.models.pokemon;
/*
{
  "id": 1,
  "name": "monster",
  "names": [
    {
      "name": "かいじゅう",
      "language": {
        "name": "ja",
        "url": "https://pokeapi.co/api/v2/language/1/"
      }
    }
  ],
  "pokemon_species": [
    {
      "name": "bulbasaur",
      "url": "https://pokeapi.co/api/v2/pokemon-species/1/"
    }
  ]
}
*/

import java.util.ArrayList;
import pokeapi.bittle.models.resources.NamedAPIResourceList;
import pokeapi.bittle.models.utility.Name;
import pokeapi.bittle.models.utility.NamedAPIResource;
import pokeapi.bittle.utils.Information;

public class EggGroup extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	// A list of all Pokémon species that are members of this egg group.
	private ArrayList<PokemonSpecies> pokemon_species;

	public int getId() {
		return id;
	}

	public EggGroup setId(int id) {
		this.id = id;
		return this;
	}

	public ArrayList<Name> getNames() {
		return names;
	}

	public EggGroup setNames(ArrayList<Name> names) {
		this.names = names;
		return this;
	}

	public ArrayList<PokemonSpecies> getPokemonSpecies() {
		return pokemon_species;
	}

	public EggGroup setPokemonSpecies(ArrayList<PokemonSpecies> pokemon_species) {
		this.pokemon_species = pokemon_species;
		return this;
	}

	private static EggGroup get(String url) {
		EggGroup obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), EggGroup.class);
		obj.setIsFetched(true);
		return obj;
	}

	public EggGroup get() {
		return EggGroup.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("egg-group", limit, offset);
	}

	public static EggGroup getById(int id) {
		return get("https://pokeapi.co/api/v2/egg-group/" + id);
	}

	public static EggGroup getByName(String name) {
		return get("https://pokeapi.co/api/v2/egg-group/" + name);
	}
}