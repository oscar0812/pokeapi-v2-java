package models.move;

public class ContestComboSets {
    // A detail of moves this move can be used before or after, granting additional appeal points in contests
    private ContestComboDetail normal;

    // A detail of moves this move can be used before or after, granting additional appeal points in super contests
    private ContestComboDetail sup;

    public ContestComboSets(ContestComboDetail normal, ContestComboDetail sup){
        this.normal = normal;
        this.sup = sup;
    }

    public ContestComboDetail getNormal() {
        return normal;
    }

    public ContestComboDetail getSuper() {
        return sup;
    }
}
