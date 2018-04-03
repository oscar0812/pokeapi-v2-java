package models.moves;
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

public class MoveBattleStyle extends models.common.NamedAPIResource {
	// The identifier for this move battle style resource
	private int id;

	// The name of this move battle style listed in different languages
	private java.util.ArrayList<models.common.Name> names;

	private static MoveBattleStyle get(String url) {
		String json = api.Information.fromInternet(url);
		MoveBattleStyle obj = new com.google.gson.Gson().fromJson(json, MoveBattleStyle.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static MoveBattleStyle getById(int id) {
		return get("https://pokeapi.co/api/v2/move-battle-style/" + id);
	}

	public static MoveBattleStyle getByName(String name) {
		return get("https://pokeapi.co/api/v2/move-battle-style/" + name);
	}

	public int getId() {
		return id;
	}

	public MoveBattleStyle setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getNames() {
		return names;
	}

	public MoveBattleStyle setNames(java.util.ArrayList<models.common.Name> names) {
		this.names = names;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}