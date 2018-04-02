package pokemon;
public class PokemonStat {
	// The stat the Pokémon has
	private pokemon.Stat stat;

	// The effort points (EV) the Pokémon has in the stat
	private int effort;

	// The base value of the stst
	private int base_stat;

	public pokemon.Stat getStat() {
		return stat;
	}

	public PokemonStat setStat(pokemon.Stat stat) {
		this.stat = stat;
		return this;
	}

	public int getEffort() {
		return effort;
	}

	public PokemonStat setEffort(int effort) {
		this.effort = effort;
		return this;
	}

	public int getBaseStat() {
		return base_stat;
	}

	public PokemonStat setBaseStat(int base_stat) {
		this.base_stat = base_stat;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}