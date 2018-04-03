package models.encounters;
/*
{
    "id": 1,
    "name": "walk",
    "order": 1,
    "names": [{
        "name": "Walking in tall grass or a cave",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }]
}
*/

public class EncounterMethod extends models.common.NamedAPIResource {
	// The identifier for this encounter method models.resource
	private int id;

	// A good value for sorting
	private int order;

	// The name of this encounter method listed in different languages
	private java.util.ArrayList<models.common.Name> names;

	private static EncounterMethod get(String url) {
		String json = api.Information.fromInternet(url);
		EncounterMethod obj = new com.google.gson.Gson().fromJson(json, EncounterMethod.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static EncounterMethod getById(int id) {
		return get("https://pokeapi.co/api/v2/encounter-method/" + id);
	}

	public static EncounterMethod getByName(String name) {
		return get("https://pokeapi.co/api/v2/encounter-method/" + name);
	}

	public int getId() {
		return id;
	}

	public EncounterMethod setId(int id) {
		this.id = id;
		return this;
	}

	public int getOrder() {
		return order;
	}

	public EncounterMethod setOrder(int order) {
		this.order = order;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getNames() {
		return names;
	}

	public EncounterMethod setNames(java.util.ArrayList<models.common.Name> names) {
		this.names = names;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}