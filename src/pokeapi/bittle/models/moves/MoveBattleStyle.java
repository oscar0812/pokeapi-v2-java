/* Styles of moves when used in the Battle Palace. See Bulbapedia for greater detail. */

package pokeapi.bittle.models.moves;
/*
{
  "id": 1,
  "name": "attack",
  "names": [
    {
      "name": "Attack",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ]
}
*/

public class MoveBattleStyle extends pokeapi.bittle.models.utility.NamedAPIResource {
	public int getId() {
				return id;
	}

	public MoveBattleStyle setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Name> getNames() {
				return names;
	}

	public MoveBattleStyle setNames(java.util.ArrayList<pokeapi.bittle.models.utility.Name> names) {
		this.names = names;
		return this;
	}

	// The identifier for this resource.
	private int id;

	// The name of this resource listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Name> names;

	private static MoveBattleStyle get(String url) {
		MoveBattleStyle obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), MoveBattleStyle.class);
		obj.setIsFetched(true);
		return obj;
	}

	public MoveBattleStyle get() {
		return MoveBattleStyle.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("move-battle-style", limit, offset);
	}

	public static MoveBattleStyle getById(int id) {
		return get("https://pokeapi.co/api/v2/move-battle-style/" + id);
	}

	public static MoveBattleStyle getByName(String name) {
		return get("https://pokeapi.co/api/v2/move-battle-style/" + name);
	}
}