package models.games;
/*
{
    "id": 1,
    "name": "red",
    "names": [{
        "name": "Rot",
        "language": {
            "name": "de",
            "url": "http://pokeapi.co/api/v2/language/6/"
        }
    }],
    "version_group": {
        "name": "red-blue",
        "url": "http://pokeapi.co/api/v2/version-group/1/"
    }
}
*/

public class Version extends models.common.NamedAPIResource {
	// The identifier for this version models.resource
	private int id;

	// The name of this version listed in different languages
	private java.util.ArrayList<models.common.Name> names;

	// The version group this version belongs to
	private models.games.VersionGroup version_group;

	private static Version get(String url) {
		String json = api.Information.fromInternet(url);
		Version obj = new com.google.gson.Gson().fromJson(json, Version.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static Version getById(int id) {
		return get("https://pokeapi.co/api/v2/version/" + id);
	}

	public static Version getByName(String name) {
		return get("https://pokeapi.co/api/v2/version/" + name);
	}

	public int getId() {
		return id;
	}

	public Version setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getNames() {
		return names;
	}

	public Version setNames(java.util.ArrayList<models.common.Name> names) {
		this.names = names;
		return this;
	}

	public models.games.VersionGroup getVersionGroup() {
		return version_group;
	}

	public Version setVersionGroup(models.games.VersionGroup version_group) {
		this.version_group = version_group;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}