package models.evolution;
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

public class EvolutionTrigger extends models.common.NamedAPIResource {
	// The identifier for this evolution trigger resource
	private int id;

	// The name of this evolution trigger listed in different languages
	private java.util.ArrayList<models.common.Name> names;

	// A list of pokemon species that result from this evolution trigger
	private java.util.ArrayList<models.pokemon.PokemonSpecies> pokemon_species;

	private static EvolutionTrigger get(String url) {
		String json = api.Information.fromInternet(url);
		EvolutionTrigger obj = new com.google.gson.Gson().fromJson(json, EvolutionTrigger.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static EvolutionTrigger getById(int id) {
		return get("https://pokeapi.co/api/v2/evolution-trigger/" + id);
	}

	public static EvolutionTrigger getByName(String name) {
		return get("https://pokeapi.co/api/v2/evolution-trigger/" + name);
	}

	public int getId() {
		return id;
	}

	public EvolutionTrigger setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getNames() {
		return names;
	}

	public EvolutionTrigger setNames(java.util.ArrayList<models.common.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<models.pokemon.PokemonSpecies> getPokemonSpecies() {
		return pokemon_species;
	}

	public EvolutionTrigger setPokemonSpecies(java.util.ArrayList<models.pokemon.PokemonSpecies> pokemon_species) {
		this.pokemon_species = pokemon_species;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}