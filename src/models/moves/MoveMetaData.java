package models.moves;
public class MoveMetaData {
	// The status ailment this move inflicts on its target
	private models.moves.MoveAilment ailment;

	// The category of move this move falls under, e.g. damage or ailment
	private models.moves.Move category;

	// The minimum number of times this move hits. Null if it always only hits once.
	private int min_hits;

	// The maximum number of times this move hits. Null if it always only hits once.
	private int max_hits;

	// The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.
	private int min_turns;

	// The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.
	private int max_turns;

	// HP drain (if positive) or Recoil damage (if negative), in percent of damage done
	private int drain;

	// The amount of hp gained by the attacking Pokemon, in percent of it's maximum HP
	private int healing;

	// Critical hit rate bonus
	private int crit_rate;

	// The likelihood this attack will cause an ailment
	private int ailment_chance;

	// The likelihood this attack will cause the target Pokémon to flinch
	private int flinch_chance;

	// The likelihood this attack will cause a stat change in the target Pokémon
	private int stat_chance;

	public models.moves.MoveAilment getAilment() {
		return ailment;
	}

	public MoveMetaData setAilment(models.moves.MoveAilment ailment) {
		this.ailment = ailment;
		return this;
	}

	public models.moves.Move getCategory() {
		return category;
	}

	public MoveMetaData setCategory(models.moves.Move category) {
		this.category = category;
		return this;
	}

	public int getMinHits() {
		return min_hits;
	}

	public MoveMetaData setMinHits(int min_hits) {
		this.min_hits = min_hits;
		return this;
	}

	public int getMaxHits() {
		return max_hits;
	}

	public MoveMetaData setMaxHits(int max_hits) {
		this.max_hits = max_hits;
		return this;
	}

	public int getMinTurns() {
		return min_turns;
	}

	public MoveMetaData setMinTurns(int min_turns) {
		this.min_turns = min_turns;
		return this;
	}

	public int getMaxTurns() {
		return max_turns;
	}

	public MoveMetaData setMaxTurns(int max_turns) {
		this.max_turns = max_turns;
		return this;
	}

	public int getDrain() {
		return drain;
	}

	public MoveMetaData setDrain(int drain) {
		this.drain = drain;
		return this;
	}

	public int getHealing() {
		return healing;
	}

	public MoveMetaData setHealing(int healing) {
		this.healing = healing;
		return this;
	}

	public int getCritRate() {
		return crit_rate;
	}

	public MoveMetaData setCritRate(int crit_rate) {
		this.crit_rate = crit_rate;
		return this;
	}

	public int getAilmentChance() {
		return ailment_chance;
	}

	public MoveMetaData setAilmentChance(int ailment_chance) {
		this.ailment_chance = ailment_chance;
		return this;
	}

	public int getFlinchChance() {
		return flinch_chance;
	}

	public MoveMetaData setFlinchChance(int flinch_chance) {
		this.flinch_chance = flinch_chance;
		return this;
	}

	public int getStatChance() {
		return stat_chance;
	}

	public MoveMetaData setStatChance(int stat_chance) {
		this.stat_chance = stat_chance;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}