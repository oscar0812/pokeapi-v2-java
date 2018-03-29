package models.move;

import models.resource.named.Move;

import java.util.ArrayList;

public class ContestComboDetail {
    // A list of moves to use before this move
    private ArrayList<Move> use_before;

    // A list of moves to use after this move
    private ArrayList<Move> use_after;

    public ContestComboDetail(ArrayList<Move> use_before, ArrayList<Move> use_after){
        this.use_before = use_before;
        this.use_after = use_after;
    }

    public ArrayList<Move> getUseBefore() {
        return use_before;
    }

    public ArrayList<Move> getUseAfter() {
        return use_after;
    }
}
