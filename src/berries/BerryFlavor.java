package berries;
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

public class BerryFlavor extends common.NamedAPIResource {
	// The identifier for this berry flavor resource
	private int id;

	// A list of the berries with this flavor
	private java.util.ArrayList<berries.FlavorBerryMap> berries;

	// The contest type that correlates with this berry flavor
	private contests.ContestType contest_type;

	// The name of this berry flavor listed in different languages
	private java.util.ArrayList<common.Name> names;

	public static BerryFlavor getById(int id) {
		String url = "https://pokeapi.co/api/v2/berry-flavor/" + id;
		String json = tools.Internet.get(url);
		BerryFlavor obj = new com.google.gson.Gson().fromJson(json, BerryFlavor.class);
		return obj;
	}

	public static BerryFlavor getByName(String name) {
		String url = "https://pokeapi.co/api/v2/berry-flavor/" + name;
		String json = tools.Internet.get(url);
		BerryFlavor obj = new com.google.gson.Gson().fromJson(json, BerryFlavor.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public BerryFlavor setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<berries.FlavorBerryMap> getBerries() {
		return berries;
	}

	public BerryFlavor setBerries(java.util.ArrayList<berries.FlavorBerryMap> berries) {
		this.berries = berries;
		return this;
	}

	public contests.ContestType getContestType() {
		return contest_type;
	}

	public BerryFlavor setContestType(contests.ContestType contest_type) {
		this.contest_type = contest_type;
		return this;
	}

	public java.util.ArrayList<common.Name> getNames() {
		return names;
	}

	public BerryFlavor setNames(java.util.ArrayList<common.Name> names) {
		this.names = names;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}