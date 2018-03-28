package models;

import models.resource.named.Language;

public class Description {
    // The localized description for an API resource in a specific language
    private String description = "";

    // The language this name is in
    private Language language;

    public Description(String description, Language language){
        this.description = description;
        this.language = language;
    }

    public String getDescription() {
        return description;
    }

    public Language getLanguage() {
        return language;
    }
}
