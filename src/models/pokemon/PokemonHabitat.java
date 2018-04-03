package models.pokemon;
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

public class PokemonHabitat extends models.common.NamedAPIResource {
	// The identifier for this Pokémon habitat models.resource
	private int id;

	// The name of this Pokémon habitat listed in different languages
	private java.util.ArrayList<models.common.Name> names;

	// A list of the Pokémon species that can be found in this habitat
	private java.util.ArrayList<models.pokemon.PokemonSpecies> pokemon_species;

	private static PokemonHabitat get(String url) {
		String json = api.Information.fromInternet(url);
		PokemonHabitat obj = new com.google.gson.Gson().fromJson(json, PokemonHabitat.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static PokemonHabitat getById(int id) {
		return get("https://pokeapi.co/api/v2/models.pokemon-habitat/" + id);
	}

	public static PokemonHabitat getByName(String name) {
		return get("https://pokeapi.co/api/v2/models.pokemon-habitat/" + name);
	}

	public int getId() {
		return id;
	}

	public PokemonHabitat setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getNames() {
		return names;
	}

	public PokemonHabitat setNames(java.util.ArrayList<models.common.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<models.pokemon.PokemonSpecies> getPokemonSpecies() {
		return pokemon_species;
	}

	public PokemonHabitat setPokemonSpecies(java.util.ArrayList<models.pokemon.PokemonSpecies> pokemon_species) {
		this.pokemon_species = pokemon_species;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}