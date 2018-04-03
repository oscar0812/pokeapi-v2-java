package models.moves;
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

public class MoveLearnMethod extends models.common.NamedAPIResource {
	// The identifier for this move learn method models.resource
	private int id;

	// The description of this move learn method listed in different languages
	private java.util.ArrayList<models.common.Description> descriptions;

	// The name of this move learn method listed in different languages
	private java.util.ArrayList<models.common.Name> names;

	// A list of version groups where models.moves can be learned through this method
	private java.util.ArrayList<models.games.VersionGroup> version_groups;

	private static MoveLearnMethod get(String url) {
		String json = api.Information.fromInternet(url);
		MoveLearnMethod obj = new com.google.gson.Gson().fromJson(json, MoveLearnMethod.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static MoveLearnMethod getById(int id) {
		return get("https://pokeapi.co/api/v2/move-learn-method/" + id);
	}

	public static MoveLearnMethod getByName(String name) {
		return get("https://pokeapi.co/api/v2/move-learn-method/" + name);
	}

	public int getId() {
		return id;
	}

	public MoveLearnMethod setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<models.common.Description> getDescriptions() {
		return descriptions;
	}

	public MoveLearnMethod setDescriptions(java.util.ArrayList<models.common.Description> descriptions) {
		this.descriptions = descriptions;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getNames() {
		return names;
	}

	public MoveLearnMethod setNames(java.util.ArrayList<models.common.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<models.games.VersionGroup> getVersionGroups() {
		return version_groups;
	}

	public MoveLearnMethod setVersionGroups(java.util.ArrayList<models.games.VersionGroup> version_groups) {
		this.version_groups = version_groups;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}