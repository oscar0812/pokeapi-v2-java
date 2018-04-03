package models.games;
public class PokemonEntry {
	// The index of this Pokémon species entry within the Pokédex
	private int entry_number;

	// The Pokémon species being encountered
	private models.pokemon.PokemonSpecies pokemon_species;

	public int getEntryNumber() {
		return entry_number;
	}

	public PokemonEntry setEntryNumber(int entry_number) {
		this.entry_number = entry_number;
		return this;
	}

	public models.pokemon.PokemonSpecies getPokemonSpecies() {
		return pokemon_species;
	}

	public PokemonEntry setPokemonSpecies(models.pokemon.PokemonSpecies pokemon_species) {
		this.pokemon_species = pokemon_species;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}