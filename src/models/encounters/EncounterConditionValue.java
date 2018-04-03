package models.encounters;
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

public class EncounterConditionValue extends models.common.NamedAPIResource {
	// The identifier for this encounter condition value resource
	private int id;

	// The condition this encounter condition value pertains to
	private java.util.ArrayList<models.encounters.EncounterCondition> condition;

	// The name of this encounter condition value listed in different languages
	private java.util.ArrayList<models.common.Name> names;

	private static EncounterConditionValue get(String url) {
		String json = api.Information.fromInternet(url);
		EncounterConditionValue obj = new com.google.gson.Gson().fromJson(json, EncounterConditionValue.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static EncounterConditionValue getById(int id) {
		return get("https://pokeapi.co/api/v2/encounter-condition-value/" + id);
	}

	public static EncounterConditionValue getByName(String name) {
		return get("https://pokeapi.co/api/v2/encounter-condition-value/" + name);
	}

	public int getId() {
		return id;
	}

	public EncounterConditionValue setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<models.encounters.EncounterCondition> getCondition() {
		return condition;
	}

	public EncounterConditionValue setCondition(java.util.ArrayList<models.encounters.EncounterCondition> condition) {
		this.condition = condition;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getNames() {
		return names;
	}

	public EncounterConditionValue setNames(java.util.ArrayList<models.common.Name> names) {
		this.names = names;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}