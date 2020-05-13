/* Super contest effects refer to the effects of moves when used in super contests. */

package pokeapi.bittle.models.contests;
/*
{
  "id": 1,
  "appeal": 2,
  "flavor_text_entries": [
    {
      "flavor_text": "Enables the user to perform first in the next turn.",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "moves": [
    {
      "name": "agility",
      "url": "https://pokeapi.co/api/v2/move/97/"
    }
  ]
}
*/

public class SuperContestEffect extends pokeapi.bittle.models.utility.APIResource {
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

	public java.util.ArrayList<pokeapi.bittle.models.utility.FlavorText> getFlavorTextEntries() {
				return flavor_text_entries;
	}

	public SuperContestEffect setFlavorTextEntries(java.util.ArrayList<pokeapi.bittle.models.utility.FlavorText> flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.moves.Move> getMoves() {
				return moves;
	}

	public SuperContestEffect setMoves(java.util.ArrayList<pokeapi.bittle.models.moves.Move> moves) {
		this.moves = moves;
		return this;
	}

	// The identifier for this resource.
	private int id;

	// The level of appeal this super contest effect has.
	private int appeal;

	// The flavor text of this super contest effect listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.FlavorText> flavor_text_entries;

	// A list of moves that have the effect when used in super contests.
	private java.util.ArrayList<pokeapi.bittle.models.moves.Move> moves;

	private static SuperContestEffect get(String url) {
		SuperContestEffect obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), SuperContestEffect.class);
		obj.setIsFetched(true);
		return obj;
	}

	public SuperContestEffect get() {
		return SuperContestEffect.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.APIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.APIResourceList.getList("super-contest-effect", limit, offset);
	}

	public static SuperContestEffect getById(int id) {
		return get("https://pokeapi.co/api/v2/super-contest-effect/" + id);
	}
}