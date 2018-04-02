package pokemon;
public class MoveStatAffectSets {
	// A list of moves and how they change the referenced stat
	private java.util.ArrayList<pokemon.MoveStatAffect> increase;

	// A list of moves and how they change the referenced stat
	private java.util.ArrayList<pokemon.MoveStatAffect> decrease;

	public java.util.ArrayList<pokemon.MoveStatAffect> getIncrease() {
		return increase;
	}

	public MoveStatAffectSets setIncrease(java.util.ArrayList<pokemon.MoveStatAffect> increase) {
		this.increase = increase;
		return this;
	}

	public java.util.ArrayList<pokemon.MoveStatAffect> getDecrease() {
		return decrease;
	}

	public MoveStatAffectSets setDecrease(java.util.ArrayList<pokemon.MoveStatAffect> decrease) {
		this.decrease = decrease;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}