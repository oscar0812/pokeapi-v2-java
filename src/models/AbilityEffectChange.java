package models;

import models.resource.named.VersionGroup;

public class AbilityEffectChange {

    // The previous effect of this ability listed in different languages
    private Effect effect_entries;

    // The version group in which the previous effect of this ability originated
    private VersionGroup version_group;

    public AbilityEffectChange(Effect effect_entries, VersionGroup version_group){
        this.effect_entries = effect_entries;
        this.version_group = version_group;
    }

    public Effect getEffectEntries() {
        return effect_entries;
    }

    public VersionGroup getVersionGroup() {
        return version_group;
    }
}
