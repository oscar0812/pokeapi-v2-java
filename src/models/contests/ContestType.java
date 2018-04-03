package models.contests;
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

public class ContestType extends models.common.NamedAPIResource {
	// The identifier for this contest type models.resource
	private int id;

	// The berry flavor that correlates with this contest type
	private models.berries.BerryFlavor berry_flavor;

	// The name of this contest type listed in different languages
	private java.util.ArrayList<models.contests.ContestName> names;

	private static ContestType get(String url) {
		String json = api.Information.fromInternet(url);
		ContestType obj = new com.google.gson.Gson().fromJson(json, ContestType.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static ContestType getById(int id) {
		return get("https://pokeapi.co/api/v2/contest-type/" + id);
	}

	public static ContestType getByName(String name) {
		return get("https://pokeapi.co/api/v2/contest-type/" + name);
	}

	public int getId() {
		return id;
	}

	public ContestType setId(int id) {
		this.id = id;
		return this;
	}

	public models.berries.BerryFlavor getBerryFlavor() {
		return berry_flavor;
	}

	public ContestType setBerryFlavor(models.berries.BerryFlavor berry_flavor) {
		this.berry_flavor = berry_flavor;
		return this;
	}

	public java.util.ArrayList<models.contests.ContestName> getNames() {
		return names;
	}

	public ContestType setNames(java.util.ArrayList<models.contests.ContestName> names) {
		this.names = names;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}