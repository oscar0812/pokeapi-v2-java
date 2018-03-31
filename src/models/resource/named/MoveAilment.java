package models.resource.named;

import models.Name;

import java.util.ArrayList;

public class MoveAilment extends NamedAPIResource {
    // The identifier for this move ailment resource
    private int id;

    // A list of moves that cause this ailment
    private ArrayList<Move> moves;

    // The name of this move ailment listed in different languages
    private ArrayList<Name> names;

    public MoveAilment(String url, int id, String name, ArrayList<Move> moves, ArrayList<Name> names) {
        this.url = url;
        this.id = id;
        this.name = name;
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

    public ArrayList<Move> getMoves() {
        return moves;
    }

    public ArrayList<Name> getNames() {
        return names;
    }
}
