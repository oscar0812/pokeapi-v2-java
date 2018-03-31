package models.move;

import models.Description;
import models.resource.named.Move;

import java.util.ArrayList;

public class Category {
    // The identifier for this move category resource
    private int id;

    // The name for this move category resource
    private String name;

    // A list of moves that fall into this category
    private ArrayList<Move> moves;

    // The description of this move ailment listed in different languages
    private ArrayList<Description> descriptions;

    public Category(int id, String name, ArrayList<Move> moves, ArrayList<Description> descriptions) {
        this.id = id;
        this.name = name;
        this.moves = moves;
        this.descriptions = descriptions;
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

    public ArrayList<Description> getDescriptions() {
        return descriptions;
    }
}