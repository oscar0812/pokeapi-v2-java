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

import java.util.ArrayList;
import pokeapi.bittle.models.resources.APIResourceList;
import pokeapi.bittle.models.utility.APIResource;
import pokeapi.bittle.models.utility.Effect;
import pokeapi.bittle.models.utility.FlavorText;
import pokeapi.bittle.utils.Information;

public class ContestEffect extends APIResource {
	// The identifier for this resource.
	private int id;

	// The base number of hearts the user of this move gets.
	private int appeal;

	// The base number of hearts the user's opponent loses.
	private int jam;

	// The result of this contest effect listed in different languages.
	private ArrayList<Effect> effect_entries;

	// The flavor text of this contest effect listed in different languages.
	private ArrayList<FlavorText> flavor_text_entries;

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

	public ArrayList<Effect> getEffectEntries() {
		return effect_entries;
	}

	public ContestEffect setEffectEntries(ArrayList<Effect> effect_entries) {
		this.effect_entries = effect_entries;
		return this;
	}

	public ArrayList<FlavorText> getFlavorTextEntries() {
		return flavor_text_entries;
	}

	public ContestEffect setFlavorTextEntries(ArrayList<FlavorText> flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
		return this;
	}

	private static ContestEffect get(String url) {
		ContestEffect obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), ContestEffect.class);
		obj.setIsFetched(true);
		return obj;
	}

	public ContestEffect get() {
		return ContestEffect.get(this.getUrl());
	}

	public static APIResourceList getList(int limit, int offset) {
		 return APIResourceList.getList("contest-effect", limit, offset);
	}

	public static ContestEffect getById(int id) {
		return get("https://pokeapi.co/api/v2/contest-effect/" + id);
	}
}