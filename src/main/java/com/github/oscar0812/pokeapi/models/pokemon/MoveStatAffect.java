/* Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles. */

package com.github.oscar0812.pokeapi.models.pokemon;

import com.github.oscar0812.pokeapi.models.moves.Move;

public class MoveStatAffect {
	// The maximum amount of change to the referenced stat.
	private int change;

	// The move causing the change.
	private Move move;

	public int getChange() {
		return change;
	}

	public MoveStatAffect setChange(int change) {
		this.change = change;
		return this;
	}

	public Move getMove() {
		if(!move.getIsFetched()) {
			move = move.get();
		}
		return move;
	}

	public MoveStatAffect setMove(Move move) {
		this.move = move;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}