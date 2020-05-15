package pokeapi.bittle.models.utility;

import pokeapi.bittle.models.resources.APIResourceList;
import pokeapi.bittle.models.utility.APIResource;

public class NamedAPIResource extends APIResource {
	// The name of the referenced resource.
	private String name;

	public String getName() {
		return name;
	}

	public NamedAPIResource setName(String name) {
		this.name = name;
		return this;
	}
}