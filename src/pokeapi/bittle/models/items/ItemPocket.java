/* Pockets within the players bag used for storing items by category. */

package pokeapi.bittle.models.items;
/*
{
  "id": 1,
  "name": "misc",
  "categories": [
    {
      "name": "collectibles",
      "url": "https://pokeapi.co/api/v2/item-category/9/"
    }
  ],
  "names": [
    {
      "name": "Items",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ]
}
*/

public class ItemPocket extends pokeapi.bittle.models.utility.NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// A list of item categories that are relevant to this item pocket.
	private java.util.ArrayList<pokeapi.bittle.models.items.ItemCategory> categories;

	// The name of this resource listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Name> names;

	public int getId() {
		return id;
	}

	public ItemPocket setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.items.ItemCategory> getCategories() {
		return categories;
	}

	public ItemPocket setCategories(java.util.ArrayList<pokeapi.bittle.models.items.ItemCategory> categories) {
		this.categories = categories;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Name> getNames() {
		return names;
	}

	public ItemPocket setNames(java.util.ArrayList<pokeapi.bittle.models.utility.Name> names) {
		this.names = names;
		return this;
	}

	private static ItemPocket get(String url) {
		ItemPocket obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), ItemPocket.class);
		obj.setIsFetched(true);
		return obj;
	}

	public ItemPocket get() {
		return ItemPocket.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("item-pocket", limit, offset);
	}

	public static ItemPocket getById(int id) {
		return get("https://pokeapi.co/api/v2/item-pocket/" + id);
	}

	public static ItemPocket getByName(String name) {
		return get("https://pokeapi.co/api/v2/item-pocket/" + name);
	}
}