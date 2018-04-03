package models.pokemon;
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

public class PokemonShape extends models.common.NamedAPIResource {
	// The identifier for this Pokémon shape models.resource
	private int id;

	// The "scientific" name of this Pokémon shape listed in different languages
	private java.util.ArrayList<models.pokemon.AwesomeName> awesome_names;

	// The name of this Pokémon shape listed in different languages
	private java.util.ArrayList<models.common.Name> names;

	// A list of the Pokémon species that have this shape
	private java.util.ArrayList<models.pokemon.PokemonSpecies> pokemon_species;

	private static PokemonShape get(String url) {
		String json = api.Information.fromInternet(url);
		PokemonShape obj = new com.google.gson.Gson().fromJson(json, PokemonShape.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static PokemonShape getById(int id) {
		return get("https://pokeapi.co/api/v2/models.pokemon-shape/" + id);
	}

	public static PokemonShape getByName(String name) {
		return get("https://pokeapi.co/api/v2/models.pokemon-shape/" + name);
	}

	public int getId() {
		return id;
	}

	public PokemonShape setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<models.pokemon.AwesomeName> getAwesomeNames() {
		return awesome_names;
	}

	public PokemonShape setAwesomeNames(java.util.ArrayList<models.pokemon.AwesomeName> awesome_names) {
		this.awesome_names = awesome_names;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getNames() {
		return names;
	}

	public PokemonShape setNames(java.util.ArrayList<models.common.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<models.pokemon.PokemonSpecies> getPokemonSpecies() {
		return pokemon_species;
	}

	public PokemonShape setPokemonSpecies(java.util.ArrayList<models.pokemon.PokemonSpecies> pokemon_species) {
		this.pokemon_species = pokemon_species;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}