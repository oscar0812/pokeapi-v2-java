package models.resource.named;

/*

{
    "id": 1,
    "name": "spicy",
    "berries": [{
        "potency": 10,
        "berry": {
            "name": "rowap",
            "url": "http://pokeapi.co/api/v2/berry/64/"
        }
    }],
    "contest_type": {
        "name": "cool",
        "url": "http://pokeapi.co/api/v2/contest-type/1/"
    },
    "names": [{
        "name": "Spicy",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }]
}

 */

import models.Name;
import models.berry.FlavorBerryMap;

import java.util.ArrayList;

public class BerryFlavor extends NamedAPIResource {
    // The identifier for this berry flavor resource
    private int id;

    // A list of the berries with this flavor
    private ArrayList<FlavorBerryMap> berries;

    // The contest type that correlates with this berry flavor
    private ContestType contest_type;

    // The name of this berry flavor listed in different languages
    private ArrayList<Name> names;

    public BerryFlavor(String url, String name, int id, ArrayList<FlavorBerryMap> berries, ContestType contest_type,
                       ArrayList<Name> names){
        this.url = url;
        this.name = name;
        this.id = id;
        this.berries = berries;
        this.contest_type = contest_type;
        this.names = names;
    }

    public int getId() {
        return id;
    }

    public ArrayList<FlavorBerryMap> getBerries() {
        return berries;
    }

    public ContestType getContestType() {
        return contest_type;
    }

    public ArrayList<Name> getNames() {
        return names;
    }
}
