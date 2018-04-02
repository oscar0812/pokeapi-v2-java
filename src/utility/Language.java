package utility;
/*
{
    "id": 1,
    "name": "ja",
    "official": true,
    "iso639": "ja",
    "iso3166": "jp",
    "names": [{
        "name": "Japanese",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }]
}
*/

public class Language extends common.NamedAPIResource {
	// The identifier for this language resource
	private int id;

	// Whether or not the games are published in this language
	private boolean official;

	// The two-letter code of the country where this language is spoken. Note that it is not unique.
	private String iso639;

	// The two-letter code of the language. Note that it is not unique.
	private String iso3166;

	// The name of this language listed in different languages
	private java.util.ArrayList<common.Name> names;

	public static Language getById(int id) {
		String url = "https://pokeapi.co/api/v2/language/" + id;
		String json = tools.Internet.get(url);
		Language obj = new com.google.gson.Gson().fromJson(json, Language.class);
		return obj;
	}

	public static Language getByName(String name) {
		String url = "https://pokeapi.co/api/v2/language/" + name;
		String json = tools.Internet.get(url);
		Language obj = new com.google.gson.Gson().fromJson(json, Language.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public Language setId(int id) {
		this.id = id;
		return this;
	}

	public boolean official() {
		return official;
	}

	public Language setOfficial(boolean official) {
		this.official = official;
		return this;
	}

	public String getIso639() {
		return iso639;
	}

	public Language setIso639(String iso639) {
		this.iso639 = iso639;
		return this;
	}

	public String getIso3166() {
		return iso3166;
	}

	public Language setIso3166(String iso3166) {
		this.iso3166 = iso3166;
		return this;
	}

	public java.util.ArrayList<common.Name> getNames() {
		return names;
	}

	public Language setNames(java.util.ArrayList<common.Name> names) {
		this.names = names;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}