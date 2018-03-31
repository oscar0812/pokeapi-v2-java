package models.resource.named;

/*
{
    "id": 1,
    "name": "status",
    "descriptions": [{
        "description": "ãƒ€ãƒ¡ãƒ¼ã‚¸ãªã„",
        "language": {
            "name": "ja",
            "url": "http://pokeapi.co/api/v2/language/1/"
        }
    }],
    "moves": [{
        "name": "swords-dance",
        "url": "http://pokeapi.co/api/v2/move/14/"
    }]
}
 */

import models.Description;
import models.Name;

import java.util.ArrayList;

public class MoveDamageClass extends NamedAPIResource {
    // The identifier for this move damage class resource
    private int id;

    // The description of this move damage class listed in different languages
    private ArrayList<Description> descriptions;

    // A list of moves that fall into this damage class
    private ArrayList<Move> moves;

    // The name of this move damage class listed in different languages
    private ArrayList<Name> names;

    public MoveDamageClass(String url, int id, String name, ArrayList<Description> descriptions, ArrayList<Move> moves,
                           ArrayList<Name> names) {
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
