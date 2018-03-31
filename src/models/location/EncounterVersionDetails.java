package models.location;

import models.resource.named.Version;

public class EncounterVersionDetails {
    // The chance of an encounter to occur.
    private int rate;

    // The version of the game in which the encounter can occur with the given chance.
    private Version version;

    public EncounterVersionDetails(int rate,Version version) {
        this.rate = rate;
        this.version = version;
    }

    public int getRate() {
        return rate;
    }

    public Version getVersion() {
        return version;
    }
}
