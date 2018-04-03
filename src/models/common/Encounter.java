package models.common;
public class Encounter {
	// The lowest level the Pokémon could be encountered at
	private int min_level;

	// The highest level the Pokémon could be encountered at
	private int max_level;

	// A list of condition values that must be in effect for this encounter to occur
	private java.util.ArrayList<models.encounters.EncounterConditionValue> condition_values;

	// percent chance that this encounter will occur
	private int chance;

	// The method by which this encounter happens
	private models.encounters.EncounterMethod method;

	public int getMinLevel() {
		return min_level;
	}

	public Encounter setMinLevel(int min_level) {
		this.min_level = min_level;
		return this;
	}

	public int getMaxLevel() {
		return max_level;
	}

	public Encounter setMaxLevel(int max_level) {
		this.max_level = max_level;
		return this;
	}

	public java.util.ArrayList<models.encounters.EncounterConditionValue> getConditionValues() {
		return condition_values;
	}

	public Encounter setConditionValues(java.util.ArrayList<models.encounters.EncounterConditionValue> condition_values) {
		this.condition_values = condition_values;
		return this;
	}

	public int getChance() {
		return chance;
	}

	public Encounter setChance(int chance) {
		this.chance = chance;
		return this;
	}

	public models.encounters.EncounterMethod getMethod() {
		return method;
	}

	public Encounter setMethod(models.encounters.EncounterMethod method) {
		this.method = method;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}