/* Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves. */

package pokeapi.bittle.models.moves;
/*
{
  "id": 1,
  "name": "specific-move",
  "descriptions": [
    {
      "description": "Eine spezifische Fähigkeit. Wie diese Fähigkeit genutzt wird, hängt von den genutzten Fähigkeiten ab.",
      "language": {
        "name": "de",
        "url": "https://pokeapi.co/api/v2/language/6/"
      }
    }
  ],
  "moves": [
    {
      "name": "counter",
      "url": "https://pokeapi.co/api/v2/move/68/"
    }
  ],
  "names": [
    {
      "name": "Spezifische Fähigkeit",
      "language": {
        "name": "de",
        "url": "https://pokeapi.co/api/v2/language/6/"
      }
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

public class MoveTarget extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The description of this resource listed in different languages.
	private ArrayList<Description> descriptions;

	// A list of moves that that are directed at this target.
	private ArrayList<Move> moves;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	public int getId() {
		return id;
	}

	public MoveTarget setId(int id) {
		this.id = id;
		return this;
	}

	public ArrayList<Description> getDescriptions() {
		return descriptions;
	}

	public MoveTarget setDescriptions(ArrayList<Description> descriptions) {
		this.descriptions = descriptions;
		return this;
	}

	public ArrayList<Move> getMoves() {
		return moves;
	}

	public MoveTarget setMoves(ArrayList<Move> moves) {
		this.moves = moves;
		return this;
	}

	public ArrayList<Name> getNames() {
		return names;
	}

	public MoveTarget setNames(ArrayList<Name> names) {
		this.names = names;
		return this;
	}

	private static MoveTarget get(String url) {
		MoveTarget obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), MoveTarget.class);
		obj.setIsFetched(true);
		return obj;
	}

	public MoveTarget get() {
		return MoveTarget.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("move-target", limit, offset);
	}

	public static MoveTarget getById(int id) {
		return get("https://pokeapi.co/api/v2/move-target/" + id);
	}

	public static MoveTarget getByName(String name) {
		return get("https://pokeapi.co/api/v2/move-target/" + name);
	}
}