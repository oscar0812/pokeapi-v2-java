/* Methods by which Pokémon can learn moves. */

package com.github.oscar0812.pokeapi.models.moves;

import com.github.oscar0812.pokeapi.models.games.VersionGroup;
import com.github.oscar0812.pokeapi.models.resources.NamedAPIResourceList;
import com.github.oscar0812.pokeapi.models.utility.Description;
import com.github.oscar0812.pokeapi.models.utility.Name;
import com.github.oscar0812.pokeapi.models.utility.NamedAPIResource;
import com.github.oscar0812.pokeapi.utils.Information;
import java.util.ArrayList;

public class MoveLearnMethod extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The description of this resource listed in different languages.
	private ArrayList<Description> descriptions;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	// A list of version groups where moves can be learned through this method.
	private ArrayList<VersionGroup> version_groups;

	public int getId() {
		return id;
	}

	public MoveLearnMethod setId(int id) {
		this.id = id;
		return this;
	}

	public ArrayList<Description> getDescriptions() {
		return descriptions;
	}

	public MoveLearnMethod setDescriptions(ArrayList<Description> descriptions) {
		this.descriptions = descriptions;
		return this;
	}

	public ArrayList<Name> getNames() {
		return names;
	}

	public MoveLearnMethod setNames(ArrayList<Name> names) {
		this.names = names;
		return this;
	}

	public ArrayList<VersionGroup> getVersionGroups() {
		return version_groups;
	}

	public MoveLearnMethod setVersionGroups(ArrayList<VersionGroup> version_groups) {
		this.version_groups = version_groups;
		return this;
	}

	private static MoveLearnMethod get(String url) {
		MoveLearnMethod obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), MoveLearnMethod.class);
		obj.setIsFetched(true);
		return obj;
	}

	public MoveLearnMethod get() {
		return MoveLearnMethod.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("move-learn-method", limit, offset);
	}

	public static MoveLearnMethod getById(int id) {
		return get("https://pokeapi.co/api/v2/move-learn-method/" + id);
	}

	public static MoveLearnMethod getByName(String name) {
		return get("https://pokeapi.co/api/v2/move-learn-method/" + name);
	}
}