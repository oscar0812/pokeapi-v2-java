package models.resource.named;

import models.Description;
import models.Name;

import java.util.ArrayList;

/*
{
    "id": 1,
    "name": "specific-move",
    "descriptions": [{
        "description": "Eine spezifische Fähigkeit. Wie diese Fähigkeit genutzt wird, hängt von den genutzten Fähigkeiten ab.",
        "language": {
            "name": "de",
            "url": "http://pokeapi.co/api/v2/language/6/"
        }
    }],
    "moves": [{
        "name": "counter",
        "url": "http://pokeapi.co/api/v2/move/68/"
    }],
    "names": [{
        "name": "Spezifische Fähigkeit",
        "language": {
            "name": "de",
            "url": "http://pokeapi.co/api/v2/language/6/"
        }
    }]
}
 */

public class MoveTarget extends NamedAPIResource {
    // The identifier for this move target resource
    private int id;

    // The description of this move target listed in different languages
    private ArrayList<Description> descriptions;

    // A list of moves that that are directed at this target
    private ArrayList<Move> moves;

    // The name of this move target listed in different languages
    private ArrayList<Name> names;

    public MoveTarget(String url, int id, String name, ArrayList<Description> descriptions, ArrayList<Move> moves, ArrayList<Name> names) {
        this.url = url;
        this.id = id;
        this.name = name;
        this.descriptions = descriptions;
        this.moves = moves;
        this.names = names;
    }

    public String getUrl() {
        return url;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Description> getDescriptions() {
        return descriptions;
    }

    public ArrayList<Move> getMoves() {
        return moves;
    }

    public ArrayList<Name> getNames() {
        return names;
    }
}
