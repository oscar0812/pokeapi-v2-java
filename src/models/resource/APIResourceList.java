package models.resource;
/*
{
    "count": 365,
    "next": "http://pokeapi.co/api/v2/evolution-chain/?limit=20&offset=20",
    "previous": null,
    "results": [{
        "url": "http://pokeapi.co/api/v2/evolution-chain/1/"
    }]
}
*/

public class APIResourceList {
	// The total number of resources available from this API
	private int count;

	// The URL for the next page in the list
	private String next;

	// The URL for the previous page in the list
	private boolean previous;

	// A list of unnamed API resources
	private java.util.ArrayList<models.common.APIResource> results;

	private static APIResourceList get(String url) {
		String json = api.Information.fromInternet(url);
		APIResourceList obj = new com.google.gson.Gson().fromJson(json, APIResourceList.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static APIResourceList getByEndpoint(String endpoint) {
		return get("https://pokeapi.co/api/v2/" + endpoint);
	}

	public int getCount() {
		return count;
	}

	public APIResourceList setCount(int count) {
		this.count = count;
		return this;
	}

	public String getNext() {
		return next;
	}

	public APIResourceList setNext(String next) {
		this.next = next;
		return this;
	}

	public boolean previous() {
		return previous;
	}

	public APIResourceList setPrevious(boolean previous) {
		this.previous = previous;
		return this;
	}

	public java.util.ArrayList<models.common.APIResource> getResults() {
		return results;
	}

	public APIResourceList setResults(java.util.ArrayList<models.common.APIResource> results) {
		this.results = results;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}