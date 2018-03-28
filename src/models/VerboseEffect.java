package models;

import models.resource.named.Language;

public class VerboseEffect {
    // The localized effect text for an API resource in a specific language
    private String effect;

    // The localized effect text in brief
    private String short_effect;

    // The language this effect is in
    private Language language;

    public VerboseEffect(String effect, String short_effect, Language language){
        this.effect = effect;
        this.short_effect = short_effect;
        this.language = language;
    }

    public String getEffect() {
        return effect;
    }

    public String getShortEffect() {
        return short_effect;
    }

    public Language getLanguage() {
        return language;
    }
}
