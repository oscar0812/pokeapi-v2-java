package moves;
public class PastMoveStatValues {
	// The percent value of how likely this move is to be successful
	private int accuracy;

	// The percent value of how likely it is this moves effect will take effect
	private int effect_chance;

	// The base power of this move with a value of 0 if it does not have a base power
	private int power;

	// Power points. The number of times this move can be used
	private int pp;

	// The effect of this move listed in different languages
	private java.util.ArrayList<common.VerboseEffect> effect_entries;

	// The elemental type of this move
	private pokemon.Type type;

	// The version group in which these move stat values were in effect
	private games.VersionGroup version_group;

	public int getAccuracy() {
		return accuracy;
	}

	public PastMoveStatValues setAccuracy(int accuracy) {
		this.accuracy = accuracy;
		return this;
	}

	public int getEffectChance() {
		return effect_chance;
	}

	public PastMoveStatValues setEffectChance(int effect_chance) {
		this.effect_chance = effect_chance;
		return this;
	}

	public int getPower() {
		return power;
	}

	public PastMoveStatValues setPower(int power) {
		this.power = power;
		return this;
	}

	public int getPp() {
		return pp;
	}

	public PastMoveStatValues setPp(int pp) {
		this.pp = pp;
		return this;
	}

	public java.util.ArrayList<common.VerboseEffect> getEffectEntries() {
		return effect_entries;
	}

	public PastMoveStatValues setEffectEntries(java.util.ArrayList<common.VerboseEffect> effect_entries) {
		this.effect_entries = effect_entries;
		return this;
	}

	public pokemon.Type getType() {
		return type;
	}

	public PastMoveStatValues setType(pokemon.Type type) {
		this.type = type;
		return this;
	}

	public games.VersionGroup getVersionGroup() {
		return version_group;
	}

	public PastMoveStatValues setVersionGroup(games.VersionGroup version_group) {
		this.version_group = version_group;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}