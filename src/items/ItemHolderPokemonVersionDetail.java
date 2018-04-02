package items;
public class ItemHolderPokemonVersionDetail {
	// How often this Pokémon holds this item in this version
	private String rarity;

	// The version that this item is held in by the Pokémon
	private games.Version version;

	public String getRarity() {
		return rarity;
	}

	public ItemHolderPokemonVersionDetail setRarity(String rarity) {
		this.rarity = rarity;
		return this;
	}

	public games.Version getVersion() {
		return version;
	}

	public ItemHolderPokemonVersionDetail setVersion(games.Version version) {
		this.version = version;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}