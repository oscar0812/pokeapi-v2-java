package models.items;
/*
{
    "id": 1,
    "name": "badly-poison",
    "effect_entries": [{
        "effect": "Badly poisons the target.",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }],
    "items": [{
        "name": "toxic-orb",
        "url": "http://pokeapi.co/api/v2/item/249/"
    }]
}
*/

public class ItemFlingEffect extends models.common.NamedAPIResource {
	// The identifier for this fling effect resource
	private int id;

	// The result of this fling effect listed in different languages
	private java.util.ArrayList<models.common.Effect> effect_entries;

	// A list of items that have this fling effect
	private java.util.ArrayList<models.items.Item> items;

	private static ItemFlingEffect get(String url) {
		String json = api.Information.fromInternet(url);
		ItemFlingEffect obj = new com.google.gson.Gson().fromJson(json, ItemFlingEffect.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static ItemFlingEffect getById(int id) {
		return get("https://pokeapi.co/api/v2/item-fling-effect/" + id);
	}

	public static ItemFlingEffect getByName(String name) {
		return get("https://pokeapi.co/api/v2/item-fling-effect/" + name);
	}

	public int getId() {
		return id;
	}

	public ItemFlingEffect setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<models.common.Effect> getEffectEntries() {
		return effect_entries;
	}

	public ItemFlingEffect setEffectEntries(java.util.ArrayList<models.common.Effect> effect_entries) {
		this.effect_entries = effect_entries;
		return this;
	}

	public java.util.ArrayList<models.items.Item> getItems() {
		return items;
	}

	public ItemFlingEffect setItems(java.util.ArrayList<models.items.Item> items) {
		this.items = items;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}