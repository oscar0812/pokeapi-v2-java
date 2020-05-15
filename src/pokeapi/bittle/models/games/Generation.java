/* A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released. */

package pokeapi.bittle.models.games;
/*
{
  "id": 1,
  "name": "generation-i",
  "abilities": [],
  "main_region": {
    "name": "kanto",
    "url": "https://pokeapi.co/api/v2/region/1/"
  },
  "moves": [
    {
      "name": "pound",
      "url": "https://pokeapi.co/api/v2/move/1/"
    }
  ],
  "names": [
    {
      "name": "Generation I",
      "language": {
        "name": "de",
        "url": "https://pokeapi.co/api/v2/language/6/"
      }
    }
  ],
  "pokemon_species": [
    {
      "name": "bulbasaur",
      "url": "https://pokeapi.co/api/v2/pokemon-species/1/"
    }
  ],
  "types": [
    {
      "name": "normal",
      "url": "https://pokeapi.co/api/v2/type/1/"
    }
  ],
  "version_groups": [
    {
      "name": "red-blue",
      "url": "https://pokeapi.co/api/v2/version-group/1/"
    }
  ]
}
*/

import java.util.ArrayList;
import pokeapi.bittle.models.locations.Region;
import pokeapi.bittle.models.moves.Move;
import pokeapi.bittle.models.pokemon.Ability;
import pokeapi.bittle.models.pokemon.PokemonSpecies;
import pokeapi.bittle.models.pokemon.Type;
import pokeapi.bittle.models.resources.NamedAPIResourceList;
import pokeapi.bittle.models.utility.Name;
import pokeapi.bittle.models.utility.NamedAPIResource;
import pokeapi.bittle.utils.Information;

public class Generation extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// A list of abilities that were introduced in this generation.
	private ArrayList<Ability> abilities;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	// The main region travelled in this generation.
	private Region main_region;

	// A list of moves that were introduced in this generation.
	private ArrayList<Move> moves;

	// A list of Pokémon species that were introduced in this generation.
	private ArrayList<PokemonSpecies> pokemon_species;

	// A list of types that were introduced in this generation.
	private ArrayList<Type> types;

	// A list of version groups that were introduced in this generation.
	private ArrayList<VersionGroup> version_groups;

	public int getId() {
		return id;
	}

	public Generation setId(int id) {
		this.id = id;
		return this;
	}

	public ArrayList<Ability> getAbilities() {
		return abilities;
	}

	public Generation setAbilities(ArrayList<Ability> abilities) {
		this.abilities = abilities;
		return this;
	}

	public ArrayList<Name> getNames() {
		return names;
	}

	public Generation setNames(ArrayList<Name> names) {
		this.names = names;
		return this;
	}

	public Region getMainRegion() {
		if(!main_region.getIsFetched()) {
			main_region = main_region.get();
		}
		return main_region;
	}

	public Generation setMainRegion(Region main_region) {
		this.main_region = main_region;
		return this;
	}

	public ArrayList<Move> getMoves() {
		return moves;
	}

	public Generation setMoves(ArrayList<Move> moves) {
		this.moves = moves;
		return this;
	}

	public ArrayList<PokemonSpecies> getPokemonSpecies() {
		return pokemon_species;
	}

	public Generation setPokemonSpecies(ArrayList<PokemonSpecies> pokemon_species) {
		this.pokemon_species = pokemon_species;
		return this;
	}

	public ArrayList<Type> getTypes() {
		return types;
	}

	public Generation setTypes(ArrayList<Type> types) {
		this.types = types;
		return this;
	}

	public ArrayList<VersionGroup> getVersionGroups() {
		return version_groups;
	}

	public Generation setVersionGroups(ArrayList<VersionGroup> version_groups) {
		this.version_groups = version_groups;
		return this;
	}

	private static Generation get(String url) {
		Generation obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), Generation.class);
		obj.setIsFetched(true);
		return obj;
	}

	public Generation get() {
		return Generation.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("generation", limit, offset);
	}

	public static Generation getById(int id) {
		return get("https://pokeapi.co/api/v2/generation/" + id);
	}

	public static Generation getByName(String name) {
		return get("https://pokeapi.co/api/v2/generation/" + name);
	}
}