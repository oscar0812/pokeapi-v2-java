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

public class MoveLearnMethod extends pokeapi.bittle.models.utility.NamedAPIResource {
	public int getId() {
				return id;
	}

	public MoveLearnMethod setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Description> getDescriptions() {
				return descriptions;
	}

	public MoveLearnMethod setDescriptions(java.util.ArrayList<pokeapi.bittle.models.utility.Description> descriptions) {
		this.descriptions = descriptions;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Name> getNames() {
				return names;
	}

	public MoveLearnMethod setNames(java.util.ArrayList<pokeapi.bittle.models.utility.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.games.VersionGroup> getVersionGroups() {
				return version_groups;
	}

	public MoveLearnMethod setVersionGroups(java.util.ArrayList<pokeapi.bittle.models.games.VersionGroup> version_groups) {
		this.version_groups = version_groups;
		return this;
	}

	// The identifier for this resource.
	private int id;

	// The description of this resource listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Description> descriptions;

	// The name of this resource listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Name> names;

	// A list of version groups where moves can be learned through this method.
	private java.util.ArrayList<pokeapi.bittle.models.games.VersionGroup> version_groups;

	private static MoveLearnMethod get(String url) {
		MoveLearnMethod obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), MoveLearnMethod.class);
		obj.setIsFetched(true);
		return obj;
	}

	public MoveLearnMethod get() {
		return MoveLearnMethod.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("move-learn-method", limit, offset);
	}

	public static MoveLearnMethod getById(int id) {
		return get("https://pokeapi.co/api/v2/move-learn-method/" + id);
	}

	public static MoveLearnMethod getByName(String name) {
		return get("https://pokeapi.co/api/v2/move-learn-method/" + name);
	}
}