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
import pokeapi.bittle.models.contests.ContestEffect;
import pokeapi.bittle.models.contests.ContestType;
import pokeapi.bittle.models.contests.SuperContestEffect;
import pokeapi.bittle.models.games.Generation;
import pokeapi.bittle.models.pokemon.AbilityEffectChange;
import pokeapi.bittle.models.pokemon.Type;
import pokeapi.bittle.models.resources.NamedAPIResourceList;
import pokeapi.bittle.models.utility.MachineVersionDetail;
import pokeapi.bittle.models.utility.Name;
import pokeapi.bittle.models.utility.NamedAPIResource;
import pokeapi.bittle.models.utility.VerboseEffect;
import pokeapi.bittle.utils.Information;

public class Move extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The percent value of how likely this move is to be successful.
	private int accuracy;

	// The percent value of how likely it is this moves effect will happen.
	private int effect_chance;

	// Power points. The number of times this move can be used.
	private int pp;

	// A value between -8 and 8. Sets the order in which moves are executed during battle. See Bulbapedia for greater detail.
	private int priority;

	// The base power of this move with a value of 0 if it does not have a base power.
	private int power;

	// A detail of normal and super contest combos that require this move.
	private ContestComboSets contest_combos;

	// The type of appeal this move gives a Pokémon when used in a contest.
	private ContestType contest_type;

	// The effect the move has when used in a contest.
	private ContestEffect contest_effect;

	// The type of damage the move inflicts on the target, e.g. physical.
	private MoveDamageClass damage_class;

	// The effect of this move listed in different languages.
	private ArrayList<VerboseEffect> effect_entries;

	// The list of previous effects this move has had across version groups of the games.
	private ArrayList<AbilityEffectChange> effect_changes;

	// The flavor text of this move listed in different languages.
	private ArrayList<MoveFlavorText> flavor_text_entries;

	// The generation in which this move was introduced.
	private Generation generation;

	// A list of the machines that teach this move.
	private ArrayList<MachineVersionDetail> machines;

	// Metadata about this move
	private MoveMetaData meta;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	// A list of move resource value changes across version groups of the game.
	private ArrayList<PastMoveStatValues> past_values;

	// A list of stats this moves effects and how much it effects them.
	private ArrayList<MoveStatChange> stat_changes;

	// The effect the move has when used in a super contest.
	private SuperContestEffect super_contest_effect;

	// The type of target that will receive the effects of the attack.
	private MoveTarget target;

	// The elemental type of this move.
	private Type type;

	public int getId() {
		return id;
	}

	public Move setId(int id) {
		this.id = id;
		return this;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public Move setAccuracy(int accuracy) {
		this.accuracy = accuracy;
		return this;
	}

	public int getEffectChance() {
		return effect_chance;
	}

	public Move setEffectChance(int effect_chance) {
		this.effect_chance = effect_chance;
		return this;
	}

	public int getPp() {
		return pp;
	}

	public Move setPp(int pp) {
		this.pp = pp;
		return this;
	}

	public int getPriority() {
		return priority;
	}

	public Move setPriority(int priority) {
		this.priority = priority;
		return this;
	}

	public int getPower() {
		return power;
	}

	public Move setPower(int power) {
		this.power = power;
		return this;
	}

	public ContestComboSets getContestCombos() {
		return contest_combos;
	}

	public Move setContestCombos(ContestComboSets contest_combos) {
		this.contest_combos = contest_combos;
		return this;
	}

	public ContestType getContestType() {
		if(!contest_type.getIsFetched()) {
			contest_type = contest_type.get();
		}
		return contest_type;
	}

	public Move setContestType(ContestType contest_type) {
		this.contest_type = contest_type;
		return this;
	}

	public ContestEffect getContestEffect() {
		if(!contest_effect.getIsFetched()) {
			contest_effect = contest_effect.get();
		}
		return contest_effect;
	}

	public Move setContestEffect(ContestEffect contest_effect) {
		this.contest_effect = contest_effect;
		return this;
	}

	public MoveDamageClass getDamageClass() {
		if(!damage_class.getIsFetched()) {
			damage_class = damage_class.get();
		}
		return damage_class;
	}

	public Move setDamageClass(MoveDamageClass damage_class) {
		this.damage_class = damage_class;
		return this;
	}

	public ArrayList<VerboseEffect> getEffectEntries() {
		return effect_entries;
	}

	public Move setEffectEntries(ArrayList<VerboseEffect> effect_entries) {
		this.effect_entries = effect_entries;
		return this;
	}

	public ArrayList<AbilityEffectChange> getEffectChanges() {
		return effect_changes;
	}

	public Move setEffectChanges(ArrayList<AbilityEffectChange> effect_changes) {
		this.effect_changes = effect_changes;
		return this;
	}

	public ArrayList<MoveFlavorText> getFlavorTextEntries() {
		return flavor_text_entries;
	}

	public Move setFlavorTextEntries(ArrayList<MoveFlavorText> flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
		return this;
	}

	public Generation getGeneration() {
		if(!generation.getIsFetched()) {
			generation = generation.get();
		}
		return generation;
	}

	public Move setGeneration(Generation generation) {
		this.generation = generation;
		return this;
	}

	public ArrayList<MachineVersionDetail> getMachines() {
		return machines;
	}

	public Move setMachines(ArrayList<MachineVersionDetail> machines) {
		this.machines = machines;
		return this;
	}

	public MoveMetaData getMeta() {
		return meta;
	}

	public Move setMeta(MoveMetaData meta) {
		this.meta = meta;
		return this;
	}

	public ArrayList<Name> getNames() {
		return names;
	}

	public Move setNames(ArrayList<Name> names) {
		this.names = names;
		return this;
	}

	public ArrayList<PastMoveStatValues> getPastValues() {
		return past_values;
	}

	public Move setPastValues(ArrayList<PastMoveStatValues> past_values) {
		this.past_values = past_values;
		return this;
	}

	public ArrayList<MoveStatChange> getStatChanges() {
		return stat_changes;
	}

	public Move setStatChanges(ArrayList<MoveStatChange> stat_changes) {
		this.stat_changes = stat_changes;
		return this;
	}

	public SuperContestEffect getSuperContestEffect() {
		if(!super_contest_effect.getIsFetched()) {
			super_contest_effect = super_contest_effect.get();
		}
		return super_contest_effect;
	}

	public Move setSuperContestEffect(SuperContestEffect super_contest_effect) {
		this.super_contest_effect = super_contest_effect;
		return this;
	}

	public MoveTarget getTarget() {
		if(!target.getIsFetched()) {
			target = target.get();
		}
		return target;
	}

	public Move setTarget(MoveTarget target) {
		this.target = target;
		return this;
	}

	public Type getType() {
		if(!type.getIsFetched()) {
			type = type.get();
		}
		return type;
	}

	public Move setType(Type type) {
		this.type = type;
		return this;
	}

	private static Move get(String url) {
		Move obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), Move.class);
		obj.setIsFetched(true);
		return obj;
	}

	public Move get() {
		return Move.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("move", limit, offset);
	}

	public static Move getById(int id) {
		return get("https://pokeapi.co/api/v2/move/" + id);
	}

	public static Move getByName(String name) {
		return get("https://pokeapi.co/api/v2/move/" + name);
	}
}