package models.pokemon;
/*
{
    "id": 1,
    "name": "monster",
    "names": [{
        "name": "ã‹ã„ã˜ã‚…ã†",
        "language": {
            "name": "ja",
            "url": "http://pokeapi.co/api/v2/language/1/"
        }
    }],
    "pokemon_species": [{
        "name": "bulbasaur",
        "url": "http://pokeapi.co/api/v2/pokemon-species/1/"
    }]
}
*/

public class EggGroup extends models.common.NamedAPIResource {
	// The identifier for this egg group models.resource
	private int id;

	// The name of this egg group listed in different languages
	private java.util.ArrayList<models.common.Name> names;

	// A list of all Pokémon species that are members of this egg group
	private java.util.ArrayList<models.pokemon.PokemonSpecies> pokemon_species;

	private static EggGroup get(String url) {
		String json = api.Information.fromInternet(url);
		EggGroup obj = new com.google.gson.Gson().fromJson(json, EggGroup.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static EggGroup getById(int id) {
		return get("https://pokeapi.co/api/v2/egg-group/" + id);
	}

	public static EggGroup getByName(String name) {
		return get("https://pokeapi.co/api/v2/egg-group/" + name);
	}

	public int getId() {
		return id;
	}

	public EggGroup setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getNames() {
		return names;
	}

	public EggGroup setNames(java.util.ArrayList<models.common.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<models.pokemon.PokemonSpecies> getPokemonSpecies() {
		return pokemon_species;
	}

	public EggGroup setPokemonSpecies(java.util.ArrayList<models.pokemon.PokemonSpecies> pokemon_species) {
		this.pokemon_species = pokemon_species;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}