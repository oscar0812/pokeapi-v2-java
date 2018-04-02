package pokemon;
public class PokemonMove {
	// The move the Pokémon can learn
	private moves.Move move;

	// The details of the version in which the Pokémon can learn the move
	private java.util.ArrayList<pokemon.PokemonMoveVersion> version_group_details;

	public moves.Move getMove() {
		return move;
	}

	public PokemonMove setMove(moves.Move move) {
		this.move = move;
		return this;
	}

	public java.util.ArrayList<pokemon.PokemonMoveVersion> getVersionGroupDetails() {
		return version_group_details;
	}

	public PokemonMove setVersionGroupDetails(java.util.ArrayList<pokemon.PokemonMoveVersion> version_group_details) {
		this.version_group_details = version_group_details;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}