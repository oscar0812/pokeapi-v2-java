package models.berry;

import models.resource.named.Berry;

public class FlavorBerryMap {
    // How powerful the referenced flavor is for this berry
    private int potency;

    // The berry with the referenced flavor
    private Berry berry;

    public FlavorBerryMap(int potency, Berry berry){
        this.potency = potency;
        this.berry = berry;
    }

    public int getPotency() {
        return potency;
    }

    public Berry getBerry() {
        return berry;
    }
}
