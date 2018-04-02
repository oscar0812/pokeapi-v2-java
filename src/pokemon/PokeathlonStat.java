package pokemon;
/*
{
    "id": 1,
    "name": "speed",
    "affecting_natures": {
        "increase": [{
            "max_change": 2,
            "nature": {
                "name": "timid",
                "url": "http://pokeapi.co/api/v2/nature/5/"
            }
        }],
        "decrease": [{
            "max_change": -1,
            "nature": {
                "name": "hardy",
                "url": "http://pokeapi.co/api/v2/nature/1/"
            }
        }]
    },
    "names": [{
        "name": "Speed",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }]
}
*/

public class PokeathlonStat extends common.NamedAPIResource {
	// The identifier for this Pokéathlon stat resource
	private int id;

	// The name of this Pokéathlon stat listed in different languages
	private java.util.ArrayList<common.Name> names;

	// A detail of natures which affect this Pokéathlon stat positively or negatively
	private pokemon.NaturePokeathlonStatAffectSets affecting_natures;

	public static PokeathlonStat getById(int id) {
		String url = "https://pokeapi.co/api/v2/pokeathlon-stat/" + id;
		String json = tools.Internet.get(url);
		PokeathlonStat obj = new com.google.gson.Gson().fromJson(json, PokeathlonStat.class);
		return obj;
	}

	public static PokeathlonStat getByName(String name) {
		String url = "https://pokeapi.co/api/v2/pokeathlon-stat/" + name;
		String json = tools.Internet.get(url);
		PokeathlonStat obj = new com.google.gson.Gson().fromJson(json, PokeathlonStat.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public PokeathlonStat setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<common.Name> getNames() {
		return names;
	}

	public PokeathlonStat setNames(java.util.ArrayList<common.Name> names) {
		this.names = names;
		return this;
	}

	public pokemon.NaturePokeathlonStatAffectSets getAffectingNatures() {
		return affecting_natures;
	}

	public PokeathlonStat setAffectingNatures(pokemon.NaturePokeathlonStatAffectSets affecting_natures) {
		this.affecting_natures = affecting_natures;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}