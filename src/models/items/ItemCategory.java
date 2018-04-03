package models.items;
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

public class ItemCategory extends models.common.NamedAPIResource {
	// The identifier for this item category resource
	private int id;

	// A list of items that are a part of this category
	private java.util.ArrayList<models.items.Item> items;

	// The name of this item category listed in different languages
	private java.util.ArrayList<models.common.Name> names;

	// The pocket items in this category would be put in
	private models.items.ItemPocket pocket;

	private static ItemCategory get(String url) {
		String json = api.Information.fromInternet(url);
		ItemCategory obj = new com.google.gson.Gson().fromJson(json, ItemCategory.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static ItemCategory getById(int id) {
		return get("https://pokeapi.co/api/v2/item-category/" + id);
	}

	public static ItemCategory getByName(String name) {
		return get("https://pokeapi.co/api/v2/item-category/" + name);
	}

	public int getId() {
		return id;
	}

	public ItemCategory setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<models.items.Item> getItems() {
		return items;
	}

	public ItemCategory setItems(java.util.ArrayList<models.items.Item> items) {
		this.items = items;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getNames() {
		return names;
	}

	public ItemCategory setNames(java.util.ArrayList<models.common.Name> names) {
		this.names = names;
		return this;
	}

	public models.items.ItemPocket getPocket() {
		return pocket;
	}

	public ItemCategory setPocket(models.items.ItemPocket pocket) {
		this.pocket = pocket;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}