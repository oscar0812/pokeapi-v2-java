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

import java.util.ArrayList;
import pokeapi.bittle.models.games.VersionGroup;
import pokeapi.bittle.models.pokemon.Type;
import pokeapi.bittle.models.utility.VerboseEffect;

public class PastMoveStatValues {
	// The percent value of how likely this move is to be successful.
	private int accuracy;

	// The percent value of how likely it is this moves effect will take effect.
	private int effect_chance;

	// The base power of this move with a value of 0 if it does not have a base power.
	private int power;

	// Power points. The number of times this move can be used.
	private int pp;

	// The effect of this move listed in different languages.
	private ArrayList<VerboseEffect> effect_entries;

	// The elemental type of this move.
	private Type type;

	// The version group in which these move stat values were in effect.
	private VersionGroup version_group;

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

	public ArrayList<VerboseEffect> getEffectEntries() {
		return effect_entries;
	}

	public PastMoveStatValues setEffectEntries(ArrayList<VerboseEffect> effect_entries) {
		this.effect_entries = effect_entries;
		return this;
	}

	public Type getType() {
		if(!type.getIsFetched()) {
			type = type.get();
		}
		return type;
	}

	public PastMoveStatValues setType(Type type) {
		this.type = type;
		return this;
	}

	public VersionGroup getVersionGroup() {
		if(!version_group.getIsFetched()) {
			version_group = version_group.get();
		}
		return version_group;
	}

	public PastMoveStatValues setVersionGroup(VersionGroup version_group) {
		this.version_group = version_group;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}