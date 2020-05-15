/* Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas. */

package pokeapi.bittle.models.moves;
/*
{
  "id": 1,
  "name": "pound",
  "accuracy": 100,
  "effect_chance": null,
  "pp": 35,
  "priority": 0,
  "power": 40,
  "contest_combos": {
    "normal": {
      "use_before": [
        {
          "name": "double-slap",
          "url": "https://pokeapi.co/api/v2/move/3/"
        },
        {
          "name": "headbutt",
          "url": "https://pokeapi.co/api/v2/move/29/"
        },
        {
          "name": "feint-attack",
          "url": "https://pokeapi.co/api/v2/move/185/"
        }
      ],
      "use_after": null
    },
    "super": {
      "use_before": null,
      "use_after": null
    }
  },
  "contest_type": {
    "name": "tough",
    "url": "https://pokeapi.co/api/v2/contest-type/5/"
  },
  "contest_effect": {
    "url": "https://pokeapi.co/api/v2/contest-effect/1/"
  },
  "damage_class": {
    "name": "physical",
    "url": "https://pokeapi.co/api/v2/move-damage-class/2/"
  },
  "effect_entries": [
    {
      "effect": "Inflicts [regular damage]{mechanic:regular-damage}.",
      "short_effect": "Inflicts regular damage with no additional effect.",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "effect_changes": [],
  "generation": {
    "name": "generation-i",
    "url": "https://pokeapi.co/api/v2/generation/1/"
  },
  "meta": {
    "ailment": {
      "name": "none",
      "url": "https://pokeapi.co/api/v2/move-ailment/0/"
    },
    "category": {
      "name": "damage",
      "url": "https://pokeapi.co/api/v2/move-category/0/"
    },
    "min_hits": null,
    "max_hits": null,
    "min_turns": null,
    "max_turns": null,
    "drain": 0,
    "healing": 0,
    "crit_rate": 0,
    "ailment_chance": 0,
    "flinch_chance": 0,
    "stat_chance": 0
  },
  "names": [
    {
      "name": "Pound",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "past_values": [],
  "stat_changes": [],
  "super_contest_effect": {
    "url": "https://pokeapi.co/api/v2/super-contest-effect/5/"
  },
  "target": {
    "name": "selected-pokemon",
    "url": "https://pokeapi.co/api/v2/move-target/10/"
  },
  "type": {
    "name": "normal",
    "url": "https://pokeapi.co/api/v2/type/1/"
  },
  "flavor_text_entries": [
    {
      "flavor_text": "Pounds with fore­\nlegs or tail.",
      "language": {
        "url": "https://pokeapi.co/api/v2/language/9/",
        "name": "en"
      },
      "version_group": {
        "url": "https://pokeapi.co/api/v2/version-group/3/",
        "name": "gold-silver"
      }
    }
  ]
}
*/

import pokeapi.bittle.models.moves.MoveCategory;

public class MoveMetaData {
	// The status ailment this move inflicts on its target.
	private MoveAilment ailment;

	// The category of move this move falls under, e.g. damage or ailment.
	private MoveCategory category;

	// The minimum number of times this move hits. Null if it always only hits once.
	private int min_hits;

	// The maximum number of times this move hits. Null if it always only hits once.
	private int max_hits;

	// The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.
	private int min_turns;

	// The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.
	private int max_turns;

	// HP drain (if positive) or Recoil damage (if negative), in percent of damage done.
	private int drain;

	// The amount of hp gained by the attacking Pokemon, in percent of it's maximum HP.
	private int healing;

	// Critical hit rate bonus.
	private int crit_rate;

	// The likelihood this attack will cause an ailment.
	private int ailment_chance;

	// The likelihood this attack will cause the target Pokémon to flinch.
	private int flinch_chance;

	// The likelihood this attack will cause a stat change in the target Pokémon.
	private int stat_chance;

	public MoveAilment getAilment() {
		if(!ailment.getIsFetched()) {
			ailment = ailment.get();
		}
		return ailment;
	}

	public MoveMetaData setAilment(MoveAilment ailment) {
		this.ailment = ailment;
		return this;
	}

	public MoveCategory getCategory() {
		if(!category.getIsFetched()) {
			category = category.get();
		}
		return category;
	}

	public MoveMetaData setCategory(MoveCategory category) {
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

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}