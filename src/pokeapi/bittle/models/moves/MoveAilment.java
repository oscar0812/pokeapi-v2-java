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

import java.util.ArrayList;
import pokeapi.bittle.models.resources.NamedAPIResourceList;
import pokeapi.bittle.models.utility.Name;
import pokeapi.bittle.models.utility.NamedAPIResource;
import pokeapi.bittle.utils.Information;

public class MoveAilment extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// A list of moves that cause this ailment.
	private ArrayList<Move> moves;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	public int getId() {
		return id;
	}

	public MoveAilment setId(int id) {
		this.id = id;
		return this;
	}

	public ArrayList<Move> getMoves() {
		return moves;
	}

	public MoveAilment setMoves(ArrayList<Move> moves) {
		this.moves = moves;
		return this;
	}

	public ArrayList<Name> getNames() {
		return names;
	}

	public MoveAilment setNames(ArrayList<Name> names) {
		this.names = names;
		return this;
	}

	private static MoveAilment get(String url) {
		MoveAilment obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), MoveAilment.class);
		obj.setIsFetched(true);
		return obj;
	}

	public MoveAilment get() {
		return MoveAilment.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("move-ailment", limit, offset);
	}

	public static MoveAilment getById(int id) {
		return get("https://pokeapi.co/api/v2/move-ailment/" + id);
	}

	public static MoveAilment getByName(String name) {
		return get("https://pokeapi.co/api/v2/move-ailment/" + name);
	}
}