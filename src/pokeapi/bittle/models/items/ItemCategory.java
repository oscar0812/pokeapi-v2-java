/* Item categories determine where items will be placed in the players bag. */

package pokeapi.bittle.models.items;
/*
{
  "id": 1,
  "name": "stat-boosts",
  "items": [
    {
      "name": "guard-spec",
      "url": "https://pokeapi.co/api/v2/item/55/"
    }
  ],
  "names": [
    {
      "name": "Stat boosts",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "pocket": {
    "name": "battle",
    "url": "https://pokeapi.co/api/v2/item-pocket/7/"
  }
}
*/

public class ItemCategory extends pokeapi.bittle.models.utility.NamedAPIResource {
	public int getId() {
				return id;
	}

	public ItemCategory setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.items.Item> getItems() {
				return items;
	}

	public ItemCategory setItems(java.util.ArrayList<pokeapi.bittle.models.items.Item> items) {
		this.items = items;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Name> getNames() {
				return names;
	}

	public ItemCategory setNames(java.util.ArrayList<pokeapi.bittle.models.utility.Name> names) {
		this.names = names;
		return this;
	}

	public pokeapi.bittle.models.items.ItemPocket getPocket() {
		if(!pocket.getIsFetched()) {
			pocket = pocket.get();
		}

		return pocket;
	}

	public ItemCategory setPocket(pokeapi.bittle.models.items.ItemPocket pocket) {
		this.pocket = pocket;
		return this;
	}

	// The identifier for this resource.
	private int id;

	// A list of items that are a part of this category.
	private java.util.ArrayList<pokeapi.bittle.models.items.Item> items;

	// The name of this item category listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Name> names;

	// The pocket items in this category would be put in.
	private pokeapi.bittle.models.items.ItemPocket pocket;

	private static ItemCategory get(String url) {
		ItemCategory obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), ItemCategory.class);
		obj.setIsFetched(true);
		return obj;
	}

	public ItemCategory get() {
		return ItemCategory.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("item-category", limit, offset);
	}

	public static ItemCategory getById(int id) {
		return get("https://pokeapi.co/api/v2/item-category/" + id);
	}

	public static ItemCategory getByName(String name) {
		return get("https://pokeapi.co/api/v2/item-category/" + name);
	}
}