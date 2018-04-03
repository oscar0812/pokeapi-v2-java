package models.common;
public class NamedAPIResource {
	// The name of the referenced resource
	private String name;

	// The URL of the referenced resource
	private String url;

	public String getName() {
		return name;
	}

	public NamedAPIResource setName(String name) {
		this.name = name;
		return this;
	}

	public String getUrl() {
		return url;
	}

	public NamedAPIResource setUrl(String url) {
		this.url = url;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}