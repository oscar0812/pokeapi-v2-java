/* Move Ailments are status conditions caused by moves used during battle. See Bulbapedia for greater detail. */

package pokeapi.bittle.models.moves;
/*
{
  "id": 1,
  "name": "paralysis",
  "moves": [
    {
      "name": "thunder-punch",
      "url": "https://pokeapi.co/api/v2/move/9/"
    }
  ],
  "names": [
    {
      "name": "Paralysis",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ]
}
*/

public class MoveAilment extends pokeapi.bittle.models.utility.NamedAPIResource {
	public int getId() {
				return id;
	}

	public MoveAilment setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.moves.Move> getMoves() {
				return moves;
	}

	public MoveAilment setMoves(java.util.ArrayList<pokeapi.bittle.models.moves.Move> moves) {
		this.moves = moves;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Name> getNames() {
				return names;
	}

	public MoveAilment setNames(java.util.ArrayList<pokeapi.bittle.models.utility.Name> names) {
		this.names = names;
		return this;
	}

	// The identifier for this resource.
	private int id;

	// A list of moves that cause this ailment.
	private java.util.ArrayList<pokeapi.bittle.models.moves.Move> moves;

	// The name of this resource listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Name> names;

	private static MoveAilment get(String url) {
		MoveAilment obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), MoveAilment.class);
		obj.setIsFetched(true);
		return obj;
	}

	public MoveAilment get() {
		return MoveAilment.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("move-ailment", limit, offset);
	}

	public static MoveAilment getById(int id) {
		return get("https://pokeapi.co/api/v2/move-ailment/" + id);
	}

	public static MoveAilment getByName(String name) {
		return get("https://pokeapi.co/api/v2/move-ailment/" + name);
	}
}