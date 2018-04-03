package models.common;
public class APIResource {
	// The URL of the referenced resource
	private String url;

	public String getUrl() {
		return url;
	}

	public APIResource setUrl(String url) {
		this.url = url;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}