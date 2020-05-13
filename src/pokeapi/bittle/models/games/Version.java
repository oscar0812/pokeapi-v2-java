/* Versions of the games, e.g., Red, Blue or Yellow. */

package pokeapi.bittle.models.games;
/*
{
  "id": 1,
  "name": "red",
  "names": [
    {
      "name": "Rot",
      "language": {
        "name": "de",
        "url": "https://pokeapi.co/api/v2/language/6/"
      }
    }
  ],
  "version_group": {
    "name": "red-blue",
    "url": "https://pokeapi.co/api/v2/version-group/1/"
  }
}
*/

public class Version extends pokeapi.bittle.models.utility.NamedAPIResource {
	public int getId() {
				return id;
	}

	public Version setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Name> getNames() {
				return names;
	}

	public Version setNames(java.util.ArrayList<pokeapi.bittle.models.utility.Name> names) {
		this.names = names;
		return this;
	}

	public pokeapi.bittle.models.games.VersionGroup getVersionGroup() {
		if(!version_group.getIsFetched()) {
			version_group = version_group.get();
		}

		return version_group;
	}

	public Version setVersionGroup(pokeapi.bittle.models.games.VersionGroup version_group) {
		this.version_group = version_group;
		return this;
	}

	// The identifier for this resource.
	private int id;

	// The name of this resource listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Name> names;

	// The version group this version belongs to.
	private pokeapi.bittle.models.games.VersionGroup version_group;

	private static Version get(String url) {
		Version obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), Version.class);
		obj.setIsFetched(true);
		return obj;
	}

	public Version get() {
		return Version.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("version", limit, offset);
	}

	public static Version getById(int id) {
		return get("https://pokeapi.co/api/v2/version/" + id);
	}

	public static Version getByName(String name) {
		return get("https://pokeapi.co/api/v2/version/" + name);
	}
}