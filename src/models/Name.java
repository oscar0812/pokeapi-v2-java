package models;

import models.resource.named.Language;

public class Name {
    // The localized name for an API resource in a specific language
    private String name;

    // The language this name is in
    private Language language;

    public Name(String name, Language language){
        this.name = name;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public Language getLanguage() {
        return language;
    }
}
