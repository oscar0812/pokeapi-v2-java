package moves;
public class MoveStatChange {
	// The amount of change
	private int change;

	// The stat being affected
	private pokemon.Stat stat;

	public int getChange() {
		return change;
	}

	public MoveStatChange setChange(int change) {
		this.change = change;
		return this;
	}

	public pokemon.Stat getStat() {
		return stat;
	}

	public MoveStatChange setStat(pokemon.Stat stat) {
		this.stat = stat;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}