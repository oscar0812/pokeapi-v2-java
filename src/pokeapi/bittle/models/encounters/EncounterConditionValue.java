/* Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night. */

package pokeapi.bittle.models.encounters;
/*
{
  "id": 1,
  "name": "swarm-yes",
  "condition": {
    "name": "swarm",
    "url": "https://pokeapi.co/api/v2/encounter-condition/1/"
  },
  "names": [
    {
      "name": "WÃ¤hrend eines Schwarms",
      "language": {
        "name": "de",
        "url": "https://pokeapi.co/api/v2/language/6/"
      }
    }
  ]
}
*/

public class EncounterConditionValue extends pokeapi.bittle.models.utility.NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The condition this encounter condition value pertains to.
	private pokeapi.bittle.models.encounters.EncounterCondition condition;

	// The name of this resource listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Name> names;

	public int getId() {
		return id;
	}

	public EncounterConditionValue setId(int id) {
		this.id = id;
		return this;
	}

	public pokeapi.bittle.models.encounters.EncounterCondition getCondition() {
		if(!condition.getIsFetched()) {
			condition = condition.get();
		}
		return condition;
	}

	public EncounterConditionValue setCondition(pokeapi.bittle.models.encounters.EncounterCondition condition) {
		this.condition = condition;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Name> getNames() {
		return names;
	}

	public EncounterConditionValue setNames(java.util.ArrayList<pokeapi.bittle.models.utility.Name> names) {
		this.names = names;
		return this;
	}

	private static EncounterConditionValue get(String url) {
		EncounterConditionValue obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), EncounterConditionValue.class);
		obj.setIsFetched(true);
		return obj;
	}

	public EncounterConditionValue get() {
		return EncounterConditionValue.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("encounter-condition-value", limit, offset);
	}

	public static EncounterConditionValue getById(int id) {
		return get("https://pokeapi.co/api/v2/encounter-condition-value/" + id);
	}

	public static EncounterConditionValue getByName(String name) {
		return get("https://pokeapi.co/api/v2/encounter-condition-value/" + name);
	}
}