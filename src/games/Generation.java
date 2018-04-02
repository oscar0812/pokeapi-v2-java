package games;
/*
{
    "id": 1,
    "name": "generation-i",
    "abilities": [],
    "main_region": {
        "name": "kanto",
        "url": "http://pokeapi.co/api/v2/region/1/"
    },
    "moves": [{
        "name": "pound",
        "url": "http://pokeapi.co/api/v2/move/1/"
    }],
    "names": [{
        "name": "Generation I",
        "language": {
            "name": "de",
            "url": "http://pokeapi.co/api/v2/language/6/"
        }
    }],
    "pokemon_species": [{
        "name": "bulbasaur",
        "url": "http://pokeapi.co/api/v2/pokemon-species/1/"
    }],
    "types": [{
        "name": "normal",
        "url": "http://pokeapi.co/api/v2/type/1/"
    }],
    "version_groups": [{
        "name": "red-blue",
        "url": "http://pokeapi.co/api/v2/version-group/1/"
    }]
}
*/

public class Generation extends common.NamedAPIResource {
	// The identifier for this generation resource
	private int id;

	// A list of abilities that were introduced in this generation
	private java.util.ArrayList<pokemon.Ability> abilities;

	// The name of this generation listed in different languages
	private java.util.ArrayList<common.Name> names;

	// The main region travelled in this generation
	private locations.Region main_region;

	// A list of moves that were introduced in this generation
	private java.util.ArrayList<moves.Move> moves;

	// A list of Pokémon species that were introduced in this generation
	private java.util.ArrayList<pokemon.PokemonSpecies> pokemon_species;

	// A list of types that were introduced in this generation
	private java.util.ArrayList<pokemon.Type> types;

	// A list of version groups that were introduced in this generation
	private java.util.ArrayList<games.VersionGroup> version_groups;

	public static Generation getById(int id) {
		String url = "https://pokeapi.co/api/v2/generation/" + id;
		String json = tools.Internet.get(url);
		Generation obj = new com.google.gson.Gson().fromJson(json, Generation.class);
		return obj;
	}

	public static Generation getByName(String name) {
		String url = "https://pokeapi.co/api/v2/generation/" + name;
		String json = tools.Internet.get(url);
		Generation obj = new com.google.gson.Gson().fromJson(json, Generation.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public Generation setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<pokemon.Ability> getAbilities() {
		return abilities;
	}

	public Generation setAbilities(java.util.ArrayList<pokemon.Ability> abilities) {
		this.abilities = abilities;
		return this;
	}

	public java.util.ArrayList<common.Name> getNames() {
		return names;
	}

	public Generation setNames(java.util.ArrayList<common.Name> names) {
		this.names = names;
		return this;
	}

	public locations.Region getMainRegion() {
		return main_region;
	}

	public Generation setMainRegion(locations.Region main_region) {
		this.main_region = main_region;
		return this;
	}

	public java.util.ArrayList<moves.Move> getMoves() {
		return moves;
	}

	public Generation setMoves(java.util.ArrayList<moves.Move> moves) {
		this.moves = moves;
		return this;
	}

	public java.util.ArrayList<pokemon.PokemonSpecies> getPokemonSpecies() {
		return pokemon_species;
	}

	public Generation setPokemonSpecies(java.util.ArrayList<pokemon.PokemonSpecies> pokemon_species) {
		this.pokemon_species = pokemon_species;
		return this;
	}

	public java.util.ArrayList<pokemon.Type> getTypes() {
		return types;
	}

	public Generation setTypes(java.util.ArrayList<pokemon.Type> types) {
		this.types = types;
		return this;
	}

	public java.util.ArrayList<games.VersionGroup> getVersionGroups() {
		return version_groups;
	}

	public Generation setVersionGroups(java.util.ArrayList<games.VersionGroup> version_groups) {
		this.version_groups = version_groups;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}