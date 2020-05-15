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

import java.util.ArrayList;
import pokeapi.bittle.models.resources.NamedAPIResourceList;
import pokeapi.bittle.models.utility.Name;
import pokeapi.bittle.models.utility.NamedAPIResource;
import pokeapi.bittle.utils.Information;

public class ItemPocket extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// A list of item categories that are relevant to this item pocket.
	private ArrayList<ItemCategory> categories;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	public int getId() {
		return id;
	}

	public ItemPocket setId(int id) {
		this.id = id;
		return this;
	}

	public ArrayList<ItemCategory> getCategories() {
		return categories;
	}

	public ItemPocket setCategories(ArrayList<ItemCategory> categories) {
		this.categories = categories;
		return this;
	}

	public ArrayList<Name> getNames() {
		return names;
	}

	public ItemPocket setNames(ArrayList<Name> names) {
		this.names = names;
		return this;
	}

	private static ItemPocket get(String url) {
		ItemPocket obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), ItemPocket.class);
		obj.setIsFetched(true);
		return obj;
	}

	public ItemPocket get() {
		return ItemPocket.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("item-pocket", limit, offset);
	}

	public static ItemPocket getById(int id) {
		return get("https://pokeapi.co/api/v2/item-pocket/" + id);
	}

	public static ItemPocket getByName(String name) {
		return get("https://pokeapi.co/api/v2/item-pocket/" + name);
	}
}