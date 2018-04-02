package moves;
/*
{
    "id": 1,
    "name": "paralysis",
    "moves": [{
        "name": "thunder-punch",
        "url": "http://pokeapi.co/api/v2/move/9/"
    }],
    "names": [{
        "name": "Paralysis",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }]
}
*/

public class MoveAilment extends common.NamedAPIResource {
	// The identifier for this move ailment resource
	private int id;

	// A list of moves that cause this ailment
	private java.util.ArrayList<moves.Move> moves;

	// The name of this move ailment listed in different languages
	private java.util.ArrayList<common.Name> names;

	public static MoveAilment getById(int id) {
		String url = "https://pokeapi.co/api/v2/move-ailment/" + id;
		String json = tools.Internet.get(url);
		MoveAilment obj = new com.google.gson.Gson().fromJson(json, MoveAilment.class);
		return obj;
	}

	public static MoveAilment getByName(String name) {
		String url = "https://pokeapi.co/api/v2/move-ailment/" + name;
		String json = tools.Internet.get(url);
		MoveAilment obj = new com.google.gson.Gson().fromJson(json, MoveAilment.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public MoveAilment setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<moves.Move> getMoves() {
		return moves;
	}

	public MoveAilment setMoves(java.util.ArrayList<moves.Move> moves) {
		this.moves = moves;
		return this;
	}

	public java.util.ArrayList<common.Name> getNames() {
		return names;
	}

	public MoveAilment setNames(java.util.ArrayList<common.Name> names) {
		this.names = names;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}