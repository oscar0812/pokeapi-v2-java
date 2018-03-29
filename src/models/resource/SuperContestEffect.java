package models.resource;

/*
{
    "id": 1,
    "appeal": 2,
    "flavor_text_entries": [{
        "flavor_text": "Enables the user to perform first in the next turn.",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }],
    "moves": [{
        "name": "agility",
        "url": "http://pokeapi.co/api/v2/move/97/"
    }]
}

 */

import models.FlavorText;
import models.resource.named.Move;

import java.util.ArrayList;

public class SuperContestEffect extends APIResource {
    // The identifier for this super contest effect resource
    private int id;

    // The level of appeal this super contest effect has
    private int appeal;

    // The flavor text of this super contest effect listed in different languages
    private ArrayList<FlavorText> flavor_text_entries;

    // A list of moves that have the effect when used in super contests
    private ArrayList<Move> moves;

    public SuperContestEffect(String url, int id, int appeal, ArrayList<FlavorText> flavor_text_entries,
                              ArrayList<Move> moves){
        this.url = url;
        this.id = id;
        this.appeal = appeal;
        this.flavor_text_entries = flavor_text_entries;
        this.moves = moves;
    }

    public int getId() {
        return id;
    }

    public int getAppeal() {
        return appeal;
    }

    public ArrayList<FlavorText> getFlavorTextEntries() {
        return flavor_text_entries;
    }

    public ArrayList<Move> getMoves() {
        return moves;
    }
}
