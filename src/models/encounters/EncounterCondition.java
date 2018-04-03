package models.encounters;
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

public class EncounterCondition extends models.common.NamedAPIResource {
	// The identifier for this encounter condition models.resource
	private int id;

	// The name of this encounter method listed in different languages
	private java.util.ArrayList<models.common.Name> names;

	// A list of possible values for this encounter condition
	private java.util.ArrayList<models.encounters.EncounterConditionValue> values;

	private static EncounterCondition get(String url) {
		String json = api.Information.fromInternet(url);
		EncounterCondition obj = new com.google.gson.Gson().fromJson(json, EncounterCondition.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static EncounterCondition getById(int id) {
		return get("https://pokeapi.co/api/v2/encounter-condition/" + id);
	}

	public static EncounterCondition getByName(String name) {
		return get("https://pokeapi.co/api/v2/encounter-condition/" + name);
	}

	public int getId() {
		return id;
	}

	public EncounterCondition setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getNames() {
		return names;
	}

	public EncounterCondition setNames(java.util.ArrayList<models.common.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<models.encounters.EncounterConditionValue> getValues() {
		return values;
	}

	public EncounterCondition setValues(java.util.ArrayList<models.encounters.EncounterConditionValue> values) {
		this.values = values;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}