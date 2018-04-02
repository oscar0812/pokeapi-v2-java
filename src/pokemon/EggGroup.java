package pokemon;
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

public class EggGroup extends common.NamedAPIResource {
	// The identifier for this egg group resource
	private int id;

	// The name of this egg group listed in different languages
	private java.util.ArrayList<common.Name> names;

	// A list of all Pokémon species that are members of this egg group
	private java.util.ArrayList<pokemon.PokemonSpecies> pokemon_species;

	public static EggGroup getById(int id) {
		String url = "https://pokeapi.co/api/v2/egg-group/" + id;
		String json = tools.Internet.get(url);
		EggGroup obj = new com.google.gson.Gson().fromJson(json, EggGroup.class);
		return obj;
	}

	public static EggGroup getByName(String name) {
		String url = "https://pokeapi.co/api/v2/egg-group/" + name;
		String json = tools.Internet.get(url);
		EggGroup obj = new com.google.gson.Gson().fromJson(json, EggGroup.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public EggGroup setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<common.Name> getNames() {
		return names;
	}

	public EggGroup setNames(java.util.ArrayList<common.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<pokemon.PokemonSpecies> getPokemonSpecies() {
		return pokemon_species;
	}

	public EggGroup setPokemonSpecies(java.util.ArrayList<pokemon.PokemonSpecies> pokemon_species) {
		this.pokemon_species = pokemon_species;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}