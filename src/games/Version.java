package games;
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

public class Version extends common.NamedAPIResource {
	// The identifier for this version resource
	private int id;

	// The name of this version listed in different languages
	private java.util.ArrayList<common.Name> names;

	// The version group this version belongs to
	private games.VersionGroup version_group;

	public static Version getById(int id) {
		String url = "https://pokeapi.co/api/v2/version/" + id;
		String json = tools.Internet.get(url);
		Version obj = new com.google.gson.Gson().fromJson(json, Version.class);
		return obj;
	}

	public static Version getByName(String name) {
		String url = "https://pokeapi.co/api/v2/version/" + name;
		String json = tools.Internet.get(url);
		Version obj = new com.google.gson.Gson().fromJson(json, Version.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public Version setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<common.Name> getNames() {
		return names;
	}

	public Version setNames(java.util.ArrayList<common.Name> names) {
		this.names = names;
		return this;
	}

	public games.VersionGroup getVersionGroup() {
		return version_group;
	}

	public Version setVersionGroup(games.VersionGroup version_group) {
		this.version_group = version_group;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}