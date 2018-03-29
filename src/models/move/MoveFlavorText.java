package models.move;

import models.resource.named.Language;
import models.resource.named.VersionGroup;

public class MoveFlavorText {
    // The localized flavor text for an api resource in a specific language
    private String flavor_text;

    // The language this name is in
    private Language language;

    // The version group that uses this flavor text
    private VersionGroup version_group;

    public MoveFlavorText(String flavor_text, Language language, VersionGroup version_group){
        this.flavor_text = flavor_text;
        this.language = language;
        this.version_group = version_group;
    }

    public String getFlavorText() {
        return flavor_text;
    }

    public Language getLanguage() {
        return language;
    }

    public VersionGroup getVersionGroup() {
        return version_group;
    }
}
