package contests;
/*
{
    "id": 1,
    "appeal": 2,
    "flavor_text_entries": [{
        "flavor_text": "Enables the user to perform first in the next turn.",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }],
    "moves": [{
        "name": "agility",
        "url": "http://pokeapi.co/api/v2/move/97/"
    }]
}
*/

public class SuperContestEffect extends common.APIResource {
	// The identifier for this super contest effect resource
	private int id;

	// The level of appeal this super contest effect has
	private int appeal;

	// The flavor text of this super contest effect listed in different languages
	private java.util.ArrayList<common.FlavorText> flavor_text_entries;

	// A list of moves that have the effect when used in super contests
	private java.util.ArrayList<moves.Move> moves;

	public static SuperContestEffect getById(int id) {
		String url = "https://pokeapi.co/api/v2/super-contest-effect/" + id;
		String json = tools.Internet.get(url);
		SuperContestEffect obj = new com.google.gson.Gson().fromJson(json, SuperContestEffect.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public SuperContestEffect setId(int id) {
		this.id = id;
		return this;
	}

	public int getAppeal() {
		return appeal;
	}

	public SuperContestEffect setAppeal(int appeal) {
		this.appeal = appeal;
		return this;
	}

	public java.util.ArrayList<common.FlavorText> getFlavorTextEntries() {
		return flavor_text_entries;
	}

	public SuperContestEffect setFlavorTextEntries(java.util.ArrayList<common.FlavorText> flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
		return this;
	}

	public java.util.ArrayList<moves.Move> getMoves() {
		return moves;
	}

	public SuperContestEffect setMoves(java.util.ArrayList<moves.Move> moves) {
		this.moves = moves;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}