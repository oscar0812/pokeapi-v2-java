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

import java.util.ArrayList;
import pokeapi.bittle.models.contests.ContestType;
import pokeapi.bittle.models.resources.NamedAPIResourceList;
import pokeapi.bittle.models.utility.Name;
import pokeapi.bittle.models.utility.NamedAPIResource;
import pokeapi.bittle.utils.Information;

public class BerryFlavor extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// A list of the berries with this flavor.
	private ArrayList<FlavorBerryMap> berries;

	// The contest type that correlates with this berry flavor.
	private ContestType contest_type;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	public int getId() {
		return id;
	}

	public BerryFlavor setId(int id) {
		this.id = id;
		return this;
	}

	public ArrayList<FlavorBerryMap> getBerries() {
		return berries;
	}

	public BerryFlavor setBerries(ArrayList<FlavorBerryMap> berries) {
		this.berries = berries;
		return this;
	}

	public ContestType getContestType() {
		if(!contest_type.getIsFetched()) {
			contest_type = contest_type.get();
		}
		return contest_type;
	}

	public BerryFlavor setContestType(ContestType contest_type) {
		this.contest_type = contest_type;
		return this;
	}

	public ArrayList<Name> getNames() {
		return names;
	}

	public BerryFlavor setNames(ArrayList<Name> names) {
		this.names = names;
		return this;
	}

	private static BerryFlavor get(String url) {
		BerryFlavor obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), BerryFlavor.class);
		obj.setIsFetched(true);
		return obj;
	}

	public BerryFlavor get() {
		return BerryFlavor.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("berry-flavor", limit, offset);
	}

	public static BerryFlavor getById(int id) {
		return get("https://pokeapi.co/api/v2/berry-flavor/" + id);
	}

	public static BerryFlavor getByName(String name) {
		return get("https://pokeapi.co/api/v2/berry-flavor/" + name);
	}
}