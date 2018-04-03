package models.pokemon;
public class TypePokemon {
	// The order the Pokémon's types are listed in
	private int slot;

	// The Pokémon that has the referenced type
	private models.pokemon.Pokemon pokemon;

	public int getSlot() {
		return slot;
	}

	public TypePokemon setSlot(int slot) {
		this.slot = slot;
		return this;
	}

	public models.pokemon.Pokemon getPokemon() {
		return pokemon;
	}

	public TypePokemon setPokemon(models.pokemon.Pokemon pokemon) {
		this.pokemon = pokemon;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}