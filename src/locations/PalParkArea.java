package locations;
/*
{
    "id": 1,
    "name": "forest",
    "names": [{
        "name": "Forest",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }],
    "pokemon_encounters": [{
        "base_score": 30,
        "rate": 50,
        "pokemon_species": {
            "name": "caterpie",
            "url": "http://pokeapi.co/api/v2/pokemon-species/10/"
        }
    }]
}
*/

public class PalParkArea extends common.NamedAPIResource {
	// The identifier for this pal park area resource
	private int id;

	// The name of this pal park area listed in different languages
	private java.util.ArrayList<common.Name> names;

	// A list of Pokémon encountered in thi pal park area along with details
	private java.util.ArrayList<locations.PalParkEncounterSpecies> pokemon_encounters;

	public static PalParkArea getById(int id) {
		String url = "https://pokeapi.co/api/v2/pal-park-area/" + id;
		String json = tools.Internet.get(url);
		PalParkArea obj = new com.google.gson.Gson().fromJson(json, PalParkArea.class);
		return obj;
	}

	public static PalParkArea getByName(String name) {
		String url = "https://pokeapi.co/api/v2/pal-park-area/" + name;
		String json = tools.Internet.get(url);
		PalParkArea obj = new com.google.gson.Gson().fromJson(json, PalParkArea.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public PalParkArea setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<common.Name> getNames() {
		return names;
	}

	public PalParkArea setNames(java.util.ArrayList<common.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<locations.PalParkEncounterSpecies> getPokemonEncounters() {
		return pokemon_encounters;
	}

	public PalParkArea setPokemonEncounters(java.util.ArrayList<locations.PalParkEncounterSpecies> pokemon_encounters) {
		this.pokemon_encounters = pokemon_encounters;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}