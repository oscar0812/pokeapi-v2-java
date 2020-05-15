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

import java.util.ArrayList;
import pokeapi.bittle.models.resources.NamedAPIResourceList;
import pokeapi.bittle.models.utility.Description;
import pokeapi.bittle.models.utility.Name;
import pokeapi.bittle.models.utility.NamedAPIResource;
import pokeapi.bittle.utils.Information;

public class ItemAttribute extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// A list of items that have this attribute.
	private ArrayList<Item> items;

	// The name of this item attribute listed in different languages.
	private ArrayList<Name> names;

	// The description of this item attribute listed in different languages.
	private ArrayList<Description> descriptions;

	public int getId() {
		return id;
	}

	public ItemAttribute setId(int id) {
		this.id = id;
		return this;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public ItemAttribute setItems(ArrayList<Item> items) {
		this.items = items;
		return this;
	}

	public ArrayList<Name> getNames() {
		return names;
	}

	public ItemAttribute setNames(ArrayList<Name> names) {
		this.names = names;
		return this;
	}

	public ArrayList<Description> getDescriptions() {
		return descriptions;
	}

	public ItemAttribute setDescriptions(ArrayList<Description> descriptions) {
		this.descriptions = descriptions;
		return this;
	}

	private static ItemAttribute get(String url) {
		ItemAttribute obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), ItemAttribute.class);
		obj.setIsFetched(true);
		return obj;
	}

	public ItemAttribute get() {
		return ItemAttribute.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("item-attribute", limit, offset);
	}

	public static ItemAttribute getById(int id) {
		return get("https://pokeapi.co/api/v2/item-attribute/" + id);
	}

	public static ItemAttribute getByName(String name) {
		return get("https://pokeapi.co/api/v2/item-attribute/" + name);
	}
}