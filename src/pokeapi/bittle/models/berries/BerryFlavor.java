/* Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their nature. Check out Bulbapedia for greater detail. */

package pokeapi.bittle.models.berries;
/*
{
  "id": 1,
  "name": "spicy",
  "berries": [
    {
      "potency": 10,
      "berry": {
        "name": "rowap",
        "url": "https://pokeapi.co/api/v2/berry/64/"
      }
    }
  ],
  "contest_type": {
    "name": "cool",
    "url": "https://pokeapi.co/api/v2/contest-type/1/"
  },
  "names": [
    {
      "name": "Spicy",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ]
}
*/

public class BerryFlavor extends pokeapi.bittle.models.utility.NamedAPIResource {
	public int getId() {
				return id;
	}

	public BerryFlavor setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.berries.FlavorBerryMap> getBerries() {
				return berries;
	}

	public BerryFlavor setBerries(java.util.ArrayList<pokeapi.bittle.models.berries.FlavorBerryMap> berries) {
		this.berries = berries;
		return this;
	}

	public pokeapi.bittle.models.contests.ContestType getContestType() {
		if(!contest_type.getIsFetched()) {
			contest_type = contest_type.get();
		}

		return contest_type;
	}

	public BerryFlavor setContestType(pokeapi.bittle.models.contests.ContestType contest_type) {
		this.contest_type = contest_type;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Name> getNames() {
				return names;
	}

	public BerryFlavor setNames(java.util.ArrayList<pokeapi.bittle.models.utility.Name> names) {
		this.names = names;
		return this;
	}

	// The identifier for this resource.
	private int id;

	// A list of the berries with this flavor.
	private java.util.ArrayList<pokeapi.bittle.models.berries.FlavorBerryMap> berries;

	// The contest type that correlates with this berry flavor.
	private pokeapi.bittle.models.contests.ContestType contest_type;

	// The name of this resource listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Name> names;

	private static BerryFlavor get(String url) {
		BerryFlavor obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), BerryFlavor.class);
		obj.setIsFetched(true);
		return obj;
	}

	public BerryFlavor get() {
		return BerryFlavor.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("berry-flavor", limit, offset);
	}

	public static BerryFlavor getById(int id) {
		return get("https://pokeapi.co/api/v2/berry-flavor/" + id);
	}

	public static BerryFlavor getByName(String name) {
		return get("https://pokeapi.co/api/v2/berry-flavor/" + name);
	}
}