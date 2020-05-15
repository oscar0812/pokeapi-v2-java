package pokeapi.bittle.models.utility;

import java.util.ArrayList;
import pokeapi.bittle.models.encounters.EncounterConditionValue;
import pokeapi.bittle.models.encounters.EncounterMethod;

public class Encounter {
	// The lowest level the Pokémon could be encountered at.
	private int min_level;

	// The highest level the Pokémon could be encountered at.
	private int max_level;

	// A list of condition values that must be in effect for this encounter to occur.
	private ArrayList<EncounterConditionValue> condition_values;

	// Percent chance that this encounter will occur.
	private int chance;

	// The method by which this encounter happens.
	private EncounterMethod method;

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

	public ArrayList<EncounterConditionValue> getConditionValues() {
		return condition_values;
	}

	public Encounter setConditionValues(ArrayList<EncounterConditionValue> condition_values) {
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

	public EncounterMethod getMethod() {
		if(!method.getIsFetched()) {
			method = method.get();
		}
		return method;
	}

	public Encounter setMethod(EncounterMethod method) {
		this.method = method;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}