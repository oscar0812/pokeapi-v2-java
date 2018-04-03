package models.contests;
/*
{
    "id": 1,
    "appeal": 4,
    "jam": 0,
    "effect_entries": [{
        "effect": "Gives a high number of appeal points wth no other effects.",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }],
    "flavor_text_entries": [{
        "flavor_text": "A highly appealing move.",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }]
}
*/

public class ContestEffect extends models.common.APIResource {
	// The identifier for this contest type models.resource
	private int id;

	// The base number of hearts the user of this move gets
	private int appeal;

	// The base number of hearts the user's opponent loses
	private int jam;

	// The result of this contest effect listed in different languages
	private java.util.ArrayList<models.common.Effect> effect_entries;

	// The flavor text of this contest effect listed in different languages
	private java.util.ArrayList<models.common.FlavorText> flavor_text_entries;

	private static ContestEffect get(String url) {
		String json = api.Information.fromInternet(url);
		ContestEffect obj = new com.google.gson.Gson().fromJson(json, ContestEffect.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static ContestEffect getById(int id) {
		return get("https://pokeapi.co/api/v2/contest-effect/" + id);
	}

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

	public java.util.ArrayList<models.common.Effect> getEffectEntries() {
		return effect_entries;
	}

	public ContestEffect setEffectEntries(java.util.ArrayList<models.common.Effect> effect_entries) {
		this.effect_entries = effect_entries;
		return this;
	}

	public java.util.ArrayList<models.common.FlavorText> getFlavorTextEntries() {
		return flavor_text_entries;
	}

	public ContestEffect setFlavorTextEntries(java.util.ArrayList<models.common.FlavorText> flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}