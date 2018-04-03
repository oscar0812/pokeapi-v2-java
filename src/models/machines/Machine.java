package models.machines;
/*
{
    "id": 1,
    "item": {
        "name": "tm01",
        "url": "http://localhost:8000/api/v2/item/305/"
    },
    "move": {
        "name": "mega-punch",
        "url": "http://localhost:8000/api/v2/move/5/"
    },
    "version_group": {
        "name": "red-blue",
        "url": "http://localhost:8000/api/v2/version/1/"
    }
}
*/

public class Machine extends models.common.APIResource {
	// The identifier for this machine resource
	private int id;

	// The TM or HM item that corresponds to this machine
	private models.items.Item item;

	// The move that is taught by this machine
	private models.moves.Move move;

	// The version group that this machine applies to
	private models.games.VersionGroup version_group;

	private static Machine get(String url) {
		String json = api.Information.fromInternet(url);
		Machine obj = new com.google.gson.Gson().fromJson(json, Machine.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static Machine getById(int id) {
		return get("https://pokeapi.co/api/v2/machine/" + id);
	}

	public int getId() {
		return id;
	}

	public Machine setId(int id) {
		this.id = id;
		return this;
	}

	public models.items.Item getItem() {
		return item;
	}

	public Machine setItem(models.items.Item item) {
		this.item = item;
		return this;
	}

	public models.moves.Move getMove() {
		return move;
	}

	public Machine setMove(models.moves.Move move) {
		this.move = move;
		return this;
	}

	public models.games.VersionGroup getVersionGroup() {
		return version_group;
	}

	public Machine setVersionGroup(models.games.VersionGroup version_group) {
		this.version_group = version_group;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}