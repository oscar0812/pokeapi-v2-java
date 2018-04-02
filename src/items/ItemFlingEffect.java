package items;
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

public class ItemFlingEffect extends common.NamedAPIResource {
	// The identifier for this fling effect resource
	private int id;

	// The result of this fling effect listed in different languages
	private java.util.ArrayList<common.Effect> effect_entries;

	// A list of items that have this fling effect
	private java.util.ArrayList<items.Item> items;

	public static ItemFlingEffect getById(int id) {
		String url = "https://pokeapi.co/api/v2/item-fling-effect/" + id;
		String json = tools.Internet.get(url);
		ItemFlingEffect obj = new com.google.gson.Gson().fromJson(json, ItemFlingEffect.class);
		return obj;
	}

	public static ItemFlingEffect getByName(String name) {
		String url = "https://pokeapi.co/api/v2/item-fling-effect/" + name;
		String json = tools.Internet.get(url);
		ItemFlingEffect obj = new com.google.gson.Gson().fromJson(json, ItemFlingEffect.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public ItemFlingEffect setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<common.Effect> getEffectEntries() {
		return effect_entries;
	}

	public ItemFlingEffect setEffectEntries(java.util.ArrayList<common.Effect> effect_entries) {
		this.effect_entries = effect_entries;
		return this;
	}

	public java.util.ArrayList<items.Item> getItems() {
		return items;
	}

	public ItemFlingEffect setItems(java.util.ArrayList<items.Item> items) {
		this.items = items;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}