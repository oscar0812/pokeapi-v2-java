package common;
public class GenerationGameIndex {
	// The internal id of an API resource within game data
	private int game_index;

	// The generation relevent to this game index
	private games.Generation generation;

	public int getGameIndex() {
		return game_index;
	}

	public GenerationGameIndex setGameIndex(int game_index) {
		this.game_index = game_index;
		return this;
	}

	public games.Generation getGeneration() {
		return generation;
	}

	public GenerationGameIndex setGeneration(games.Generation generation) {
		this.generation = generation;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}