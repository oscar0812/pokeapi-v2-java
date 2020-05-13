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

public class PokeathlonStat extends pokeapi.bittle.models.utility.NamedAPIResource {
	public int getId() {
				return id;
	}

	public PokeathlonStat setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Name> getNames() {
				return names;
	}

	public PokeathlonStat setNames(java.util.ArrayList<pokeapi.bittle.models.utility.Name> names) {
		this.names = names;
		return this;
	}

	public pokeapi.bittle.models.pokemon.NaturePokeathlonStatAffectSets getAffectingNatures() {
				return affecting_natures;
	}

	public PokeathlonStat setAffectingNatures(pokeapi.bittle.models.pokemon.NaturePokeathlonStatAffectSets affecting_natures) {
		this.affecting_natures = affecting_natures;
		return this;
	}

	// The identifier for this resource.
	private int id;

	// The name of this resource listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Name> names;

	// A detail of natures which affect this Pokéathlon stat positively or negatively.
	private pokeapi.bittle.models.pokemon.NaturePokeathlonStatAffectSets affecting_natures;

	private static PokeathlonStat get(String url) {
		PokeathlonStat obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), PokeathlonStat.class);
		obj.setIsFetched(true);
		return obj;
	}

	public PokeathlonStat get() {
		return PokeathlonStat.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("pokeathlon-stat", limit, offset);
	}

	public static PokeathlonStat getById(int id) {
		return get("https://pokeapi.co/api/v2/pokeathlon-stat/" + id);
	}

	public static PokeathlonStat getByName(String name) {
		return get("https://pokeapi.co/api/v2/pokeathlon-stat/" + name);
	}
}