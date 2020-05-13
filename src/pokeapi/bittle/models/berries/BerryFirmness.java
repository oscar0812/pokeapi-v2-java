/* Berries can be soft or hard. Check out Bulbapedia for greater detail. */

package pokeapi.bittle.models.berries;
/*
{
  "id": 1,
  "name": "very-soft",
  "berries": [
    {
      "name": "pecha",
      "url": "https://pokeapi.co/api/v2/berry/3/"
    }
  ],
  "names": [
    {
      "name": "Very Soft",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ]
}
*/

public class BerryFirmness extends pokeapi.bittle.models.utility.NamedAPIResource {
	public int getId() {
				return id;
	}

	public BerryFirmness setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.berries.Berry> getBerries() {
				return berries;
	}

	public BerryFirmness setBerries(java.util.ArrayList<pokeapi.bittle.models.berries.Berry> berries) {
		this.berries = berries;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Name> getNames() {
				return names;
	}

	public BerryFirmness setNames(java.util.ArrayList<pokeapi.bittle.models.utility.Name> names) {
		this.names = names;
		return this;
	}

	// The identifier for this resource.
	private int id;

	// A list of the berries with this firmness.
	private java.util.ArrayList<pokeapi.bittle.models.berries.Berry> berries;

	// The name of this resource listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Name> names;

	private static BerryFirmness get(String url) {
		BerryFirmness obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), BerryFirmness.class);
		obj.setIsFetched(true);
		return obj;
	}

	public BerryFirmness get() {
		return BerryFirmness.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("berry-firmness", limit, offset);
	}

	public static BerryFirmness getById(int id) {
		return get("https://pokeapi.co/api/v2/berry-firmness/" + id);
	}

	public static BerryFirmness getByName(String name) {
		return get("https://pokeapi.co/api/v2/berry-firmness/" + name);
	}
}