package models.contests;
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
    "models.moves": [{
        "name": "agility",
        "url": "http://pokeapi.co/api/v2/move/97/"
    }]
}
*/

public class SuperContestEffect extends models.common.APIResource {
	// The identifier for this super contest effect models.resource
	private int id;

	// The level of appeal this super contest effect has
	private int appeal;

	// The flavor text of this super contest effect listed in different languages
	private java.util.ArrayList<models.common.FlavorText> flavor_text_entries;

	// A list of models.moves that have the effect when used in super models.contests
	private java.util.ArrayList<models.moves.Move> moves;

	private static SuperContestEffect get(String url) {
		String json = api.Information.fromInternet(url);
		SuperContestEffect obj = new com.google.gson.Gson().fromJson(json, SuperContestEffect.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static SuperContestEffect getById(int id) {
		return get("https://pokeapi.co/api/v2/super-contest-effect/" + id);
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

	public java.util.ArrayList<models.common.FlavorText> getFlavorTextEntries() {
		return flavor_text_entries;
	}

	public SuperContestEffect setFlavorTextEntries(java.util.ArrayList<models.common.FlavorText> flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
		return this;
	}

	public java.util.ArrayList<models.moves.Move> getMoves() {
		return moves;
	}

	public SuperContestEffect setMoves(java.util.ArrayList<models.moves.Move> moves) {
		this.moves = moves;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}