package models.berries;
/*
{
    "id": 1,
    "name": "very-soft",
    "models.berries": [{
        "name": "pecha",
        "url": "http://pokeapi.co/api/v2/berry/3/"
    }],
    "names": [{
        "name": "Very Soft",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }]
}
*/

public class BerryFirmness extends models.common.NamedAPIResource {
	// The identifier for this berry firmness models.resource
	private int id;

	// A list of the models.berries with this firmness
	private java.util.ArrayList<models.berries.Berry> berries;

	// The name of this berry firmness listed in different languages
	private java.util.ArrayList<models.common.Name> names;

	private static BerryFirmness get(String url) {
		String json = api.Information.fromInternet(url);
		BerryFirmness obj = new com.google.gson.Gson().fromJson(json, BerryFirmness.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static BerryFirmness getById(int id) {
		return get("https://pokeapi.co/api/v2/berry-firmness/" + id);
	}

	public static BerryFirmness getByName(String name) {
		return get("https://pokeapi.co/api/v2/berry-firmness/" + name);
	}

	public int getId() {
		return id;
	}

	public BerryFirmness setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<models.berries.Berry> getBerries() {
		return berries;
	}

	public BerryFirmness setBerries(java.util.ArrayList<models.berries.Berry> berries) {
		this.berries = berries;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getNames() {
		return names;
	}

	public BerryFirmness setNames(java.util.ArrayList<models.common.Name> names) {
		this.names = names;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}