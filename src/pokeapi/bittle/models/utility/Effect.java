package pokeapi.bittle.models.utility;

public class Effect {
	// The localized effect text for an API resource in a specific language.
	private String effect;

	// The language this effect is in.
	private Language language;

	public String getEffect() {
		return effect;
	}

	public Effect setEffect(String effect) {
		this.effect = effect;
		return this;
	}

	public Language getLanguage() {
		if(!language.getIsFetched()) {
			language = language.get();
		}
		return language;
	}

	public Effect setLanguage(Language language) {
		this.language = language;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}