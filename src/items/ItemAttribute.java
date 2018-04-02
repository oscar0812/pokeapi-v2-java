package items;
/*
{
    "id": 1,
    "name": "countable",
    "descriptions": [{
        "description": "Has a count in the bag",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }],
    "items": [{
        "name": "master-ball",
        "url": "http://pokeapi.co/api/v2/item/1/"
    }],
    "names": [{
        "name": "Countable",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }]
}
*/

public class ItemAttribute extends common.NamedAPIResource {
	// The identifier for this item attribute resource
	private int id;

	// A list of items that have this attribute
	private java.util.ArrayList<items.Item> items;

	// The name of this item attribute listed in different languages
	private java.util.ArrayList<common.Name> names;

	// The description of this item attribute listed in different languages
	private java.util.ArrayList<common.Description> descriptions;

	public static ItemAttribute getById(int id) {
		String url = "https://pokeapi.co/api/v2/item-attribute/" + id;
		String json = tools.Internet.get(url);
		ItemAttribute obj = new com.google.gson.Gson().fromJson(json, ItemAttribute.class);
		return obj;
	}

	public static ItemAttribute getByName(String name) {
		String url = "https://pokeapi.co/api/v2/item-attribute/" + name;
		String json = tools.Internet.get(url);
		ItemAttribute obj = new com.google.gson.Gson().fromJson(json, ItemAttribute.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public ItemAttribute setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<items.Item> getItems() {
		return items;
	}

	public ItemAttribute setItems(java.util.ArrayList<items.Item> items) {
		this.items = items;
		return this;
	}

	public java.util.ArrayList<common.Name> getNames() {
		return names;
	}

	public ItemAttribute setNames(java.util.ArrayList<common.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<common.Description> getDescriptions() {
		return descriptions;
	}

	public ItemAttribute setDescriptions(java.util.ArrayList<common.Description> descriptions) {
		this.descriptions = descriptions;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}