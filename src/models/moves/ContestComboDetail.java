package models.moves;
public class ContestComboDetail {
	// A list of moves to use before this move
	private java.util.ArrayList<models.moves.Move> use_before;

	// A list of moves to use after this move
	private java.util.ArrayList<models.moves.Move> use_after;

	public java.util.ArrayList<models.moves.Move> getUseBefore() {
		return use_before;
	}

	public ContestComboDetail setUseBefore(java.util.ArrayList<models.moves.Move> use_before) {
		this.use_before = use_before;
		return this;
	}

	public java.util.ArrayList<models.moves.Move> getUseAfter() {
		return use_after;
	}

	public ContestComboDetail setUseAfter(java.util.ArrayList<models.moves.Move> use_after) {
		this.use_after = use_after;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}