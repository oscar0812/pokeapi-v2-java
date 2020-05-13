/* Conditions which affect what pokemon might appear in the wild, e.g., day or night. */

package pokeapi.bittle.models.encounters;
/*
{
  "id": 1,
  "name": "swarm",
  "values": [
    {
      "name": "swarm-yes",
      "url": "https://pokeapi.co/api/v2/encounter-condition-value/1/"
    },
    {
      "name": "swarm-no",
      "url": "https://pokeapi.co/api/v2/encounter-condition-value/2/"
    }
  ],
  "names": [
    {
      "name": "Schwarm",
      "language": {
        "name": "de",
        "url": "https://pokeapi.co/api/v2/language/6/"
      }
    }
  ]
}
*/

public class EncounterCondition extends pokeapi.bittle.models.utility.NamedAPIResource {
	public int getId() {
				return id;
	}

	public EncounterCondition setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Name> getNames() {
				return names;
	}

	public EncounterCondition setNames(java.util.ArrayList<pokeapi.bittle.models.utility.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.encounters.EncounterConditionValue> getValues() {
				return values;
	}

	public EncounterCondition setValues(java.util.ArrayList<pokeapi.bittle.models.encounters.EncounterConditionValue> values) {
		this.values = values;
		return this;
	}

	// The identifier for this resource.
	private int id;

	// The name of this resource listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Name> names;

	// A list of possible values for this encounter condition.
	private java.util.ArrayList<pokeapi.bittle.models.encounters.EncounterConditionValue> values;

	private static EncounterCondition get(String url) {
		EncounterCondition obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), EncounterCondition.class);
		obj.setIsFetched(true);
		return obj;
	}

	public EncounterCondition get() {
		return EncounterCondition.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("encounter-condition", limit, offset);
	}

	public static EncounterCondition getById(int id) {
		return get("https://pokeapi.co/api/v2/encounter-condition/" + id);
	}

	public static EncounterCondition getByName(String name) {
		return get("https://pokeapi.co/api/v2/encounter-condition/" + name);
	}
}