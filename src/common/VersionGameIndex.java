package common;
public class VersionGameIndex {
	// The internal id of an API resource within game data
	private int game_index;

	// The version relevent to this game index
	private games.Version version;

	public int getGameIndex() {
		return game_index;
	}

	public VersionGameIndex setGameIndex(int game_index) {
		this.game_index = game_index;
		return this;
	}

	public games.Version getVersion() {
		return version;
	}

	public VersionGameIndex setVersion(games.Version version) {
		this.version = version;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}