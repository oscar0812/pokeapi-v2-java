package models.resource.named;

/*
{
    "id": 1,
    "name": "cool",
    "berry_flavor": {
        "name": "spicy",
        "url": "http://pokeapi.co/api/v2/berry-flavor/1/"
    },
    "names": [{
        "name": "Cool",
        "color": "Red",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }]
}

 */

import models.contest.ContestName;

import java.util.ArrayList;

public class ContestType extends NamedAPIResource {
    // The identifier for this contest type resource
    private int id;

    // The berry flavor that correlates with this contest type
    private BerryFlavor berryFlavor;

    // The name of this contest type listed in different languages
    private ArrayList<ContestName> names;

    public ContestType(String url, String name, int id, BerryFlavor berryFlavor, ArrayList<ContestName> names){
        this.url = url;
        this.name = name;
        this.id = id;
        this.berryFlavor = berryFlavor;
        this.names = names;
    }

    public int getId() {
        return id;
    }

    public BerryFlavor getBerryFlavor() {
        return berryFlavor;
    }

    public ArrayList<ContestName> getNames() {
        return names;
    }
}
