/* Contest effects refer to the effects of moves when used in contests. */

package pokeapi.bittle.models.contests;
/*
{
  "id": 1,
  "appeal": 4,
  "jam": 0,
  "effect_entries": [
    {
      "effect": "Gives a high number of appeal points wth no other effects.",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "flavor_text_entries": [
    {
      "flavor_text": "A highly appealing move.",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ]
}
*/

public class ContestEffect extends pokeapi.bittle.models.utility.APIResource {
	// The identifier for this resource.
	private int id;

	// The base number of hearts the user of this move gets.
	private int appeal;

	// The base number of hearts the user's opponent loses.
	private int jam;

	// The result of this contest effect listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Effect> effect_entries;

	// The flavor text of this contest effect listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.FlavorText> flavor_text_entries;

	public int getId() {
		return id;
	}

	public ContestEffect setId(int id) {
		this.id = id;
		return this;
	}

	public int getAppeal() {
		return appeal;
	}

	public ContestEffect setAppeal(int appeal) {
		this.appeal = appeal;
		return this;
	}

	public int getJam() {
		return jam;
	}

	public ContestEffect setJam(int jam) {
		this.jam = jam;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Effect> getEffectEntries() {
		return effect_entries;
	}

	public ContestEffect setEffectEntries(java.util.ArrayList<pokeapi.bittle.models.utility.Effect> effect_entries) {
		this.effect_entries = effect_entries;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.FlavorText> getFlavorTextEntries() {
		return flavor_text_entries;
	}

	public ContestEffect setFlavorTextEntries(java.util.ArrayList<pokeapi.bittle.models.utility.FlavorText> flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
		return this;
	}

	private static ContestEffect get(String url) {
		ContestEffect obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), ContestEffect.class);
		obj.setIsFetched(true);
		return obj;
	}

	public ContestEffect get() {
		return ContestEffect.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.APIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.APIResourceList.getList("contest-effect", limit, offset);
	}

	public static ContestEffect getById(int id) {
		return get("https://pokeapi.co/api/v2/contest-effect/" + id);
	}
}