/* Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas. */

package com.github.oscar0812.pokeapi.models.moves;

import com.github.oscar0812.pokeapi.models.games.VersionGroup;
import com.github.oscar0812.pokeapi.models.pokemon.Type;
import com.github.oscar0812.pokeapi.models.utility.VerboseEffect;
import java.util.ArrayList;

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

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}