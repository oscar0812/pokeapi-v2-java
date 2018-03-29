package models.berry;

import models.resource.named.BerryFlavor;

public class BerryFlavorMap {
    // How powerful the referenced flavor is for this berry
    private int potency;

    // The referenced berry flavor
    private BerryFlavor flavor;

    public BerryFlavorMap(int potency, BerryFlavor flavor){
        this.potency = potency;
        this.flavor = flavor;
    }

    public int getPotency() {
        return potency;
    }

    public BerryFlavor getFlavor() {
        return flavor;
    }
}
