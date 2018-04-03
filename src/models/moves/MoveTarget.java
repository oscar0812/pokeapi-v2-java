package models.moves;
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
    "models.moves": [{
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

public class MoveTarget extends models.common.NamedAPIResource {
	// The identifier for this move target models.resource
	private int id;

	// The description of this move target listed in different languages
	private java.util.ArrayList<models.common.Description> descriptions;

	// A list of models.moves that that are directed at this target
	private java.util.ArrayList<models.moves.Move> moves;

	// The name of this move target listed in different languages
	private java.util.ArrayList<models.common.Name> names;

	private static MoveTarget get(String url) {
		String json = api.Information.fromInternet(url);
		MoveTarget obj = new com.google.gson.Gson().fromJson(json, MoveTarget.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static MoveTarget getById(int id) {
		return get("https://pokeapi.co/api/v2/move-target/" + id);
	}

	public static MoveTarget getByName(String name) {
		return get("https://pokeapi.co/api/v2/move-target/" + name);
	}

	public int getId() {
		return id;
	}

	public MoveTarget setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<models.common.Description> getDescriptions() {
		return descriptions;
	}

	public MoveTarget setDescriptions(java.util.ArrayList<models.common.Description> descriptions) {
		this.descriptions = descriptions;
		return this;
	}

	public java.util.ArrayList<models.moves.Move> getMoves() {
		return moves;
	}

	public MoveTarget setMoves(java.util.ArrayList<models.moves.Move> moves) {
		this.moves = moves;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getNames() {
		return names;
	}

	public MoveTarget setNames(java.util.ArrayList<models.common.Name> names) {
		this.names = names;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}