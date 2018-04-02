package moves;
/*
{
    "id": 1,
    "name": "specific-move",
    "descriptions": [{
        "description": "Eine spezifische Fähigkeit. Wie diese Fähigkeit genutzt wird, hängt von den genutzten Fähigkeiten ab.",
        "language": {
            "name": "de",
            "url": "http://pokeapi.co/api/v2/language/6/"
        }
    }],
    "moves": [{
        "name": "counter",
        "url": "http://pokeapi.co/api/v2/move/68/"
    }],
    "names": [{
        "name": "Spezifische Fähigkeit",
        "language": {
            "name": "de",
            "url": "http://pokeapi.co/api/v2/language/6/"
        }
    }]
}
*/

public class MoveTarget extends common.NamedAPIResource {
	// The identifier for this move target resource
	private int id;

	// The description of this move target listed in different languages
	private java.util.ArrayList<common.Description> descriptions;

	// A list of moves that that are directed at this target
	private java.util.ArrayList<moves.Move> moves;

	// The name of this move target listed in different languages
	private java.util.ArrayList<common.Name> names;

	public static MoveTarget getById(int id) {
		String url = "https://pokeapi.co/api/v2/move-target/" + id;
		String json = tools.Internet.get(url);
		MoveTarget obj = new com.google.gson.Gson().fromJson(json, MoveTarget.class);
		return obj;
	}

	public static MoveTarget getByName(String name) {
		String url = "https://pokeapi.co/api/v2/move-target/" + name;
		String json = tools.Internet.get(url);
		MoveTarget obj = new com.google.gson.Gson().fromJson(json, MoveTarget.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public MoveTarget setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<common.Description> getDescriptions() {
		return descriptions;
	}

	public MoveTarget setDescriptions(java.util.ArrayList<common.Description> descriptions) {
		this.descriptions = descriptions;
		return this;
	}

	public java.util.ArrayList<moves.Move> getMoves() {
		return moves;
	}

	public MoveTarget setMoves(java.util.ArrayList<moves.Move> moves) {
		this.moves = moves;
		return this;
	}

	public java.util.ArrayList<common.Name> getNames() {
		return names;
	}

	public MoveTarget setNames(java.util.ArrayList<common.Name> names) {
		this.names = names;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}