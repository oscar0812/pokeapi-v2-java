package com.bittle.pokeapi.models.utility;

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