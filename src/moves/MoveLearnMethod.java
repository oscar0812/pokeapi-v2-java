package moves;
/*
{
    "id": 1,
    "name": "level-up",
    "names": [{
        "name": "Level up",
        "language": {
            "name": "de",
            "url": "http://pokeapi.co/api/v2/language/6/"
        }
    }],
    "descriptions": [{
        "description": "Wird gelernt, wenn ein Pokémon ein bestimmtes Level erreicht.",
        "language": {
            "name": "de",
            "url": "http://pokeapi.co/api/v2/language/6/"
        }
    }],
    "version_groups": [{
        "name": "red-blue",
        "url": "http://pokeapi.co/api/v2/version-group/1/"
    }]
}
*/

public class MoveLearnMethod extends common.NamedAPIResource {
	// The identifier for this move learn method resource
	private int id;

	// The description of this move learn method listed in different languages
	private java.util.ArrayList<common.Description> descriptions;

	// The name of this move learn method listed in different languages
	private java.util.ArrayList<common.Name> names;

	// A list of version groups where moves can be learned through this method
	private java.util.ArrayList<games.VersionGroup> version_groups;

	public static MoveLearnMethod getById(int id) {
		String url = "https://pokeapi.co/api/v2/move-learn-method/" + id;
		String json = tools.Internet.get(url);
		MoveLearnMethod obj = new com.google.gson.Gson().fromJson(json, MoveLearnMethod.class);
		return obj;
	}

	public static MoveLearnMethod getByName(String name) {
		String url = "https://pokeapi.co/api/v2/move-learn-method/" + name;
		String json = tools.Internet.get(url);
		MoveLearnMethod obj = new com.google.gson.Gson().fromJson(json, MoveLearnMethod.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public MoveLearnMethod setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<common.Description> getDescriptions() {
		return descriptions;
	}

	public MoveLearnMethod setDescriptions(java.util.ArrayList<common.Description> descriptions) {
		this.descriptions = descriptions;
		return this;
	}

	public java.util.ArrayList<common.Name> getNames() {
		return names;
	}

	public MoveLearnMethod setNames(java.util.ArrayList<common.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<games.VersionGroup> getVersionGroups() {
		return version_groups;
	}

	public MoveLearnMethod setVersionGroups(java.util.ArrayList<games.VersionGroup> version_groups) {
		this.version_groups = version_groups;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}