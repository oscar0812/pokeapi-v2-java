package models.items;
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
    "models.items": [{
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

public class ItemAttribute extends models.common.NamedAPIResource {
	// The identifier for this item attribute models.resource
	private int id;

	// A list of models.items that have this attribute
	private java.util.ArrayList<models.items.Item> items;

	// The name of this item attribute listed in different languages
	private java.util.ArrayList<models.common.Name> names;

	// The description of this item attribute listed in different languages
	private java.util.ArrayList<models.common.Description> descriptions;

	private static ItemAttribute get(String url) {
		String json = api.Information.fromInternet(url);
		ItemAttribute obj = new com.google.gson.Gson().fromJson(json, ItemAttribute.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static ItemAttribute getById(int id) {
		return get("https://pokeapi.co/api/v2/item-attribute/" + id);
	}

	public static ItemAttribute getByName(String name) {
		return get("https://pokeapi.co/api/v2/item-attribute/" + name);
	}

	public int getId() {
		return id;
	}

	public ItemAttribute setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<models.items.Item> getItems() {
		return items;
	}

	public ItemAttribute setItems(java.util.ArrayList<models.items.Item> items) {
		this.items = items;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getNames() {
		return names;
	}

	public ItemAttribute setNames(java.util.ArrayList<models.common.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<models.common.Description> getDescriptions() {
		return descriptions;
	}

	public ItemAttribute setDescriptions(java.util.ArrayList<models.common.Description> descriptions) {
		this.descriptions = descriptions;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}