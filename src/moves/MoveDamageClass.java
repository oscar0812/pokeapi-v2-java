package moves;
/*
{
    "id": 1,
    "name": "status",
    "descriptions": [{
        "description": "ãƒ€ãƒ¡ãƒ¼ã‚¸ãªã„",
        "language": {
            "name": "ja",
            "url": "http://pokeapi.co/api/v2/language/1/"
        }
    }],
    "moves": [{
        "name": "swords-dance",
        "url": "http://pokeapi.co/api/v2/move/14/"
    }]
}
*/

public class MoveDamageClass extends common.NamedAPIResource {
	// The identifier for this move damage class resource
	private int id;

	// The description of this move damage class listed in different languages
	private java.util.ArrayList<common.Description> descriptions;

	// A list of moves that fall into this damage class
	private java.util.ArrayList<moves.Move> moves;

	// The name of this move damage class listed in different languages
	private java.util.ArrayList<common.Name> names;

	public static MoveDamageClass getById(int id) {
		String url = "https://pokeapi.co/api/v2/move-damage-class/" + id;
		String json = tools.Internet.get(url);
		MoveDamageClass obj = new com.google.gson.Gson().fromJson(json, MoveDamageClass.class);
		return obj;
	}

	public static MoveDamageClass getByName(String name) {
		String url = "https://pokeapi.co/api/v2/move-damage-class/" + name;
		String json = tools.Internet.get(url);
		MoveDamageClass obj = new com.google.gson.Gson().fromJson(json, MoveDamageClass.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public MoveDamageClass setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<common.Description> getDescriptions() {
		return descriptions;
	}

	public MoveDamageClass setDescriptions(java.util.ArrayList<common.Description> descriptions) {
		this.descriptions = descriptions;
		return this;
	}

	public java.util.ArrayList<moves.Move> getMoves() {
		return moves;
	}

	public MoveDamageClass setMoves(java.util.ArrayList<moves.Move> moves) {
		this.moves = moves;
		return this;
	}

	public java.util.ArrayList<common.Name> getNames() {
		return names;
	}

	public MoveDamageClass setNames(java.util.ArrayList<common.Name> names) {
		this.names = names;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}