package models.resource.named;

/*
    {
        "id": 1,
        "name": "swarm-yes",
        "condition": {
            "name": "swarm",
            "url": "http://pokeapi.co/api/v2/encounter-condition/1/"
        },
        "names": [{
            "name": "WÃ¤hrend eines Schwarms",
            "language": {
                "name": "de",
                "url": "http://pokeapi.co/api/v2/language/6/"
            }
        }]
    }

 */

import models.Name;

import java.util.ArrayList;

public class EncounterConditionValue extends NamedAPIResource {
    // The identifier for this encounter condition value resource
    private int id;

    // The condition this encounter condition value pertains to
    private EncounterCondition condition;

    // The name of this encounter condition value listed in different languages
    private ArrayList<Name> names;


    public EncounterConditionValue(String url, String name, int id, EncounterCondition condition, ArrayList<Name> names){
        this.url = url;
        this.name = name;
        this.id = id;
        this.condition = condition;
        this.names = names;
    }

    public int getId() {
        return id;
    }

    public EncounterCondition getCondition() {
        return condition;
    }

    public ArrayList<Name> getNames() {
        return names;
    }
}
