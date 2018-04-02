package berries;
/*
{
    "id": 1,
    "name": "very-soft",
    "berries": [{
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

public class BerryFirmness extends common.NamedAPIResource {
	// The identifier for this berry firmness resource
	private int id;

	// A list of the berries with this firmness
	private java.util.ArrayList<berries.Berry> berries;

	// The name of this berry firmness listed in different languages
	private java.util.ArrayList<common.Name> names;

	public static BerryFirmness getById(int id) {
		String url = "https://pokeapi.co/api/v2/berry-firmness/" + id;
		String json = tools.Internet.get(url);
		BerryFirmness obj = new com.google.gson.Gson().fromJson(json, BerryFirmness.class);
		return obj;
	}

	public static BerryFirmness getByName(String name) {
		String url = "https://pokeapi.co/api/v2/berry-firmness/" + name;
		String json = tools.Internet.get(url);
		BerryFirmness obj = new com.google.gson.Gson().fromJson(json, BerryFirmness.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public BerryFirmness setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<berries.Berry> getBerries() {
		return berries;
	}

	public BerryFirmness setBerries(java.util.ArrayList<berries.Berry> berries) {
		this.berries = berries;
		return this;
	}

	public java.util.ArrayList<common.Name> getNames() {
		return names;
	}

	public BerryFirmness setNames(java.util.ArrayList<common.Name> names) {
		this.names = names;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}