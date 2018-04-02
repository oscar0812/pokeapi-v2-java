package encounters;
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

public class EncounterMethod extends common.NamedAPIResource {
	// The identifier for this encounter method resource
	private int id;

	// A good value for sorting
	private int order;

	// The name of this encounter method listed in different languages
	private java.util.ArrayList<common.Name> names;

	public static EncounterMethod getById(int id) {
		String url = "https://pokeapi.co/api/v2/encounter-method/" + id;
		String json = tools.Internet.get(url);
		EncounterMethod obj = new com.google.gson.Gson().fromJson(json, EncounterMethod.class);
		return obj;
	}

	public static EncounterMethod getByName(String name) {
		String url = "https://pokeapi.co/api/v2/encounter-method/" + name;
		String json = tools.Internet.get(url);
		EncounterMethod obj = new com.google.gson.Gson().fromJson(json, EncounterMethod.class);
		return obj;
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

	public java.util.ArrayList<common.Name> getNames() {
		return names;
	}

	public EncounterMethod setNames(java.util.ArrayList<common.Name> names) {
		this.names = names;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}