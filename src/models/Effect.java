package models;

public class Effect {
    // The localized effect text for an API resource in a specific language
    private String effect;

    // The language this effect is in
    private Language language;

    public Effect(String effect, Language language) {
        this.effect = effect;
        this.language = language;
    }

    public String getEffect() {
        return effect;
    }

    public Language getLanguage() {
        return language;
    }
}
