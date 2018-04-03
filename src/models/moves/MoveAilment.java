package models.moves;
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

public class MoveAilment extends models.common.NamedAPIResource {
	// The identifier for this move ailment resource
	private int id;

	// A list of moves that cause this ailment
	private java.util.ArrayList<models.moves.Move> moves;

	// The name of this move ailment listed in different languages
	private java.util.ArrayList<models.common.Name> names;

	private static MoveAilment get(String url) {
		String json = api.Information.fromInternet(url);
		MoveAilment obj = new com.google.gson.Gson().fromJson(json, MoveAilment.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static MoveAilment getById(int id) {
		return get("https://pokeapi.co/api/v2/move-ailment/" + id);
	}

	public static MoveAilment getByName(String name) {
		return get("https://pokeapi.co/api/v2/move-ailment/" + name);
	}

	public int getId() {
		return id;
	}

	public MoveAilment setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<models.moves.Move> getMoves() {
		return moves;
	}

	public MoveAilment setMoves(java.util.ArrayList<models.moves.Move> moves) {
		this.moves = moves;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getNames() {
		return names;
	}

	public MoveAilment setNames(java.util.ArrayList<models.common.Name> names) {
		this.names = names;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}