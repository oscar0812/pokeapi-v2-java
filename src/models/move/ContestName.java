package models.move;

import models.resource.named.Language;

public class ContestName {
    // The name for this contest
    private String name;

    // The color associated with this contest's name
    private String color;

    // The language that this name is in
    private Language language;

    public ContestName(String name, String color, Language language){
        this.name = name;
        this.color = color;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Language getLanguage() {
        return language;
    }
}
