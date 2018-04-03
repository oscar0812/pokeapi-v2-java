package models.pokemon;
public class PokemonSpeciesDexEntry {
	// The index number within the Pokédex
	private int entry_number;

	// The Pokédex the referenced Pokémon species can be found in
	private models.games.Pokedex pokedex;

	public int getEntryNumber() {
		return entry_number;
	}

	public PokemonSpeciesDexEntry setEntryNumber(int entry_number) {
		this.entry_number = entry_number;
		return this;
	}

	public models.games.Pokedex getPokedex() {
		return pokedex;
	}

	public PokemonSpeciesDexEntry setPokedex(models.games.Pokedex pokedex) {
		this.pokedex = pokedex;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}