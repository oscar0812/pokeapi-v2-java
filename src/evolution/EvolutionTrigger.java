package evolution;
/*
{
    "id": 1,
    "name": "level-up",
    "names": [{
        "name": "Level up",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }],
    "pokemon_species": [{
        "name": "ivysaur",
        "url": "http://pokeapi.co/api/v2/pokemon-species/2/"
    }]
}
*/

public class EvolutionTrigger extends common.NamedAPIResource {
	// The identifier for this evolution trigger resource
	private int id;

	// The name of this evolution trigger listed in different languages
	private java.util.ArrayList<common.Name> names;

	// A list of pokemon species that result from this evolution trigger
	private java.util.ArrayList<pokemon.PokemonSpecies> pokemon_species;

	public static EvolutionTrigger getById(int id) {
		String url = "https://pokeapi.co/api/v2/evolution-trigger/" + id;
		String json = tools.Internet.get(url);
		EvolutionTrigger obj = new com.google.gson.Gson().fromJson(json, EvolutionTrigger.class);
		return obj;
	}

	public static EvolutionTrigger getByName(String name) {
		String url = "https://pokeapi.co/api/v2/evolution-trigger/" + name;
		String json = tools.Internet.get(url);
		EvolutionTrigger obj = new com.google.gson.Gson().fromJson(json, EvolutionTrigger.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public EvolutionTrigger setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<common.Name> getNames() {
		return names;
	}

	public EvolutionTrigger setNames(java.util.ArrayList<common.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<pokemon.PokemonSpecies> getPokemonSpecies() {
		return pokemon_species;
	}

	public EvolutionTrigger setPokemonSpecies(java.util.ArrayList<pokemon.PokemonSpecies> pokemon_species) {
		this.pokemon_species = pokemon_species;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}