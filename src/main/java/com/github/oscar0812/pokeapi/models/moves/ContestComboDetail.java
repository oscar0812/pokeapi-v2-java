/* Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas. */

package com.github.oscar0812.pokeapi.models.moves;

import java.util.ArrayList;

public class ContestComboDetail {
	// A list of moves to use before this move.
	private ArrayList<Move> use_before;

	// A list of moves to use after this move.
	private ArrayList<Move> use_after;

	public ArrayList<Move> getUseBefore() {
		return use_before;
	}

	public ContestComboDetail setUseBefore(ArrayList<Move> use_before) {
		this.use_before = use_before;
		return this;
	}

	public ArrayList<Move> getUseAfter() {
		return use_after;
	}

	public ContestComboDetail setUseAfter(ArrayList<Move> use_after) {
		this.use_after = use_after;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}