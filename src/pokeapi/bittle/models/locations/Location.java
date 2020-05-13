/* Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes. */

package pokeapi.bittle.models.locations;
/*
{
  "id": 1,
  "name": "canalave-city",
  "region": {
    "name": "sinnoh",
    "url": "https://pokeapi.co/api/v2/region/4/"
  },
  "names": [
    {
      "name": "Canalave City",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "game_indices": [
    {
      "game_index": 7,
      "generation": {
        "name": "generation-iv",
        "url": "https://pokeapi.co/api/v2/generation/4/"
      }
    }
  ],
  "areas": [
    {
      "name": "canalave-city-area",
      "url": "https://pokeapi.co/api/v2/location-area/1/"
    }
  ]
}
*/

public class Location extends pokeapi.bittle.models.utility.NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The region this location can be found in.
	private pokeapi.bittle.models.locations.Region region;

	// The name of this resource listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Name> names;

	// A list of game indices relevent to this location by generation.
	private java.util.ArrayList<pokeapi.bittle.models.utility.GenerationGameIndex> game_indices;

	// Areas that can be found within this location.
	private java.util.ArrayList<pokeapi.bittle.models.locations.LocationArea> areas;

	public int getId() {
		return id;
	}

	public Location setId(int id) {
		this.id = id;
		return this;
	}

	public pokeapi.bittle.models.locations.Region getRegion() {
		if(!region.getIsFetched()) {
			region = region.get();
		}
		return region;
	}

	public Location setRegion(pokeapi.bittle.models.locations.Region region) {
		this.region = region;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Name> getNames() {
		return names;
	}

	public Location setNames(java.util.ArrayList<pokeapi.bittle.models.utility.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.GenerationGameIndex> getGameIndices() {
		return game_indices;
	}

	public Location setGameIndices(java.util.ArrayList<pokeapi.bittle.models.utility.GenerationGameIndex> game_indices) {
		this.game_indices = game_indices;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.locations.LocationArea> getAreas() {
		return areas;
	}

	public Location setAreas(java.util.ArrayList<pokeapi.bittle.models.locations.LocationArea> areas) {
		this.areas = areas;
		return this;
	}

	private static Location get(String url) {
		Location obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), Location.class);
		obj.setIsFetched(true);
		return obj;
	}

	public Location get() {
		return Location.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("location", limit, offset);
	}

	public static Location getById(int id) {
		return get("https://pokeapi.co/api/v2/location/" + id);
	}

	public static Location getByName(String name) {
		return get("https://pokeapi.co/api/v2/location/" + name);
	}
}