package contests;
public class ContestName {
	// The name for this contest
	private String name;

	// The color associated with this contest's name
	private String color;

	// The language that this name is in
	private utility.Language language;

	public String getName() {
		return name;
	}

	public ContestName setName(String name) {
		this.name = name;
		return this;
	}

	public String getColor() {
		return color;
	}

	public ContestName setColor(String color) {
		this.color = color;
		return this;
	}

	public utility.Language getLanguage() {
		return language;
	}

	public ContestName setLanguage(utility.Language language) {
		this.language = language;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}