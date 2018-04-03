package models.common;
public class VerboseEffect {
	// The localized effect text for an API resource in a specific language
	private String effect;

	// The localized effect text in brief
	private String short_effect;

	// The language this effect is in
	private models.utility.Language language;

	public String getEffect() {
		return effect;
	}

	public VerboseEffect setEffect(String effect) {
		this.effect = effect;
		return this;
	}

	public String getShortEffect() {
		return short_effect;
	}

	public VerboseEffect setShortEffect(String short_effect) {
		this.short_effect = short_effect;
		return this;
	}

	public models.utility.Language getLanguage() {
		return language;
	}

	public VerboseEffect setLanguage(models.utility.Language language) {
		this.language = language;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}