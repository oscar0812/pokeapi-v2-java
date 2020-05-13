/* Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail. */

package pokeapi.bittle.models.encounters;
/*
{
  "id": 1,
  "name": "walk",
  "order": 1,
  "names": [
    {
      "name": "Walking in tall grass or a cave",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ]
}
*/

public class EncounterMethod extends pokeapi.bittle.models.utility.NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// A good value for sorting.
	private int order;

	// The name of this resource listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Name> names;

	public int getId() {
		return id;
	}

	public EncounterMethod setId(int id) {
		this.id = id;
		return this;
	}

	public int getOrder() {
		return order;
	}

	public EncounterMethod setOrder(int order) {
		this.order = order;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Name> getNames() {
		return names;
	}

	public EncounterMethod setNames(java.util.ArrayList<pokeapi.bittle.models.utility.Name> names) {
		this.names = names;
		return this;
	}

	private static EncounterMethod get(String url) {
		EncounterMethod obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), EncounterMethod.class);
		obj.setIsFetched(true);
		return obj;
	}

	public EncounterMethod get() {
		return EncounterMethod.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("encounter-method", limit, offset);
	}

	public static EncounterMethod getById(int id) {
		return get("https://pokeapi.co/api/v2/encounter-method/" + id);
	}

	public static EncounterMethod getByName(String name) {
		return get("https://pokeapi.co/api/v2/encounter-method/" + name);
	}
}