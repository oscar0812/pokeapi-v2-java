package models.items;
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

public class ItemPocket extends models.common.NamedAPIResource {
	// The identifier for this item pocket models.resource
	private int id;

	// A list of item categories that are relevant to this item pocket
	private java.util.ArrayList<models.items.ItemCategory> categories;

	// The name of this item pocket listed in different languages
	private java.util.ArrayList<models.common.Name> names;

	private static ItemPocket get(String url) {
		String json = api.Information.fromInternet(url);
		ItemPocket obj = new com.google.gson.Gson().fromJson(json, ItemPocket.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static ItemPocket getById(int id) {
		return get("https://pokeapi.co/api/v2/item-pocket/" + id);
	}

	public static ItemPocket getByName(String name) {
		return get("https://pokeapi.co/api/v2/item-pocket/" + name);
	}

	public int getId() {
		return id;
	}

	public ItemPocket setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<models.items.ItemCategory> getCategories() {
		return categories;
	}

	public ItemPocket setCategories(java.util.ArrayList<models.items.ItemCategory> categories) {
		this.categories = categories;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getNames() {
		return names;
	}

	public ItemPocket setNames(java.util.ArrayList<models.common.Name> names) {
		this.names = names;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}