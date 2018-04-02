package resource;
/*
{
    "count": 248,
    "next": "http://pokeapi.co/api/v2/ability/?limit=20&offset=20",
    "previous": null,
    "results": [{
        "name": "stench",
        "url": "http://pokeapi.co/api/v2/ability/1/"
    }]
}
*/

public class NamedAPIResourceList {
	// The total number of resources available from this API
	private int count;

	// The URL for the next page in the list
	private String next;

	// The URL for the previous page in the list
	private boolean previous;

	// A list of named API resources
	private java.util.ArrayList<common.NamedAPIResource> results;

	public static NamedAPIResourceList getByEndpoint(String endpoint) {
		String url = "https://pokeapi.co/api/v2/" + endpoint;
		String json = tools.Internet.get(url);
		NamedAPIResourceList obj = new com.google.gson.Gson().fromJson(json, NamedAPIResourceList.class);
		return obj;
	}

	public int getCount() {
		return count;
	}

	public NamedAPIResourceList setCount(int count) {
		this.count = count;
		return this;
	}

	public String getNext() {
		return next;
	}

	public NamedAPIResourceList setNext(String next) {
		this.next = next;
		return this;
	}

	public boolean previous() {
		return previous;
	}

	public NamedAPIResourceList setPrevious(boolean previous) {
		this.previous = previous;
		return this;
	}

	public java.util.ArrayList<common.NamedAPIResource> getResults() {
		return results;
	}

	public NamedAPIResourceList setResults(java.util.ArrayList<common.NamedAPIResource> results) {
		this.results = results;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}