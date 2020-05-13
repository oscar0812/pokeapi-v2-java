/* Item attributes define particular aspects of items, e.g. "usable in battle" or "consumable". */

package pokeapi.bittle.models.items;
/*
{
  "id": 1,
  "name": "countable",
  "descriptions": [
    {
      "description": "Has a count in the bag",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "items": [
    {
      "name": "master-ball",
      "url": "https://pokeapi.co/api/v2/item/1/"
    }
  ],
  "names": [
    {
      "name": "Countable",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ]
}
*/

public class ItemAttribute extends pokeapi.bittle.models.utility.NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// A list of items that have this attribute.
	private java.util.ArrayList<pokeapi.bittle.models.items.Item> items;

	// The name of this item attribute listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Name> names;

	// The description of this item attribute listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Description> descriptions;

	public int getId() {
		return id;
	}

	public ItemAttribute setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.items.Item> getItems() {
		return items;
	}

	public ItemAttribute setItems(java.util.ArrayList<pokeapi.bittle.models.items.Item> items) {
		this.items = items;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Name> getNames() {
		return names;
	}

	public ItemAttribute setNames(java.util.ArrayList<pokeapi.bittle.models.utility.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Description> getDescriptions() {
		return descriptions;
	}

	public ItemAttribute setDescriptions(java.util.ArrayList<pokeapi.bittle.models.utility.Description> descriptions) {
		this.descriptions = descriptions;
		return this;
	}

	private static ItemAttribute get(String url) {
		ItemAttribute obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), ItemAttribute.class);
		obj.setIsFetched(true);
		return obj;
	}

	public ItemAttribute get() {
		return ItemAttribute.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("item-attribute", limit, offset);
	}

	public static ItemAttribute getById(int id) {
		return get("https://pokeapi.co/api/v2/item-attribute/" + id);
	}

	public static ItemAttribute getByName(String name) {
		return get("https://pokeapi.co/api/v2/item-attribute/" + name);
	}
}