package moves;
/*
{
    "id": 1,
    "name": "attack",
    "names": [{
        "name": "Attack",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }]
}
*/

public class MoveBattleStyle extends common.NamedAPIResource {
	// The identifier for this move battle style resource
	private int id;

	// The name of this move battle style listed in different languages
	private java.util.ArrayList<common.Name> names;

	public static MoveBattleStyle getById(int id) {
		String url = "https://pokeapi.co/api/v2/move-battle-style/" + id;
		String json = tools.Internet.get(url);
		MoveBattleStyle obj = new com.google.gson.Gson().fromJson(json, MoveBattleStyle.class);
		return obj;
	}

	public static MoveBattleStyle getByName(String name) {
		String url = "https://pokeapi.co/api/v2/move-battle-style/" + name;
		String json = tools.Internet.get(url);
		MoveBattleStyle obj = new com.google.gson.Gson().fromJson(json, MoveBattleStyle.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public MoveBattleStyle setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<common.Name> getNames() {
		return names;
	}

	public MoveBattleStyle setNames(java.util.ArrayList<common.Name> names) {
		this.names = names;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}