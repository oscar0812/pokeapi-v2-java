package models;


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

public class Language {
    private int id;
    private String name;
    private boolean official;
    private String iso3166;
    private ArrayList<Language> names;

    public Language(int id, String name, boolean official, String iso3166){
        this.id = id;
        this.name = name;
        this.official = official;
        this.iso3166 = iso3166;
        names = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isOfficial() {
        return official;
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
