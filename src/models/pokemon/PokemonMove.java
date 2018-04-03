package models.pokemon;
public class PokemonMove {
	// The move the Pokémon can learn
	private models.moves.Move move;

	// The details of the version in which the Pokémon can learn the move
	private java.util.ArrayList<models.pokemon.PokemonMoveVersion> version_group_details;

	public models.moves.Move getMove() {
		return move;
	}

	public PokemonMove setMove(models.moves.Move move) {
		this.move = move;
		return this;
	}

	public java.util.ArrayList<models.pokemon.PokemonMoveVersion> getVersionGroupDetails() {
		return version_group_details;
	}

	public PokemonMove setVersionGroupDetails(java.util.ArrayList<models.pokemon.PokemonMoveVersion> version_group_details) {
		this.version_group_details = version_group_details;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}