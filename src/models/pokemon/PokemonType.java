package models.pokemon;
public class PokemonType {
	// The order the Pokémon's types are listed in
	private int slot;

	// The type the referenced Pokémon has
	private models.pokemon.Type type;

	public int getSlot() {
		return slot;
	}

	public PokemonType setSlot(int slot) {
		this.slot = slot;
		return this;
	}

	public models.pokemon.Type getType() {
		return type;
	}

	public PokemonType setType(models.pokemon.Type type) {
		this.type = type;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}