package models.pokemon;
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

public class PokeathlonStat extends models.common.NamedAPIResource {
	// The identifier for this Pokéathlon stat models.resource
	private int id;

	// The name of this Pokéathlon stat listed in different languages
	private java.util.ArrayList<models.common.Name> names;

	// A detail of natures which affect this Pokéathlon stat positively or negatively
	private models.pokemon.NaturePokeathlonStatAffectSets affecting_natures;

	private static PokeathlonStat get(String url) {
		String json = api.Information.fromInternet(url);
		PokeathlonStat obj = new com.google.gson.Gson().fromJson(json, PokeathlonStat.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static PokeathlonStat getById(int id) {
		return get("https://pokeapi.co/api/v2/pokeathlon-stat/" + id);
	}

	public static PokeathlonStat getByName(String name) {
		return get("https://pokeapi.co/api/v2/pokeathlon-stat/" + name);
	}

	public int getId() {
		return id;
	}

	public PokeathlonStat setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getNames() {
		return names;
	}

	public PokeathlonStat setNames(java.util.ArrayList<models.common.Name> names) {
		this.names = names;
		return this;
	}

	public models.pokemon.NaturePokeathlonStatAffectSets getAffectingNatures() {
		return affecting_natures;
	}

	public PokeathlonStat setAffectingNatures(models.pokemon.NaturePokeathlonStatAffectSets affecting_natures) {
		this.affecting_natures = affecting_natures;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}