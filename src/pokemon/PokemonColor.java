package pokemon;
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

public class PokemonColor extends common.NamedAPIResource {
	// The identifier for this Pokémon color resource
	private int id;

	// The name of this Pokémon color listed in different languages
	private java.util.ArrayList<common.Name> names;

	// A list of the Pokémon species that have this color
	private java.util.ArrayList<pokemon.PokemonSpecies> pokemon_species;

	public static PokemonColor getById(int id) {
		String url = "https://pokeapi.co/api/v2/pokemon-color/" + id;
		String json = tools.Internet.get(url);
		PokemonColor obj = new com.google.gson.Gson().fromJson(json, PokemonColor.class);
		return obj;
	}

	public static PokemonColor getByName(String name) {
		String url = "https://pokeapi.co/api/v2/pokemon-color/" + name;
		String json = tools.Internet.get(url);
		PokemonColor obj = new com.google.gson.Gson().fromJson(json, PokemonColor.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public PokemonColor setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<common.Name> getNames() {
		return names;
	}

	public PokemonColor setNames(java.util.ArrayList<common.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<pokemon.PokemonSpecies> getPokemonSpecies() {
		return pokemon_species;
	}

	public PokemonColor setPokemonSpecies(java.util.ArrayList<pokemon.PokemonSpecies> pokemon_species) {
		this.pokemon_species = pokemon_species;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}