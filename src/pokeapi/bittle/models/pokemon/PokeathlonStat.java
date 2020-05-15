/* Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See Bulbapedia for greater detail. */

package pokeapi.bittle.models.pokemon;
/*
{
  "id": 1,
  "name": "speed",
  "affecting_natures": {
    "increase": [
      {
        "max_change": 2,
        "nature": {
          "name": "timid",
          "url": "https://pokeapi.co/api/v2/nature/5/"
        }
      }
    ],
    "decrease": [
      {
        "max_change": -1,
        "nature": {
          "name": "hardy",
          "url": "https://pokeapi.co/api/v2/nature/1/"
        }
      }
    ]
  },
  "names": [
    {
      "name": "Speed",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ]
}
*/

import java.util.ArrayList;
import pokeapi.bittle.models.resources.NamedAPIResourceList;
import pokeapi.bittle.models.utility.Name;
import pokeapi.bittle.models.utility.NamedAPIResource;
import pokeapi.bittle.utils.Information;

public class PokeathlonStat extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	// A detail of natures which affect this Pokéathlon stat positively or negatively.
	private NaturePokeathlonStatAffectSets affecting_natures;

	public int getId() {
		return id;
	}

	public PokeathlonStat setId(int id) {
		this.id = id;
		return this;
	}

	public ArrayList<Name> getNames() {
		return names;
	}

	public PokeathlonStat setNames(ArrayList<Name> names) {
		this.names = names;
		return this;
	}

	public NaturePokeathlonStatAffectSets getAffectingNatures() {
		return affecting_natures;
	}

	public PokeathlonStat setAffectingNatures(NaturePokeathlonStatAffectSets affecting_natures) {
		this.affecting_natures = affecting_natures;
		return this;
	}

	private static PokeathlonStat get(String url) {
		PokeathlonStat obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), PokeathlonStat.class);
		obj.setIsFetched(true);
		return obj;
	}

	public PokeathlonStat get() {
		return PokeathlonStat.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("pokeathlon-stat", limit, offset);
	}

	public static PokeathlonStat getById(int id) {
		return get("https://pokeapi.co/api/v2/pokeathlon-stat/" + id);
	}

	public static PokeathlonStat getByName(String name) {
		return get("https://pokeapi.co/api/v2/pokeathlon-stat/" + name);
	}
}