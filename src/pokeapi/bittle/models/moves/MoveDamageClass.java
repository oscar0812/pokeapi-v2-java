/* Damage classes moves can have, e.g. physical, special, or non-damaging. */

package pokeapi.bittle.models.moves;
/*
{
  "id": 1,
  "name": "status",
  "descriptions": [
    {
      "description": "ãƒ€ãƒ¡ãƒ¼ã‚¸ãªã„",
      "language": {
        "name": "ja",
        "url": "https://pokeapi.co/api/v2/language/1/"
      }
    }
  ],
  "moves": [
    {
      "name": "swords-dance",
      "url": "https://pokeapi.co/api/v2/move/14/"
    }
  ]
}
*/

import java.util.ArrayList;
import pokeapi.bittle.models.resources.NamedAPIResourceList;
import pokeapi.bittle.models.utility.Description;
import pokeapi.bittle.models.utility.Name;
import pokeapi.bittle.models.utility.NamedAPIResource;
import pokeapi.bittle.utils.Information;

public class MoveDamageClass extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The description of this resource listed in different languages.
	private ArrayList<Description> descriptions;

	// A list of moves that fall into this damage class.
	private ArrayList<Move> moves;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	public int getId() {
		return id;
	}

	public MoveDamageClass setId(int id) {
		this.id = id;
		return this;
	}

	public ArrayList<Description> getDescriptions() {
		return descriptions;
	}

	public MoveDamageClass setDescriptions(ArrayList<Description> descriptions) {
		this.descriptions = descriptions;
		return this;
	}

	public ArrayList<Move> getMoves() {
		return moves;
	}

	public MoveDamageClass setMoves(ArrayList<Move> moves) {
		this.moves = moves;
		return this;
	}

	public ArrayList<Name> getNames() {
		return names;
	}

	public MoveDamageClass setNames(ArrayList<Name> names) {
		this.names = names;
		return this;
	}

	private static MoveDamageClass get(String url) {
		MoveDamageClass obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), MoveDamageClass.class);
		obj.setIsFetched(true);
		return obj;
	}

	public MoveDamageClass get() {
		return MoveDamageClass.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("move-damage-class", limit, offset);
	}

	public static MoveDamageClass getById(int id) {
		return get("https://pokeapi.co/api/v2/move-damage-class/" + id);
	}

	public static MoveDamageClass getByName(String name) {
		return get("https://pokeapi.co/api/v2/move-damage-class/" + name);
	}
}