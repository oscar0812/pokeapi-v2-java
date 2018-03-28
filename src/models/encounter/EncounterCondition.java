package models.encounter;

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

import java.util.ArrayList;

public class EncounterCondition {
    private int id;
    private ArrayList<Name> names;
    private ArrayList<EncounterConditionValue> values;

    public EncounterCondition(int id){
        this.id = id;
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

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }

    public void setValues(ArrayList<EncounterConditionValue> values) {
        this.values = values;
    }
}
