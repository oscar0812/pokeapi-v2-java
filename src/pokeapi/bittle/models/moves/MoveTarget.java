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

public class MoveTarget extends pokeapi.bittle.models.utility.NamedAPIResource {
	public int getId() {
				return id;
	}

	public MoveTarget setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Description> getDescriptions() {
				return descriptions;
	}

	public MoveTarget setDescriptions(java.util.ArrayList<pokeapi.bittle.models.utility.Description> descriptions) {
		this.descriptions = descriptions;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.moves.Move> getMoves() {
				return moves;
	}

	public MoveTarget setMoves(java.util.ArrayList<pokeapi.bittle.models.moves.Move> moves) {
		this.moves = moves;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Name> getNames() {
				return names;
	}

	public MoveTarget setNames(java.util.ArrayList<pokeapi.bittle.models.utility.Name> names) {
		this.names = names;
		return this;
	}

	// The identifier for this resource.
	private int id;

	// The description of this resource listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Description> descriptions;

	// A list of moves that that are directed at this target.
	private java.util.ArrayList<pokeapi.bittle.models.moves.Move> moves;

	// The name of this resource listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Name> names;

	private static MoveTarget get(String url) {
		MoveTarget obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), MoveTarget.class);
		obj.setIsFetched(true);
		return obj;
	}

	public MoveTarget get() {
		return MoveTarget.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("move-target", limit, offset);
	}

	public static MoveTarget getById(int id) {
		return get("https://pokeapi.co/api/v2/move-target/" + id);
	}

	public static MoveTarget getByName(String name) {
		return get("https://pokeapi.co/api/v2/move-target/" + name);
	}
}