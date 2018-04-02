package items;
/*
{
    "id": 1,
    "name": "stat-boosts",
    "items": [{
        "name": "guard-spec",
        "url": "http://pokeapi.co/api/v2/item/55/"
    }],
    "names": [{
        "name": "Stat boosts",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }],
    "pocket": {
        "name": "battle",
        "url": "http://pokeapi.co/api/v2/item-pocket/7/"
    }
}
*/

public class ItemCategory extends common.NamedAPIResource {
	// The identifier for this item category resource
	private int id;

	// A list of items that are a part of this category
	private java.util.ArrayList<items.Item> items;

	// The name of this item category listed in different languages
	private java.util.ArrayList<common.Name> names;

	// The pocket items in this category would be put in
	private items.ItemPocket pocket;

	public static ItemCategory getById(int id) {
		String url = "https://pokeapi.co/api/v2/item-category/" + id;
		String json = tools.Internet.get(url);
		ItemCategory obj = new com.google.gson.Gson().fromJson(json, ItemCategory.class);
		return obj;
	}

	public static ItemCategory getByName(String name) {
		String url = "https://pokeapi.co/api/v2/item-category/" + name;
		String json = tools.Internet.get(url);
		ItemCategory obj = new com.google.gson.Gson().fromJson(json, ItemCategory.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public ItemCategory setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<items.Item> getItems() {
		return items;
	}

	public ItemCategory setItems(java.util.ArrayList<items.Item> items) {
		this.items = items;
		return this;
	}

	public java.util.ArrayList<common.Name> getNames() {
		return names;
	}

	public ItemCategory setNames(java.util.ArrayList<common.Name> names) {
		this.names = names;
		return this;
	}

	public items.ItemPocket getPocket() {
		return pocket;
	}

	public ItemCategory setPocket(items.ItemPocket pocket) {
		this.pocket = pocket;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}