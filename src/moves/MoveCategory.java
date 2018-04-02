package moves;
/*
{
    "id": 1,
    "name": "ailment",
    "descriptions": [{
        "description": "No damage; inflicts status ailment",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }],
    "moves": [{
        "name": "sing",
        "url": "http://pokeapi.co/api/v2/move/47/"
    }]
}
*/

public class MoveCategory {
	// The identifier for this move category resource
	private int id;

	// The name for this move category resource
	private String name;

	// A list of moves that fall into this category
	private java.util.ArrayList<moves.Move> moves;

	// The description of this move ailment listed in different languages
	private java.util.ArrayList<common.Description> descriptions;

	public static MoveCategory getById(int id) {
		String url = "https://pokeapi.co/api/v2/move-category/" + id;
		String json = tools.Internet.get(url);
		MoveCategory obj = new com.google.gson.Gson().fromJson(json, MoveCategory.class);
		return obj;
	}

	public static MoveCategory getByName(String name) {
		String url = "https://pokeapi.co/api/v2/move-category/" + name;
		String json = tools.Internet.get(url);
		MoveCategory obj = new com.google.gson.Gson().fromJson(json, MoveCategory.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public MoveCategory setId(int id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public MoveCategory setName(String name) {
		this.name = name;
		return this;
	}

	public java.util.ArrayList<moves.Move> getMoves() {
		return moves;
	}

	public MoveCategory setMoves(java.util.ArrayList<moves.Move> moves) {
		this.moves = moves;
		return this;
	}

	public java.util.ArrayList<common.Description> getDescriptions() {
		return descriptions;
	}

	public MoveCategory setDescriptions(java.util.ArrayList<common.Description> descriptions) {
		this.descriptions = descriptions;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}