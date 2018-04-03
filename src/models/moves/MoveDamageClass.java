package models.moves;
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

public class MoveDamageClass extends models.common.NamedAPIResource {
	// The identifier for this move damage class resource
	private int id;

	// The description of this move damage class listed in different languages
	private java.util.ArrayList<models.common.Description> descriptions;

	// A list of moves that fall into this damage class
	private java.util.ArrayList<models.moves.Move> moves;

	// The name of this move damage class listed in different languages
	private java.util.ArrayList<models.common.Name> names;

	private static MoveDamageClass get(String url) {
		String json = api.Information.fromInternet(url);
		MoveDamageClass obj = new com.google.gson.Gson().fromJson(json, MoveDamageClass.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static MoveDamageClass getById(int id) {
		return get("https://pokeapi.co/api/v2/move-damage-class/" + id);
	}

	public static MoveDamageClass getByName(String name) {
		return get("https://pokeapi.co/api/v2/move-damage-class/" + name);
	}

	public int getId() {
		return id;
	}

	public MoveDamageClass setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<models.common.Description> getDescriptions() {
		return descriptions;
	}

	public MoveDamageClass setDescriptions(java.util.ArrayList<models.common.Description> descriptions) {
		this.descriptions = descriptions;
		return this;
	}

	public java.util.ArrayList<models.moves.Move> getMoves() {
		return moves;
	}

	public MoveDamageClass setMoves(java.util.ArrayList<models.moves.Move> moves) {
		this.moves = moves;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getNames() {
		return names;
	}

	public MoveDamageClass setNames(java.util.ArrayList<models.common.Name> names) {
		this.names = names;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}