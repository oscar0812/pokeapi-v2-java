package pokeapi.bittle.models.resources;
/*
{
  "count": 365,
  "next": "https://pokeapi.co/api/v2/evolution-chain/?limit=20&offset=20",
  "previous": null,
  "results": [
    {
      "url": "https://pokeapi.co/api/v2/evolution-chain/1/"
    }
  ]
}
*/

import java.util.ArrayList;
import pokeapi.bittle.models.utility.APIResource;
import pokeapi.bittle.utils.Information;

public class APIResourceList {
	// The total number of resources available from this API.
	private int count;

	// The URL for the next page in the list.
	private String next;

	// The URL for the previous page in the list.
	private boolean previous;

	// A list of un-named API resources.
	private ArrayList<APIResource> results;

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

	public boolean getPrevious() {
		return previous;
	}

	public APIResourceList setPrevious(boolean previous) {
		this.previous = previous;
		return this;
	}

	public ArrayList<APIResource> getResults() {
		return results;
	}

	public APIResourceList setResults(ArrayList<APIResource> results) {
		this.results = results;
		return this;
	}

	private static APIResourceList get(String url) {
		return new com.google.gson.Gson().fromJson(Information.fromInternet(url), APIResourceList.class);
	}

	public static APIResourceList getList(String endpoint, int limit, int offset) {
		String json = Information.fromInternet("https://pokeapi.co/api/v2/" + endpoint + "/?limit=" + Math.abs(limit) + "&offset=" + Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, APIResourceList.class);
	}

	public static APIResourceList getByEndpoint(String endpoint) {
		return get("https://pokeapi.co/api/v2/" + endpoint);
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}