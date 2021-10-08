/* Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See Bulbapedia for greater detail. */

package com.github.oscar0812.pokeapi.models.pokemon;

import com.github.oscar0812.pokeapi.models.moves.Move;
import java.util.ArrayList;

public class PokemonMove {
	// The move the Pokémon can learn.
	private Move move;

	// The details of the version in which the Pokémon can learn the move.
	private ArrayList<PokemonMoveVersion> version_group_details;

	public Move getMove() {
		if(!move.getIsFetched()) {
			move = move.get();
		}
		return move;
	}

	public PokemonMove setMove(Move move) {
		this.move = move;
		return this;
	}

	public ArrayList<PokemonMoveVersion> getVersionGroupDetails() {
		return version_group_details;
	}

	public PokemonMove setVersionGroupDetails(ArrayList<PokemonMoveVersion> version_group_details) {
		this.version_group_details = version_group_details;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}