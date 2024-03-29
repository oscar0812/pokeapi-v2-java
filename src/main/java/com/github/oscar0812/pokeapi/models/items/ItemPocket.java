/* Pockets within the players bag used for storing items by category. */

package com.github.oscar0812.pokeapi.models.items;

import com.github.oscar0812.pokeapi.models.resources.NamedAPIResourceList;
import com.github.oscar0812.pokeapi.models.utility.Name;
import com.github.oscar0812.pokeapi.models.utility.NamedAPIResource;
import com.github.oscar0812.pokeapi.utils.Information;
import java.util.ArrayList;

public class ItemPocket extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// A list of item categories that are relevant to this item pocket.
	private ArrayList<ItemCategory> categories;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	public int getId() {
		return id;
	}

	public ItemPocket setId(int id) {
		this.id = id;
		return this;
	}

	public ArrayList<ItemCategory> getCategories() {
		return categories;
	}

	public ItemPocket setCategories(ArrayList<ItemCategory> categories) {
		this.categories = categories;
		return this;
	}

	public ArrayList<Name> getNames() {
		return names;
	}

	public ItemPocket setNames(ArrayList<Name> names) {
		this.names = names;
		return this;
	}

	private static ItemPocket get(String url) {
		ItemPocket obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), ItemPocket.class);
		obj.setIsFetched(true);
		return obj;
	}

	public ItemPocket get() {
		return ItemPocket.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("item-pocket", limit, offset);
	}

	public static ItemPocket getById(int id) {
		return get("https://pokeapi.co/api/v2/item-pocket/" + id);
	}

	public static ItemPocket getByName(String name) {
		return get("https://pokeapi.co/api/v2/item-pocket/" + name);
	}
}