package com.github.oscar0812.pokeapi.models.utility;

import com.github.oscar0812.pokeapi.models.resources.NamedAPIResourceList;
import com.github.oscar0812.pokeapi.models.utility.APIResource;

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