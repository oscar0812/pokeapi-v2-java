package models.pokemon;
/*
{
    "id": 1,
    "name": "black",
    "names": [{
        "name": "é»’ã„",
        "language": {
            "name": "ja",
            "url": "http://pokeapi.co/api/v2/language/1/"
        }
    }],
    "pokemon_species": [{
        "name": "snorlax",
        "url": "http://pokeapi.co/api/v2/pokemon-species/143/"
    }]
}
*/

public class PokemonColor extends models.common.NamedAPIResource {
	// The identifier for this Pokémon color resource
	private int id;

	// The name of this Pokémon color listed in different languages
	private java.util.ArrayList<models.common.Name> names;

	// A list of the Pokémon species that have this color
	private java.util.ArrayList<models.pokemon.PokemonSpecies> pokemon_species;

	private static PokemonColor get(String url) {
		String json = api.Information.fromInternet(url);
		PokemonColor obj = new com.google.gson.Gson().fromJson(json, PokemonColor.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static PokemonColor getById(int id) {
		return get("https://pokeapi.co/api/v2/pokemon-color/" + id);
	}

	public static PokemonColor getByName(String name) {
		return get("https://pokeapi.co/api/v2/pokemon-color/" + name);
	}

	public int getId() {
		return id;
	}

	public PokemonColor setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getNames() {
		return names;
	}

	public PokemonColor setNames(java.util.ArrayList<models.common.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<models.pokemon.PokemonSpecies> getPokemonSpecies() {
		return pokemon_species;
	}

	public PokemonColor setPokemonSpecies(java.util.ArrayList<models.pokemon.PokemonSpecies> pokemon_species) {
		this.pokemon_species = pokemon_species;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}