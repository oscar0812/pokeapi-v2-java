/* The various effects of the move "Fling" when used with different items. */

package pokeapi.bittle.models.items;
/*
{
  "id": 1,
  "name": "badly-poison",
  "effect_entries": [
    {
      "effect": "Badly poisons the target.",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "items": [
    {
      "name": "toxic-orb",
      "url": "https://pokeapi.co/api/v2/item/249/"
    }
  ]
}
*/

public class ItemFlingEffect extends pokeapi.bittle.models.utility.NamedAPIResource {
	public int getId() {
				return id;
	}

	public ItemFlingEffect setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Effect> getEffectEntries() {
				return effect_entries;
	}

	public ItemFlingEffect setEffectEntries(java.util.ArrayList<pokeapi.bittle.models.utility.Effect> effect_entries) {
		this.effect_entries = effect_entries;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.items.Item> getItems() {
				return items;
	}

	public ItemFlingEffect setItems(java.util.ArrayList<pokeapi.bittle.models.items.Item> items) {
		this.items = items;
		return this;
	}

	// The identifier for this resource.
	private int id;

	// The result of this fling effect listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Effect> effect_entries;

	// A list of items that have this fling effect.
	private java.util.ArrayList<pokeapi.bittle.models.items.Item> items;

	private static ItemFlingEffect get(String url) {
		ItemFlingEffect obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), ItemFlingEffect.class);
		obj.setIsFetched(true);
		return obj;
	}

	public ItemFlingEffect get() {
		return ItemFlingEffect.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("item-fling-effect", limit, offset);
	}

	public static ItemFlingEffect getById(int id) {
		return get("https://pokeapi.co/api/v2/item-fling-effect/" + id);
	}

	public static ItemFlingEffect getByName(String name) {
		return get("https://pokeapi.co/api/v2/item-fling-effect/" + name);
	}
}