package encounters;
/*
{
    "id": 1,
    "name": "swarm",
    "values": [{
        "name": "swarm-yes",
        "url": "http://pokeapi.co/api/v2/encounter-condition-value/1/"
    }, {
        "name": "swarm-no",
        "url": "http://pokeapi.co/api/v2/encounter-condition-value/2/"
    }],
    "names": [{
        "name": "Schwarm",
        "language": {
            "name": "de",
            "url": "http://pokeapi.co/api/v2/language/6/"
        }
    }]
}
*/

public class EncounterCondition extends common.NamedAPIResource {
	// The identifier for this encounter condition resource
	private int id;

	// The name of this encounter method listed in different languages
	private java.util.ArrayList<common.Name> names;

	// A list of possible values for this encounter condition
	private java.util.ArrayList<encounters.EncounterConditionValue> values;

	public static EncounterCondition getById(int id) {
		String url = "https://pokeapi.co/api/v2/encounter-condition/" + id;
		String json = tools.Internet.get(url);
		EncounterCondition obj = new com.google.gson.Gson().fromJson(json, EncounterCondition.class);
		return obj;
	}

	public static EncounterCondition getByName(String name) {
		String url = "https://pokeapi.co/api/v2/encounter-condition/" + name;
		String json = tools.Internet.get(url);
		EncounterCondition obj = new com.google.gson.Gson().fromJson(json, EncounterCondition.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public EncounterCondition setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<common.Name> getNames() {
		return names;
	}

	public EncounterCondition setNames(java.util.ArrayList<common.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<encounters.EncounterConditionValue> getValues() {
		return values;
	}

	public EncounterCondition setValues(java.util.ArrayList<encounters.EncounterConditionValue> values) {
		this.values = values;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}