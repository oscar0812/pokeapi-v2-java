/* Methods by which Pokémon can learn moves. */

package pokeapi.bittle.models.moves;
/*
{
  "id": 1,
  "name": "level-up",
  "names": [
    {
      "name": "Level up",
      "language": {
        "name": "de",
        "url": "https://pokeapi.co/api/v2/language/6/"
      }
    }
  ],
  "descriptions": [
    {
      "description": "Wird gelernt, wenn ein Pokémon ein bestimmtes Level erreicht.",
      "language": {
        "name": "de",
        "url": "https://pokeapi.co/api/v2/language/6/"
      }
    }
  ],
  "version_groups": [
    {
      "name": "red-blue",
      "url": "https://pokeapi.co/api/v2/version-group/1/"
    }
  ]
}
*/

import java.util.ArrayList;
import pokeapi.bittle.models.games.VersionGroup;
import pokeapi.bittle.models.resources.NamedAPIResourceList;
import pokeapi.bittle.models.utility.Description;
import pokeapi.bittle.models.utility.Name;
import pokeapi.bittle.models.utility.NamedAPIResource;
import pokeapi.bittle.utils.Information;

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