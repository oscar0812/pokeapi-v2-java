package models.pokemon;
public class PokemonMoveVersion {
	// The method by which the move is learned
	private models.moves.MoveLearnMethod move_learn_method;

	// The version group in which the move is learned
	private models.games.VersionGroup version_group;

	// The minimum level to learn the move
	private int level_learned_at;

	public models.moves.MoveLearnMethod getMoveLearnMethod() {
		return move_learn_method;
	}

	public PokemonMoveVersion setMoveLearnMethod(models.moves.MoveLearnMethod move_learn_method) {
		this.move_learn_method = move_learn_method;
		return this;
	}

	public models.games.VersionGroup getVersionGroup() {
		return version_group;
	}

	public PokemonMoveVersion setVersionGroup(models.games.VersionGroup version_group) {
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