package models.pokemon;
public class NaturePokeathlonStatAffectSets {
	// A list of natures and how they change the referenced Pokéathlon stat
	private java.util.ArrayList<models.pokemon.NaturePokeathlonStatAffect> increase;

	// A list of natures and how they change the referenced Pokéathlon stat
	private java.util.ArrayList<models.pokemon.NaturePokeathlonStatAffect> decrease;

	public java.util.ArrayList<models.pokemon.NaturePokeathlonStatAffect> getIncrease() {
		return increase;
	}

	public NaturePokeathlonStatAffectSets setIncrease(java.util.ArrayList<models.pokemon.NaturePokeathlonStatAffect> increase) {
		this.increase = increase;
		return this;
	}

	public java.util.ArrayList<models.pokemon.NaturePokeathlonStatAffect> getDecrease() {
		return decrease;
	}

	public NaturePokeathlonStatAffectSets setDecrease(java.util.ArrayList<models.pokemon.NaturePokeathlonStatAffect> decrease) {
		this.decrease = decrease;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}