/* Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out Bulbapedia for greater detail. */

package pokeapi.bittle.models.evolution;
/*
{
  "id": 1,
  "name": "level-up",
  "names": [
    {
      "name": "Level up",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "pokemon_species": [
    {
      "name": "ivysaur",
      "url": "https://pokeapi.co/api/v2/pokemon-species/2/"
    }
  ]
}
*/

public class EvolutionTrigger extends pokeapi.bittle.models.utility.NamedAPIResource {
	public int getId() {
				return id;
	}

	public EvolutionTrigger setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Name> getNames() {
				return names;
	}

	public EvolutionTrigger setNames(java.util.ArrayList<pokeapi.bittle.models.utility.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.pokemon.PokemonSpecies> getPokemonSpecies() {
				return pokemon_species;
	}

	public EvolutionTrigger setPokemonSpecies(java.util.ArrayList<pokeapi.bittle.models.pokemon.PokemonSpecies> pokemon_species) {
		this.pokemon_species = pokemon_species;
		return this;
	}

	// The identifier for this resource.
	private int id;

	// The name of this resource listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Name> names;

	// A list of pokemon species that result from this evolution trigger.
	private java.util.ArrayList<pokeapi.bittle.models.pokemon.PokemonSpecies> pokemon_species;

	private static EvolutionTrigger get(String url) {
		EvolutionTrigger obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), EvolutionTrigger.class);
		obj.setIsFetched(true);
		return obj;
	}

	public EvolutionTrigger get() {
		return EvolutionTrigger.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("evolution-trigger", limit, offset);
	}

	public static EvolutionTrigger getById(int id) {
		return get("https://pokeapi.co/api/v2/evolution-trigger/" + id);
	}

	public static EvolutionTrigger getByName(String name) {
		return get("https://pokeapi.co/api/v2/evolution-trigger/" + name);
	}
}