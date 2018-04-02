package contests;
/*
{
    "id": 1,
    "name": "cool",
    "berry_flavor": {
        "name": "spicy",
        "url": "http://pokeapi.co/api/v2/berry-flavor/1/"
    },
    "names": [{
        "name": "Cool",
        "color": "Red",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }]
}
*/

public class ContestType extends common.NamedAPIResource {
	// The identifier for this contest type resource
	private int id;

	// The berry flavor that correlates with this contest type
	private berries.BerryFlavor berry_flavor;

	// The name of this contest type listed in different languages
	private java.util.ArrayList<contests.ContestName> names;

	public static ContestType getById(int id) {
		String url = "https://pokeapi.co/api/v2/contest-type/" + id;
		String json = tools.Internet.get(url);
		ContestType obj = new com.google.gson.Gson().fromJson(json, ContestType.class);
		return obj;
	}

	public static ContestType getByName(String name) {
		String url = "https://pokeapi.co/api/v2/contest-type/" + name;
		String json = tools.Internet.get(url);
		ContestType obj = new com.google.gson.Gson().fromJson(json, ContestType.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public ContestType setId(int id) {
		this.id = id;
		return this;
	}

	public berries.BerryFlavor getBerryFlavor() {
		return berry_flavor;
	}

	public ContestType setBerryFlavor(berries.BerryFlavor berry_flavor) {
		this.berry_flavor = berry_flavor;
		return this;
	}

	public java.util.ArrayList<contests.ContestName> getNames() {
		return names;
	}

	public ContestType setNames(java.util.ArrayList<contests.ContestName> names) {
		this.names = names;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}