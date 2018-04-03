package models.berries;
/*
{
    "id": 1,
    "name": "spicy",
    "berries": [{
        "potency": 10,
        "berry": {
            "name": "rowap",
            "url": "http://pokeapi.co/api/v2/berry/64/"
        }
    }],
    "contest_type": {
        "name": "cool",
        "url": "http://pokeapi.co/api/v2/contest-type/1/"
    },
    "names": [{
        "name": "Spicy",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }]
}
*/

public class BerryFlavor extends models.common.NamedAPIResource {
	// The identifier for this berry flavor resource
	private int id;

	// A list of the berries with this flavor
	private java.util.ArrayList<models.berries.FlavorBerryMap> berries;

	// The contest type that correlates with this berry flavor
	private models.contests.ContestType contest_type;

	// The name of this berry flavor listed in different languages
	private java.util.ArrayList<models.common.Name> names;

	private static BerryFlavor get(String url) {
		String json = api.Information.fromInternet(url);
		BerryFlavor obj = new com.google.gson.Gson().fromJson(json, BerryFlavor.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static BerryFlavor getById(int id) {
		return get("https://pokeapi.co/api/v2/berry-flavor/" + id);
	}

	public static BerryFlavor getByName(String name) {
		return get("https://pokeapi.co/api/v2/berry-flavor/" + name);
	}

	public int getId() {
		return id;
	}

	public BerryFlavor setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<models.berries.FlavorBerryMap> getBerries() {
		return berries;
	}

	public BerryFlavor setBerries(java.util.ArrayList<models.berries.FlavorBerryMap> berries) {
		this.berries = berries;
		return this;
	}

	public models.contests.ContestType getContestType() {
		return contest_type;
	}

	public BerryFlavor setContestType(models.contests.ContestType contest_type) {
		this.contest_type = contest_type;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getNames() {
		return names;
	}

	public BerryFlavor setNames(java.util.ArrayList<models.common.Name> names) {
		this.names = names;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}