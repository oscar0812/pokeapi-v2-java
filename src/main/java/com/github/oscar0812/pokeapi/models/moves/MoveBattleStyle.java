/* Styles of moves when used in the Battle Palace. See Bulbapedia for greater detail. */

package com.github.oscar0812.pokeapi.models.moves;
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

import java.util.ArrayList;

import com.github.oscar0812.pokeapi.utils.Information;
import com.github.oscar0812.pokeapi.models.resources.NamedAPIResourceList;
import com.github.oscar0812.pokeapi.models.utility.Name;
import com.github.oscar0812.pokeapi.models.utility.NamedAPIResource;

public class MoveBattleStyle extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	public int getId() {
		return id;
	}

	public MoveBattleStyle setId(int id) {
		this.id = id;
		return this;
	}

	public ArrayList<Name> getNames() {
		return names;
	}

	public MoveBattleStyle setNames(ArrayList<Name> names) {
		this.names = names;
		return this;
	}

	private static MoveBattleStyle get(String url) {
		MoveBattleStyle obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), MoveBattleStyle.class);
		obj.setIsFetched(true);
		return obj;
	}

	public MoveBattleStyle get() {
		return MoveBattleStyle.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("move-battle-style", limit, offset);
	}

	public static MoveBattleStyle getById(int id) {
		return get("https://pokeapi.co/api/v2/move-battle-style/" + id);
	}

	public static MoveBattleStyle getByName(String name) {
		return get("https://pokeapi.co/api/v2/move-battle-style/" + name);
	}
}