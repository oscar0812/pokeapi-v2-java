package models.moves;
public class ContestComboSets {
	// A detail of moves this move can be used before or after, granting additional appeal points in contests
	private models.moves.ContestComboDetail normal;

	// A detail of moves this move can be used before or after, granting additional appeal points in super contests
	@com.fasterxml.jackson.annotation.JsonProperty("super")
	private models.moves.ContestComboDetail super_val;

	public models.moves.ContestComboDetail getNormal() {
		return normal;
	}

	public ContestComboSets setNormal(models.moves.ContestComboDetail normal) {
		this.normal = normal;
		return this;
	}

	public models.moves.ContestComboDetail getSuperVal() {
		return super_val;
	}

	public ContestComboSets setSuperVal(models.moves.ContestComboDetail super_val) {
		this.super_val = super_val;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}