/* Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas. */

package com.github.oscar0812.pokeapi.models.moves;

import com.github.oscar0812.pokeapi.models.contests.ContestEffect;
import com.github.oscar0812.pokeapi.models.contests.ContestType;
import com.github.oscar0812.pokeapi.models.contests.SuperContestEffect;
import com.github.oscar0812.pokeapi.models.games.Generation;
import com.github.oscar0812.pokeapi.models.pokemon.AbilityEffectChange;
import com.github.oscar0812.pokeapi.models.pokemon.Type;
import com.github.oscar0812.pokeapi.models.resources.NamedAPIResourceList;
import com.github.oscar0812.pokeapi.models.utility.MachineVersionDetail;
import com.github.oscar0812.pokeapi.models.utility.Name;
import com.github.oscar0812.pokeapi.models.utility.NamedAPIResource;
import com.github.oscar0812.pokeapi.models.utility.VerboseEffect;
import com.github.oscar0812.pokeapi.utils.Information;
import java.util.ArrayList;

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