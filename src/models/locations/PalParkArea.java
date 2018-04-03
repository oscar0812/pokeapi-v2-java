package models.locations;
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

public class PalParkArea extends models.common.NamedAPIResource {
	// The identifier for this pal park area resource
	private int id;

	// The name of this pal park area listed in different languages
	private java.util.ArrayList<models.common.Name> names;

	// A list of Pokémon encountered in thi pal park area along with details
	private java.util.ArrayList<models.locations.PalParkEncounterSpecies> pokemon_encounters;

	private static PalParkArea get(String url) {
		String json = api.Information.fromInternet(url);
		PalParkArea obj = new com.google.gson.Gson().fromJson(json, PalParkArea.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static PalParkArea getById(int id) {
		return get("https://pokeapi.co/api/v2/pal-park-area/" + id);
	}

	public static PalParkArea getByName(String name) {
		return get("https://pokeapi.co/api/v2/pal-park-area/" + name);
	}

	public int getId() {
		return id;
	}

	public PalParkArea setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getNames() {
		return names;
	}

	public PalParkArea setNames(java.util.ArrayList<models.common.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<models.locations.PalParkEncounterSpecies> getPokemonEncounters() {
		return pokemon_encounters;
	}

	public PalParkArea setPokemonEncounters(java.util.ArrayList<models.locations.PalParkEncounterSpecies> pokemon_encounters) {
		this.pokemon_encounters = pokemon_encounters;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}