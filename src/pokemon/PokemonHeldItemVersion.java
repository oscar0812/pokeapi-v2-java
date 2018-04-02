package pokemon;
public class PokemonHeldItemVersion {
	// The version in which the item is held
	private games.Version version;

	// How often the item is held
	private int rarity;

	public games.Version getVersion() {
		return version;
	}

	public PokemonHeldItemVersion setVersion(games.Version version) {
		this.version = version;
		return this;
	}

	public int getRarity() {
		return rarity;
	}

	public PokemonHeldItemVersion setRarity(int rarity) {
		this.rarity = rarity;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}