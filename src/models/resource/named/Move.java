package models.resource.named;

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

import models.*;
import models.move.MoveFlavorText;
import models.move.MoveMetaData;
import models.move.MoveStatChange;
import models.move.PastMoveStatValues;
import models.resource.ContestEffect;
import models.resource.SuperContestEffect;

import java.util.ArrayList;

public class Move extends NamedAPIResource {
    // The identifier for this move resource
    private int id;

    // The percent value of how likely this move is to be successful
    private int accuracy;

    // The percent value of how likely it is this moves effect will happen
    private int effect_change;

    // Power points. The number of times this move can be used
    private int pp;

    // A value between -8 and 8. Sets the order in which moves are executed during battle. See Bulbapedia for
    // greater detail
    private short priority;

    // The base power of this move with a value of 0 if it does not have a base power
    private int power;

    // A detail of normal and super contest combos that require this move
    private ContestComboSets contest_combo_sets;

    // The type of appeal this move gives a Pokémon when used in a contest
    private ContestType contest_type;

    // The effect the move has when used in a contest
    private ContestEffect contest_effect;

    // The type of damage the move inflicts on the target, e.g. physical
    private MoveDamageClass damage_class;

    // The effect of this move listed in different languages
    private ArrayList<VerboseEffect> effect_entries;

    // The list of previous effects this move has had across version groups of the games
    private ArrayList<AbilityEffectChange> effect_changes;

    // The flavor text of this move listed in different languages
    private ArrayList<MoveFlavorText> flavor_text_entries;

    // The generation in which this move was introduced
    private Generation generation;

    // A list of the machines that teach this move
    private ArrayList<MachineVersionDetail> machines;

    // Metadata about this move
    private MoveMetaData meta;

    // The name of this move listed in different languages
    private ArrayList<Name> names;

    // A list of move resource value changes across version groups of the game
    private ArrayList<PastMoveStatValues> past_values;

    // A list of stats this moves effects and how much it effects them
    private ArrayList<MoveStatChange> stat_changes;

    // The effect the move has when used in a super contest
    private SuperContestEffect super_contest_effect;

    // The type of target that will receive the effects of the attack
    private MoveTarget target;

    // The elemental type of this move
    private Type type;

    public Move(String url, String name, int id, int accuracy, int effect_change, int pp, short priority, int power,
                ContestComboSets contest_combo_sets, ContestType contest_type, ContestEffect contest_effect,
                MoveDamageClass damage_class, ArrayList<VerboseEffect> effect_entries,
                ArrayList<AbilityEffectChange> effect_changes, ArrayList<MoveFlavorText> flavor_text_entries,
                Generation generation, ArrayList<MachineVersionDetail> machines, MoveMetaData meta,
                ArrayList<Name> names, ArrayList<PastMoveStatValues> past_values,
                ArrayList<MoveStatChange> stat_changes, SuperContestEffect super_contest_effect,
                MoveTarget target, Type type){

        this.url = url;
        this.name = name;
        this.id = id;
        this.accuracy = accuracy;
        this.effect_change = effect_change;
        this.pp = pp;
        this.priority = priority;
        this.power = power;
        this.contest_combo_sets = contest_combo_sets;
        this.contest_type = contest_type;
        this.contest_effect = contest_effect;
        this.damage_class = damage_class;
        this.effect_entries = effect_entries;
        this.effect_changes = effect_changes;
        this.flavor_text_entries = flavor_text_entries;
        this.generation = generation;
        this.machines = machines;
        this.meta = meta;
        this.names = names;
        this.past_values = past_values;
        this.stat_changes = stat_changes;
        this.super_contest_effect = super_contest_effect;
        this.target = target;
        this.type = type;

    }

    public int getId() {
        return id;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public int getEffectChange() {
        return effect_change;
    }

    public int getPP() {
        return pp;
    }

    public short getPriority() {
        return priority;
    }

    public int getPower() {
        return power;
    }

    public ContestComboSets getContestComboSets() {
        return contest_combo_sets;
    }

    public ContestType getContestType() {
        return contest_type;
    }

    public ContestEffect getContestEffect() {
        return contest_effect;
    }

    public MoveDamageClass getDamageClass() {
        return damage_class;
    }

    public ArrayList<VerboseEffect> getEffectEntries() {
        return effect_entries;
    }

    public ArrayList<AbilityEffectChange> getEffectChanges() {
        return effect_changes;
    }

    public ArrayList<MoveFlavorText> getFlavorTextEntries() {
        return flavor_text_entries;
    }

    public Generation getGeneration() {
        return generation;
    }

    public ArrayList<MachineVersionDetail> getMachines() {
        return machines;
    }

    public MoveMetaData getMeta() {
        return meta;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ArrayList<PastMoveStatValues> getPastValues() {
        return past_values;
    }

    public ArrayList<MoveStatChange> getStatChanges() {
        return stat_changes;
    }

    public SuperContestEffect getSuperContestEffect() {
        return super_contest_effect;
    }

    public MoveTarget getTarget() {
        return target;
    }

    public Type getType() {
        return type;
    }
}
