package pokemon;
/*
{
    "id": 1,
    "name": "ball",
    "awesome_names": [
        {
            "awesome_name": "Pomaceous",
            "language": {
                "name": "en",
                "url": "http://pokeapi.co/api/v2/language/9/"
            }
        }
    ],
    "names": [
        {
            "name": "Ball",
            "language": {
                "name": "en",
                "url": "http://pokeapi.co/api/v2/language/9/"
            }
        }
    ],
    "pokemon_species": [
        {
            "name": "shellder",
            "url": "http://pokeapi.co/api/v2/pokemon-species/90/"
        }
    ]
}
*/

public class PokemonShape extends common.NamedAPIResource {
	// The identifier for this Pokémon shape resource
	private int id;

	// The "scientific" name of this Pokémon shape listed in different languages
	private java.util.ArrayList<pokemon.AwesomeName> awesome_names;

	// The name of this Pokémon shape listed in different languages
	private java.util.ArrayList<common.Name> names;

	// A list of the Pokémon species that have this shape
	private java.util.ArrayList<pokemon.PokemonSpecies> pokemon_species;

	public static PokemonShape getById(int id) {
		String url = "https://pokeapi.co/api/v2/pokemon-shape/" + id;
		String json = tools.Internet.get(url);
		PokemonShape obj = new com.google.gson.Gson().fromJson(json, PokemonShape.class);
		return obj;
	}

	public static PokemonShape getByName(String name) {
		String url = "https://pokeapi.co/api/v2/pokemon-shape/" + name;
		String json = tools.Internet.get(url);
		PokemonShape obj = new com.google.gson.Gson().fromJson(json, PokemonShape.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public PokemonShape setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<pokemon.AwesomeName> getAwesomeNames() {
		return awesome_names;
	}

	public PokemonShape setAwesomeNames(java.util.ArrayList<pokemon.AwesomeName> awesome_names) {
		this.awesome_names = awesome_names;
		return this;
	}

	public java.util.ArrayList<common.Name> getNames() {
		return names;
	}

	public PokemonShape setNames(java.util.ArrayList<common.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<pokemon.PokemonSpecies> getPokemonSpecies() {
		return pokemon_species;
	}

	public PokemonShape setPokemonSpecies(java.util.ArrayList<pokemon.PokemonSpecies> pokemon_species) {
		this.pokemon_species = pokemon_species;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}