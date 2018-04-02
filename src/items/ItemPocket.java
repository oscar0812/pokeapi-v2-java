package items;
/*
{
    "id": 1,
    "name": "misc",
    "categories": [{
        "name": "collectibles",
        "url": "http://pokeapi.co/api/v2/item-category/9/"
    }],
    "names": [{
        "name": "Items",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }]
}
*/

public class ItemPocket extends common.NamedAPIResource {
	// The identifier for this item pocket resource
	private int id;

	// A list of item categories that are relevant to this item pocket
	private java.util.ArrayList<items.ItemCategory> categories;

	// The name of this item pocket listed in different languages
	private java.util.ArrayList<common.Name> names;

	public static ItemPocket getById(int id) {
		String url = "https://pokeapi.co/api/v2/item-pocket/" + id;
		String json = tools.Internet.get(url);
		ItemPocket obj = new com.google.gson.Gson().fromJson(json, ItemPocket.class);
		return obj;
	}

	public static ItemPocket getByName(String name) {
		String url = "https://pokeapi.co/api/v2/item-pocket/" + name;
		String json = tools.Internet.get(url);
		ItemPocket obj = new com.google.gson.Gson().fromJson(json, ItemPocket.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public ItemPocket setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<items.ItemCategory> getCategories() {
		return categories;
	}

	public ItemPocket setCategories(java.util.ArrayList<items.ItemCategory> categories) {
		this.categories = categories;
		return this;
	}

	public java.util.ArrayList<common.Name> getNames() {
		return names;
	}

	public ItemPocket setNames(java.util.ArrayList<common.Name> names) {
		this.names = names;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}