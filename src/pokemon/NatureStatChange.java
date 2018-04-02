package pokemon;
public class NatureStatChange {
	// The amount of change
	private int max_change;

	// The stat being affected
	private pokemon.PokeathlonStat pokeathlon_stat;

	public int getMaxChange() {
		return max_change;
	}

	public NatureStatChange setMaxChange(int max_change) {
		this.max_change = max_change;
		return this;
	}

	public pokemon.PokeathlonStat getPokeathlonStat() {
		return pokeathlon_stat;
	}

	public NatureStatChange setPokeathlonStat(pokemon.PokeathlonStat pokeathlon_stat) {
		this.pokeathlon_stat = pokeathlon_stat;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}