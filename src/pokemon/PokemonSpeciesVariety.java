package pokemon;
public class PokemonSpeciesVariety {
	// Whether this variety is the default variety
	private boolean is_default;

	// The Pokémon variety
	private pokemon.Pokemon pokemon;

	public boolean isDefault() {
		return is_default;
	}

	public PokemonSpeciesVariety setIsDefault(boolean is_default) {
		this.is_default = is_default;
		return this;
	}

	public pokemon.Pokemon getPokemon() {
		return pokemon;
	}

	public PokemonSpeciesVariety setPokemon(pokemon.Pokemon pokemon) {
		this.pokemon = pokemon;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}