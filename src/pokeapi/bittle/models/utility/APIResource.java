package pokeapi.bittle.models.utility;

public class APIResource {
	// The URL of the referenced resource.
	private String url;

	// Check if this object has already been fetched from the API
	private boolean is_fetched;

	public String getUrl() {
		return url;
	}

	public APIResource setUrl(String url) {
		this.url = url;
		return this;
	}

	public boolean getIsFetched() {
		return is_fetched;
	}

	public APIResource setIsFetched(boolean is_fetched) {
		this.is_fetched = is_fetched;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}