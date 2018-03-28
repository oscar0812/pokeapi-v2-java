package models.resource.named;


/*

    example json:

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

import java.util.ArrayList;

public class Language extends NamedAPIResource {
    // The identifier for this language resource
    private int id;

    // Whether or not the games are published in this language
    private boolean official;

    // The two-letter code of the country where this language is spoken. Note that it is not unique.
    private String iso639;

    // The two-letter code of the language. Note that it is not unique.
    private String iso3166;

    // The name of this language listed in different languages
    private ArrayList<Language> names;

    public Language(String url, int id, String name, boolean official, String iso639, String iso3166) {
        this.id = id;
        this.url = url;
        this.name = name;
        this.official = official;
        this.iso639 = iso639;
        this.iso3166 = iso3166;
        names = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public boolean isOfficial() {
        return official;
    }

    public String getIso639() {
        return iso639;
    }

    public String getIso3166() {
        return iso3166;
    }

    public ArrayList<Language> getNames() {
        return names;
    }

    public void setNames(ArrayList<Language> names) {
        this.names = names;
    }
}
