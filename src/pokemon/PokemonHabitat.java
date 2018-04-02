package pokemon;
/*
{
    "id": 1,
    "name": "cave",
    "names": [
        {
            "name": "grottes",
            "language": {
                "name": "fr",
                "url": "http://pokeapi.co/api/v2/language/5/"
            }
        }
    ],
    "pokemon_species": [
        {
            "name": "zubat",
            "url": "http://pokeapi.co/api/v2/pokemon-species/41/"
        }
    ]
}
*/

public class PokemonHabitat extends common.NamedAPIResource {
	// The identifier for this Pokémon habitat resource
	private int id;

	// The name of this Pokémon habitat listed in different languages
	private java.util.ArrayList<common.Name> names;

	// A list of the Pokémon species that can be found in this habitat
	private java.util.ArrayList<pokemon.PokemonSpecies> pokemon_species;

	public static PokemonHabitat getById(int id) {
		String url = "https://pokeapi.co/api/v2/pokemon-habitat/" + id;
		String json = tools.Internet.get(url);
		PokemonHabitat obj = new com.google.gson.Gson().fromJson(json, PokemonHabitat.class);
		return obj;
	}

	public static PokemonHabitat getByName(String name) {
		String url = "https://pokeapi.co/api/v2/pokemon-habitat/" + name;
		String json = tools.Internet.get(url);
		PokemonHabitat obj = new com.google.gson.Gson().fromJson(json, PokemonHabitat.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public PokemonHabitat setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<common.Name> getNames() {
		return names;
	}

	public PokemonHabitat setNames(java.util.ArrayList<common.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<pokemon.PokemonSpecies> getPokemonSpecies() {
		return pokemon_species;
	}

	public PokemonHabitat setPokemonSpecies(java.util.ArrayList<pokemon.PokemonSpecies> pokemon_species) {
		this.pokemon_species = pokemon_species;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}