package models.resource.named;

import models.Name;

import java.util.ArrayList;

/*
    example JSON:

    {
        "id": 1,
        "name": "walk",
        "order": 1,
        "names": [{
            "name": "Walking in tall grass or a cave",
            "language": {
                "name": "en",
                "url": "http://pokeapi.co/api/v2/language/9/"
            }
        }]
    }

 */

public class EncounterMethod extends NamedAPIResource{
    // The identifier for this encounter method resource
    private int id;

    // A good value for sorting
    private int order;

    // The name of this encounter method listed in different languages
    private ArrayList<Name> names;

    public EncounterMethod(String url, String name, int id, int order, ArrayList<Name> names){
        this.url = url;
        this.name = name;
        this.id = id;
        this.order = order;
        this.names = names;
    }

    public int getId() {
        return id;
    }

    public int getOrder() {
        return order;
    }

    public ArrayList<Name> getNames() {
        return names;
    }
}
