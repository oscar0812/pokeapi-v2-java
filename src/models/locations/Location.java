package models.locations;
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

public class Location extends models.common.NamedAPIResource {
	// The identifier for this location resource
	private int id;

	// The region this location can be found in
	private models.locations.Region region;

	// The name of this language listed in different languages
	private java.util.ArrayList<models.common.Name> names;

	// A list of game indices relevent to this location by generation
	private java.util.ArrayList<models.common.GenerationGameIndex> game_indices;

	// Areas that can be found within this location
	private java.util.ArrayList<models.locations.LocationArea> areas;

	private static Location get(String url) {
		String json = api.Information.fromInternet(url);
		Location obj = new com.google.gson.Gson().fromJson(json, Location.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static Location getById(int id) {
		return get("https://pokeapi.co/api/v2/location/" + id);
	}

	public int getId() {
		return id;
	}

	public Location setId(int id) {
		this.id = id;
		return this;
	}

	public models.locations.Region getRegion() {
		return region;
	}

	public Location setRegion(models.locations.Region region) {
		this.region = region;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getNames() {
		return names;
	}

	public Location setNames(java.util.ArrayList<models.common.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<models.common.GenerationGameIndex> getGameIndices() {
		return game_indices;
	}

	public Location setGameIndices(java.util.ArrayList<models.common.GenerationGameIndex> game_indices) {
		this.game_indices = game_indices;
		return this;
	}

	public java.util.ArrayList<models.locations.LocationArea> getAreas() {
		return areas;
	}

	public Location setAreas(java.util.ArrayList<models.locations.LocationArea> areas) {
		this.areas = areas;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}