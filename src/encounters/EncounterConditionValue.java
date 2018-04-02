package encounters;
/*
{
    "id": 1,
    "name": "swarm-yes",
    "condition": {
        "name": "swarm",
        "url": "http://pokeapi.co/api/v2/encounter-condition/1/"
    },
    "names": [{
        "name": "WÃ¤hrend eines Schwarms",
        "language": {
            "name": "de",
            "url": "http://pokeapi.co/api/v2/language/6/"
        }
    }]
}
*/

public class EncounterConditionValue extends common.NamedAPIResource {
	// The identifier for this encounter condition value resource
	private int id;

	// The condition this encounter condition value pertains to
	private java.util.ArrayList<encounters.EncounterCondition> condition;

	// The name of this encounter condition value listed in different languages
	private java.util.ArrayList<common.Name> names;

	public static EncounterConditionValue getById(int id) {
		String url = "https://pokeapi.co/api/v2/encounter-condition-value/" + id;
		String json = tools.Internet.get(url);
		EncounterConditionValue obj = new com.google.gson.Gson().fromJson(json, EncounterConditionValue.class);
		return obj;
	}

	public static EncounterConditionValue getByName(String name) {
		String url = "https://pokeapi.co/api/v2/encounter-condition-value/" + name;
		String json = tools.Internet.get(url);
		EncounterConditionValue obj = new com.google.gson.Gson().fromJson(json, EncounterConditionValue.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public EncounterConditionValue setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<encounters.EncounterCondition> getCondition() {
		return condition;
	}

	public EncounterConditionValue setCondition(java.util.ArrayList<encounters.EncounterCondition> condition) {
		this.condition = condition;
		return this;
	}

	public java.util.ArrayList<common.Name> getNames() {
		return names;
	}

	public EncounterConditionValue setNames(java.util.ArrayList<common.Name> names) {
		this.names = names;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}