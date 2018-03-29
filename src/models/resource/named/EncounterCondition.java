package models.resource.named;

/*

    example JSON:

    {
        "id": 1,
        "name": "swarm",
        "values": [{
            "name": "swarm-yes",
            "url": "http://pokeapi.co/api/v2/encounter-condition-value/1/"
        }, {
            "name": "swarm-no",
            "url": "http://pokeapi.co/api/v2/encounter-condition-value/2/"
        }],
        "names": [{
            "name": "Schwarm",
            "language": {
                "name": "de",
                "url": "http://pokeapi.co/api/v2/language/6/"
            }
        }]
    }

 */

import models.Name;
import models.resource.named.EncounterConditionValue;

import java.util.ArrayList;

public class EncounterCondition extends NamedAPIResource{
    private int id;
    private ArrayList<Name> names;
    private ArrayList<EncounterConditionValue> values;

    public EncounterCondition(String url, String name, int id, ArrayList<Name> names,
                              ArrayList<EncounterConditionValue> values){
        this.url = url;
        this.name = name;
        this.id = id;
        this.names=  names;
        this.values = values;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ArrayList<EncounterConditionValue> getValues() {
        return values;
    }

}