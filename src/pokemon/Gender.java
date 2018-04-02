package pokemon;
/*
{
    "id": 1,
    "name": "female",
    "pokemon_species_details": [{
        "rate": 1,
        "pokemon_species": {
            "name": "bulbasaur",
            "url": "http://pokeapi.co/api/v2/pokemon-species/1/"
        }
    }],
    "required_for_evolution": [{
        "name": "wormadam",
        "url": "http://pokeapi.co/api/v2/pokemon-species/413/"
    }]
}
*/

public class Gender {
	// The identifier for this gender resource
	private int id;

	// The name for this gender resource
	private String name;

	// A list of Pokémon species that can be this gender and how likely it is that they will be
	private java.util.ArrayList<pokemon.PokemonSpeciesGender> pokemon_species_details;

	// A list of Pokémon species that required this gender in order for a Pokémon to evolve into them
	private java.util.ArrayList<pokemon.PokemonSpecies> required_for_evolution;

	public static Gender getById(int id) {
		String url = "https://pokeapi.co/api/v2/gender/" + id;
		String json = tools.Internet.get(url);
		Gender obj = new com.google.gson.Gson().fromJson(json, Gender.class);
		return obj;
	}

	public static Gender getByName(String name) {
		String url = "https://pokeapi.co/api/v2/gender/" + name;
		String json = tools.Internet.get(url);
		Gender obj = new com.google.gson.Gson().fromJson(json, Gender.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public Gender setId(int id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Gender setName(String name) {
		this.name = name;
		return this;
	}

	public java.util.ArrayList<pokemon.PokemonSpeciesGender> getPokemonSpeciesDetails() {
		return pokemon_species_details;
	}

	public Gender setPokemonSpeciesDetails(java.util.ArrayList<pokemon.PokemonSpeciesGender> pokemon_species_details) {
		this.pokemon_species_details = pokemon_species_details;
		return this;
	}

	public java.util.ArrayList<pokemon.PokemonSpecies> getRequiredForEvolution() {
		return required_for_evolution;
	}

	public Gender setRequiredForEvolution(java.util.ArrayList<pokemon.PokemonSpecies> required_for_evolution) {
		this.required_for_evolution = required_for_evolution;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}