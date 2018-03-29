package models.move;


import models.resource.named.Move;
import models.resource.named.MoveAilment;

public class MoveMetaData {
    // The status ailment this move inflicts on its target
    private MoveAilment ailment;

    // The category of move this move falls under, e.g. damage or ailment
    private Move category;

    // The minimum number of times this move hits. Null if it always only hits once
    private int min_hits;

    // The maximum number of times this move hits. Null if it always only hits once
    private int max_hits;

    // The minimum number of turns this move continues to take effect. Null if it always only lasts one turn
    private int min_turns;

    // The maximum number of turns this move continues to take effect. Null if it always only lasts one turn
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

    public MoveMetaData(MoveAilment ailment, Move category, int min_hits, int max_hits, int min_turns,
                        int max_turns, int drain, int healing, int crit_rate, int ailment_chance,
                        int flinch_chance, int stat_chance){
        this.ailment = ailment;
        this.category = category;
        this.min_hits = min_hits;
        this.max_hits = max_hits;
        this.min_turns = min_turns;
        this.max_turns = max_turns;
        this.drain = drain;
        this.healing = healing;
        this.crit_rate = crit_rate;
        this.ailment_chance = ailment_chance;
        this.flinch_chance = flinch_chance;
        this.stat_chance = stat_chance;
    }

    public MoveAilment getAilment() {
        return ailment;
    }

    public Move getCategory() {
        return category;
    }

    public int getMinHits() {
        return min_hits;
    }

    public int getMaxHits() {
        return max_hits;
    }

    public int getMinTurns() {
        return min_turns;
    }

    public int getMaxTurns() {
        return max_turns;
    }

    public int getDrain() {
        return drain;
    }

    public int getHealing() {
        return healing;
    }

    public int getCritRate() {
        return crit_rate;
    }

    public int getAilmentChance() {
        return ailment_chance;
    }

    public int getFlinchChance() {
        return flinch_chance;
    }

    public int getStatChance() {
        return stat_chance;
    }
}
