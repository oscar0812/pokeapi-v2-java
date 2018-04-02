package machines;
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

public class Machine extends common.APIResource {
	// The identifier for this machine resource
	private int id;

	// The TM or HM item that corresponds to this machine
	private items.Item item;

	// The move that is taught by this machine
	private moves.Move move;

	// The version group that this machine applies to
	private games.VersionGroup version_group;

	public static Machine getById(int id) {
		String url = "https://pokeapi.co/api/v2/machine/" + id;
		String json = tools.Internet.get(url);
		Machine obj = new com.google.gson.Gson().fromJson(json, Machine.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public Machine setId(int id) {
		this.id = id;
		return this;
	}

	public items.Item getItem() {
		return item;
	}

	public Machine setItem(items.Item item) {
		this.item = item;
		return this;
	}

	public moves.Move getMove() {
		return move;
	}

	public Machine setMove(moves.Move move) {
		this.move = move;
		return this;
	}

	public games.VersionGroup getVersionGroup() {
		return version_group;
	}

	public Machine setVersionGroup(games.VersionGroup version_group) {
		this.version_group = version_group;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}