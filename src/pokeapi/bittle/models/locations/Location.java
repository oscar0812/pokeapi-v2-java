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

import java.util.ArrayList;
import pokeapi.bittle.models.resources.NamedAPIResourceList;
import pokeapi.bittle.models.utility.GenerationGameIndex;
import pokeapi.bittle.models.utility.Name;
import pokeapi.bittle.models.utility.NamedAPIResource;
import pokeapi.bittle.utils.Information;

public class Location extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The region this location can be found in.
	private Region region;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	// A list of game indices relevent to this location by generation.
	private ArrayList<GenerationGameIndex> game_indices;

	// Areas that can be found within this location.
	private ArrayList<LocationArea> areas;

	public int getId() {
		return id;
	}

	public Location setId(int id) {
		this.id = id;
		return this;
	}

	public Region getRegion() {
		if(!region.getIsFetched()) {
			region = region.get();
		}
		return region;
	}

	public Location setRegion(Region region) {
		this.region = region;
		return this;
	}

	public ArrayList<Name> getNames() {
		return names;
	}

	public Location setNames(ArrayList<Name> names) {
		this.names = names;
		return this;
	}

	public ArrayList<GenerationGameIndex> getGameIndices() {
		return game_indices;
	}

	public Location setGameIndices(ArrayList<GenerationGameIndex> game_indices) {
		this.game_indices = game_indices;
		return this;
	}

	public ArrayList<LocationArea> getAreas() {
		return areas;
	}

	public Location setAreas(ArrayList<LocationArea> areas) {
		this.areas = areas;
		return this;
	}

	private static Location get(String url) {
		Location obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), Location.class);
		obj.setIsFetched(true);
		return obj;
	}

	public Location get() {
		return Location.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("location", limit, offset);
	}

	public static Location getById(int id) {
		return get("https://pokeapi.co/api/v2/location/" + id);
	}

	public static Location getByName(String name) {
		return get("https://pokeapi.co/api/v2/location/" + name);
	}
}