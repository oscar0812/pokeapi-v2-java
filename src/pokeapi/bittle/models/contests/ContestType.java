/* Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out Bulbapedia for greater detail. */

package pokeapi.bittle.models.contests;
/*
{
  "id": 1,
  "name": "cool",
  "berry_flavor": {
    "name": "spicy",
    "url": "https://pokeapi.co/api/v2/berry-flavor/1/"
  },
  "names": [
    {
      "name": "Cool",
      "color": "Red",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ]
}
*/

public class ContestType extends pokeapi.bittle.models.utility.NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The berry flavor that correlates with this contest type.
	private pokeapi.bittle.models.berries.BerryFlavor berry_flavor;

	// The name of this contest type listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.contests.ContestName> names;

	public int getId() {
		return id;
	}

	public ContestType setId(int id) {
		this.id = id;
		return this;
	}

	public pokeapi.bittle.models.berries.BerryFlavor getBerryFlavor() {
		if(!berry_flavor.getIsFetched()) {
			berry_flavor = berry_flavor.get();
		}
		return berry_flavor;
	}

	public ContestType setBerryFlavor(pokeapi.bittle.models.berries.BerryFlavor berry_flavor) {
		this.berry_flavor = berry_flavor;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.contests.ContestName> getNames() {
		return names;
	}

	public ContestType setNames(java.util.ArrayList<pokeapi.bittle.models.contests.ContestName> names) {
		this.names = names;
		return this;
	}

	private static ContestType get(String url) {
		ContestType obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), ContestType.class);
		obj.setIsFetched(true);
		return obj;
	}

	public ContestType get() {
		return ContestType.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("contest-type", limit, offset);
	}

	public static ContestType getById(int id) {
		return get("https://pokeapi.co/api/v2/contest-type/" + id);
	}

	public static ContestType getByName(String name) {
		return get("https://pokeapi.co/api/v2/contest-type/" + name);
	}
}