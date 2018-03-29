package models.move;

import models.resource.named.Stat;

public class MoveStatChange {
    // The amount of change
    private int change;

    // The stat being affected
    private Stat stat;

    public MoveStatChange(int change, Stat stat){
        this.change = change;
        this.stat = stat;
    }

    public int getChange() {
        return change;
    }

    public Stat getStat() {
        return stat;
    }
}
