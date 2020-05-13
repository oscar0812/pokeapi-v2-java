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

public class MoveDamageClass extends pokeapi.bittle.models.utility.NamedAPIResource {
	public int getId() {
				return id;
	}

	public MoveDamageClass setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Description> getDescriptions() {
				return descriptions;
	}

	public MoveDamageClass setDescriptions(java.util.ArrayList<pokeapi.bittle.models.utility.Description> descriptions) {
		this.descriptions = descriptions;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.moves.Move> getMoves() {
				return moves;
	}

	public MoveDamageClass setMoves(java.util.ArrayList<pokeapi.bittle.models.moves.Move> moves) {
		this.moves = moves;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Name> getNames() {
				return names;
	}

	public MoveDamageClass setNames(java.util.ArrayList<pokeapi.bittle.models.utility.Name> names) {
		this.names = names;
		return this;
	}

	// The identifier for this resource.
	private int id;

	// The description of this resource listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Description> descriptions;

	// A list of moves that fall into this damage class.
	private java.util.ArrayList<pokeapi.bittle.models.moves.Move> moves;

	// The name of this resource listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Name> names;

	private static MoveDamageClass get(String url) {
		MoveDamageClass obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), MoveDamageClass.class);
		obj.setIsFetched(true);
		return obj;
	}

	public MoveDamageClass get() {
		return MoveDamageClass.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("move-damage-class", limit, offset);
	}

	public static MoveDamageClass getById(int id) {
		return get("https://pokeapi.co/api/v2/move-damage-class/" + id);
	}

	public static MoveDamageClass getByName(String name) {
		return get("https://pokeapi.co/api/v2/move-damage-class/" + name);
	}
}