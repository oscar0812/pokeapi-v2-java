/* Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine. */

package pokeapi.bittle.models.machines;
/*
{
  "id": 1,
  "item": {
    "name": "tm01",
    "url": "https://pokeapi.co/api/v2/item/305/"
  },
  "move": {
    "name": "mega-punch",
    "url": "https://pokeapi.co/api/v2/move/5/"
  },
  "version_group": {
    "name": "red-blue",
    "url": "https://pokeapi.co/api/v2/version/1/"
  }
}
*/

import pokeapi.bittle.models.games.VersionGroup;
import pokeapi.bittle.models.items.Item;
import pokeapi.bittle.models.moves.Move;
import pokeapi.bittle.models.resources.APIResourceList;
import pokeapi.bittle.models.utility.APIResource;
import pokeapi.bittle.utils.Information;

public class Machine extends APIResource {
	// The identifier for this resource.
	private int id;

	// The TM or HM item that corresponds to this machine.
	private Item item;

	// The move that is taught by this machine.
	private Move move;

	// The version group that this machine applies to.
	private VersionGroup version_group;

	public int getId() {
		return id;
	}

	public Machine setId(int id) {
		this.id = id;
		return this;
	}

	public Item getItem() {
		if(!item.getIsFetched()) {
			item = item.get();
		}
		return item;
	}

	public Machine setItem(Item item) {
		this.item = item;
		return this;
	}

	public Move getMove() {
		if(!move.getIsFetched()) {
			move = move.get();
		}
		return move;
	}

	public Machine setMove(Move move) {
		this.move = move;
		return this;
	}

	public VersionGroup getVersionGroup() {
		if(!version_group.getIsFetched()) {
			version_group = version_group.get();
		}
		return version_group;
	}

	public Machine setVersionGroup(VersionGroup version_group) {
		this.version_group = version_group;
		return this;
	}

	private static Machine get(String url) {
		Machine obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), Machine.class);
		obj.setIsFetched(true);
		return obj;
	}

	public Machine get() {
		return Machine.get(this.getUrl());
	}

	public static APIResourceList getList(int limit, int offset) {
		 return APIResourceList.getList("machine", limit, offset);
	}

	public static Machine getById(int id) {
		return get("https://pokeapi.co/api/v2/machine/" + id);
	}
}