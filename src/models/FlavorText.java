package models;

import models.resource.named.Language;

public class FlavorText {
    // The localized flavor text for an API resource in a specific language
    private String flavor_text;

    // The language this name is in
    private Language language;

    public FlavorText(String flavor_text, Language language){
        this.flavor_text = flavor_text;
        this.language = language;
    }

    public String getFlavorText() {
        return flavor_text;
    }

    public Language getLanguage() {
        return language;
    }
}
