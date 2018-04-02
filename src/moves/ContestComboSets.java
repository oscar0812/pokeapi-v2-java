package moves;
public class ContestComboSets {
	// A detail of moves this move can be used before or after, granting additional appeal points in contests
	private moves.ContestComboDetail normal;

	// A detail of moves this move can be used before or after, granting additional appeal points in super contests
	@com.fasterxml.jackson.annotation.JsonProperty("super")
	private moves.ContestComboDetail super_val;

	public moves.ContestComboDetail getNormal() {
		return normal;
	}

	public ContestComboSets setNormal(moves.ContestComboDetail normal) {
		this.normal = normal;
		return this;
	}

	public moves.ContestComboDetail getSuperVal() {
		return super_val;
	}

	public ContestComboSets setSuperVal(moves.ContestComboDetail super_val) {
		this.super_val = super_val;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}