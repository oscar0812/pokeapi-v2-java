package models;

import models.resource.named.Language;
import models.resource.named.VersionGroup;

public class VersionGroupFlavorText {
    // The localized name for an API resource in a specific language
    private String text;

    // The language this name is in
    private Language language;

    // The version group which uses this flavor text
    private VersionGroup version_group;

    public VersionGroupFlavorText(String text, Language language, VersionGroup version_group){
        this.text = text;
        this.language = language;
        this.version_group = version_group;
    }

    public String getText() {
        return text;
    }

    public Language getLanguage() {
        return language;
    }

    public VersionGroup getVersionGroup() {
        return version_group;
    }
}
