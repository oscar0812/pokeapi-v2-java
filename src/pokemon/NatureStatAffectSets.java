package pokemon;
public class NatureStatAffectSets {
	// A list of natures and how they change the referenced stat
	private java.util.ArrayList<pokemon.Nature> increase;

	// A list of nature sand how they change the referenced stat
	private java.util.ArrayList<pokemon.Nature> decrease;

	public java.util.ArrayList<pokemon.Nature> getIncrease() {
		return increase;
	}

	public NatureStatAffectSets setIncrease(java.util.ArrayList<pokemon.Nature> increase) {
		this.increase = increase;
		return this;
	}

	public java.util.ArrayList<pokemon.Nature> getDecrease() {
		return decrease;
	}

	public NatureStatAffectSets setDecrease(java.util.ArrayList<pokemon.Nature> decrease) {
		this.decrease = decrease;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}