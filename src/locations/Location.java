package locations;
/*
{
    "id": 1,
    "name": "canalave-city",
    "region": {
        "name": "sinnoh",
        "url": "http://pokeapi.co/api/v2/region/4/"
    },
    "names": [{
        "name": "Canalave City",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }],
    "game_indices": [{
        "game_index": 7,
        "generation": {
            "name": "generation-iv",
            "url": "http://pokeapi.co/api/v2/generation/4/"
        }
    }],
    "areas": [{
        "name": "canalave-city-area",
        "url": "http://pokeapi.co/api/v2/location-area/1/"
    }]
}
*/

public class Location extends common.NamedAPIResource {
	// The identifier for this location resource
	private int id;

	// The region this location can be found in
	private locations.Region region;

	// The name of this language listed in different languages
	private java.util.ArrayList<common.Name> names;

	// A list of game indices relevent to this location by generation
	private java.util.ArrayList<common.GenerationGameIndex> game_indices;

	// Areas that can be found within this location
	private java.util.ArrayList<locations.LocationArea> areas;

	public static Location getById(int id) {
		String url = "https://pokeapi.co/api/v2/location/" + id;
		String json = tools.Internet.get(url);
		Location obj = new com.google.gson.Gson().fromJson(json, Location.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public Location setId(int id) {
		this.id = id;
		return this;
	}

	public locations.Region getRegion() {
		return region;
	}

	public Location setRegion(locations.Region region) {
		this.region = region;
		return this;
	}

	public java.util.ArrayList<common.Name> getNames() {
		return names;
	}

	public Location setNames(java.util.ArrayList<common.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<common.GenerationGameIndex> getGameIndices() {
		return game_indices;
	}

	public Location setGameIndices(java.util.ArrayList<common.GenerationGameIndex> game_indices) {
		this.game_indices = game_indices;
		return this;
	}

	public java.util.ArrayList<locations.LocationArea> getAreas() {
		return areas;
	}

	public Location setAreas(java.util.ArrayList<locations.LocationArea> areas) {
		this.areas = areas;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}