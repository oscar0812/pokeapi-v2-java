/* Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See Bulbapedia for greater detail. */

package com.github.oscar0812.pokeapi.models.pokemon;

import com.github.oscar0812.pokeapi.models.games.VersionGroup;
import com.github.oscar0812.pokeapi.models.moves.MoveLearnMethod;

public class PokemonMoveVersion {
	// The method by which the move is learned.
	private MoveLearnMethod move_learn_method;

	// The version group in which the move is learned.
	private VersionGroup version_group;

	// The minimum level to learn the move.
	private int level_learned_at;

	public MoveLearnMethod getMoveLearnMethod() {
		if(!move_learn_method.getIsFetched()) {
			move_learn_method = move_learn_method.get();
		}
		return move_learn_method;
	}

	public PokemonMoveVersion setMoveLearnMethod(MoveLearnMethod move_learn_method) {
		this.move_learn_method = move_learn_method;
		return this;
	}

	public VersionGroup getVersionGroup() {
		if(!version_group.getIsFetched()) {
			version_group = version_group.get();
		}
		return version_group;
	}

	public PokemonMoveVersion setVersionGroup(VersionGroup version_group) {
		this.version_group = version_group;
		return this;
	}

	public int getLevelLearnedAt() {
		return level_learned_at;
	}

	public PokemonMoveVersion setLevelLearnedAt(int level_learned_at) {
		this.level_learned_at = level_learned_at;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}