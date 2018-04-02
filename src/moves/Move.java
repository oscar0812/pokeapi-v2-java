package moves;
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
            "use_before": [{
                "name": "double-slap",
                "url": "http://pokeapi.co/api/v2/move/3/"
            }, {
                "name": "headbutt",
                "url": "http://pokeapi.co/api/v2/move/29/"
            }, {
                "name": "feint-attack",
                "url": "http://pokeapi.co/api/v2/move/185/"
            }],
            "use_after": null
        },
        "super": {
            "use_before": null,
            "use_after": null
        }
    },
    "contest_type": {
        "name": "tough",
        "url": "http://pokeapi.co/api/v2/contest-type/5/"
    },
    "contest_effect": {
        "url": "http://pokeapi.co/api/v2/contest-effect/1/"
    },
    "damage_class": {
        "name": "physical",
        "url": "http://pokeapi.co/api/v2/move-damage-class/2/"
    },
    "effect_entries": [{
        "effect": "Inflicts [regular damage]{mechanic:regular-damage}.",
        "short_effect": "Inflicts regular damage with no additional effect.",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }],
    "effect_changes": [],
    "generation": {
        "name": "generation-i",
        "url": "http://pokeapi.co/api/v2/generation/1/"
    },
    "meta": {
        "ailment": {
            "name": "none",
            "url": "http://pokeapi.co/api/v2/move-ailment/0/"
        },
        "category": {
            "name": "damage",
            "url": "http://pokeapi.co/api/v2/move-category/0/"
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
    "names": [{
        "name": "Pound",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }],
    "past_values": [],
    "stat_changes": [],
    "super_contest_effect": {
        "url": "http://pokeapi.co/api/v2/super-contest-effect/5/"
    },
    "target": {
        "name": "selected-pokemon",
        "url": "http://pokeapi.co/api/v2/move-target/10/"
    },
    "type": {
        "name": "normal",
        "url": "http://pokeapi.co/api/v2/type/1/"
    },
  "flavor_text_entries": [
        {
            "flavor_text": "Pounds with fore­\nlegs or tail.",
            "language": {
                "url": "http://localhost:8000/api/v2/language/9/",
                "name": "en"
            },
            "version_group": {
                "url": "http://localhost:8000/api/v2/version-group/3/",
                "name": "gold-silver"
            }
        },
  }]
}
*/

public class Move extends common.NamedAPIResource {
	// The identifier for this move resource
	private int id;

	// The percent value of how likely this move is to be successful
	private int accuracy;

	// The percent value of how likely it is this moves effect will happen
	private int effect_chance;

	// Power points. The number of times this move can be used
	private int pp;

	// A value between -8 and 8. Sets the order in which moves are executed during battle. See Bulbapedia for greater detail.
	private int priority;

	// The base power of this move with a value of 0 if it does not have a base power
	private int power;

	// A detail of normal and super contest combos that require this move
	private moves.ContestComboSets contest_combos;

	// The type of appeal this move gives a Pokémon when used in a contest
	private contests.ContestType contest_type;

	// The effect the move has when used in a contest
	private contests.ContestEffect contest_effect;

	// The type of damage the move inflicts on the target, e.g. physical
	private moves.MoveDamageClass damage_class;

	// The effect of this move listed in different languages
	private java.util.ArrayList<common.VerboseEffect> effect_entries;

	// The list of previous effects this move has had across version groups of the games
	private java.util.ArrayList<pokemon.AbilityEffectChange> effect_changes;

	// The flavor text of this move listed in different languages
	private java.util.ArrayList<moves.MoveFlavorText> flavor_text_entries;

	// The generation in which this move was introduced
	private games.Generation generation;

	// A list of the machines that teach this move
	private java.util.ArrayList<common.MachineVersionDetail> machines;

	// Metadata about this move
	private moves.MoveMetaData meta;

	// The name of this move listed in different languages
	private java.util.ArrayList<common.Name> names;

	// A list of move resource value changes across version groups of the game
	private java.util.ArrayList<moves.PastMoveStatValues> past_values;

	// A list of stats this moves effects and how much it effects them
	private java.util.ArrayList<moves.MoveStatChange> stat_changes;

	// The effect the move has when used in a super contest
	private contests.SuperContestEffect super_contest_effect;

	// The type of target that will receive the effects of the attack
	private moves.MoveTarget target;

	// The elemental type of this move
	private pokemon.Type type;

	public static Move getById(int id) {
		String url = "https://pokeapi.co/api/v2/move/" + id;
		String json = tools.Internet.get(url);
		Move obj = new com.google.gson.Gson().fromJson(json, Move.class);
		return obj;
	}

	public static Move getByName(String name) {
		String url = "https://pokeapi.co/api/v2/move/" + name;
		String json = tools.Internet.get(url);
		Move obj = new com.google.gson.Gson().fromJson(json, Move.class);
		return obj;
	}

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

	public moves.ContestComboSets getContestCombos() {
		return contest_combos;
	}

	public Move setContestCombos(moves.ContestComboSets contest_combos) {
		this.contest_combos = contest_combos;
		return this;
	}

	public contests.ContestType getContestType() {
		return contest_type;
	}

	public Move setContestType(contests.ContestType contest_type) {
		this.contest_type = contest_type;
		return this;
	}

	public contests.ContestEffect getContestEffect() {
		return contest_effect;
	}

	public Move setContestEffect(contests.ContestEffect contest_effect) {
		this.contest_effect = contest_effect;
		return this;
	}

	public moves.MoveDamageClass getDamageClass() {
		return damage_class;
	}

	public Move setDamageClass(moves.MoveDamageClass damage_class) {
		this.damage_class = damage_class;
		return this;
	}

	public java.util.ArrayList<common.VerboseEffect> getEffectEntries() {
		return effect_entries;
	}

	public Move setEffectEntries(java.util.ArrayList<common.VerboseEffect> effect_entries) {
		this.effect_entries = effect_entries;
		return this;
	}

	public java.util.ArrayList<pokemon.AbilityEffectChange> getEffectChanges() {
		return effect_changes;
	}

	public Move setEffectChanges(java.util.ArrayList<pokemon.AbilityEffectChange> effect_changes) {
		this.effect_changes = effect_changes;
		return this;
	}

	public java.util.ArrayList<moves.MoveFlavorText> getFlavorTextEntries() {
		return flavor_text_entries;
	}

	public Move setFlavorTextEntries(java.util.ArrayList<moves.MoveFlavorText> flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
		return this;
	}

	public games.Generation getGeneration() {
		return generation;
	}

	public Move setGeneration(games.Generation generation) {
		this.generation = generation;
		return this;
	}

	public java.util.ArrayList<common.MachineVersionDetail> getMachines() {
		return machines;
	}

	public Move setMachines(java.util.ArrayList<common.MachineVersionDetail> machines) {
		this.machines = machines;
		return this;
	}

	public moves.MoveMetaData getMeta() {
		return meta;
	}

	public Move setMeta(moves.MoveMetaData meta) {
		this.meta = meta;
		return this;
	}

	public java.util.ArrayList<common.Name> getNames() {
		return names;
	}

	public Move setNames(java.util.ArrayList<common.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<moves.PastMoveStatValues> getPastValues() {
		return past_values;
	}

	public Move setPastValues(java.util.ArrayList<moves.PastMoveStatValues> past_values) {
		this.past_values = past_values;
		return this;
	}

	public java.util.ArrayList<moves.MoveStatChange> getStatChanges() {
		return stat_changes;
	}

	public Move setStatChanges(java.util.ArrayList<moves.MoveStatChange> stat_changes) {
		this.stat_changes = stat_changes;
		return this;
	}

	public contests.SuperContestEffect getSuperContestEffect() {
		return super_contest_effect;
	}

	public Move setSuperContestEffect(contests.SuperContestEffect super_contest_effect) {
		this.super_contest_effect = super_contest_effect;
		return this;
	}

	public moves.MoveTarget getTarget() {
		return target;
	}

	public Move setTarget(moves.MoveTarget target) {
		this.target = target;
		return this;
	}

	public pokemon.Type getType() {
		return type;
	}

	public Move setType(pokemon.Type type) {
		this.type = type;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}