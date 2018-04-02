package pokemon;
public class PokemonSpeciesGender {
	// The chance of this Pokémon being female, in eighths; or -1 for genderless
	private int rate;

	// A Pokémon species that can be the referenced gender
	private pokemon.PokemonSpecies pokemon_species;

	public int getRate() {
		return rate;
	}

	public PokemonSpeciesGender setRate(int rate) {
		this.rate = rate;
		return this;
	}

	public pokemon.PokemonSpecies getPokemonSpecies() {
		return pokemon_species;
	}

	public PokemonSpeciesGender setPokemonSpecies(pokemon.PokemonSpecies pokemon_species) {
		this.pokemon_species = pokemon_species;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}