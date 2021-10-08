/* Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out Bulbapedia for greater detail. */

package com.github.oscar0812.pokeapi.models.pokemon;

import com.github.oscar0812.pokeapi.models.resources.NamedAPIResourceList;
import com.github.oscar0812.pokeapi.models.utility.APIResource;
import com.github.oscar0812.pokeapi.utils.Information;
import java.util.ArrayList;

public class Characteristic extends APIResource {
	// The identifier for this resource.
	private int id;

	// The remainder of the highest stat/IV divided by 5.
	private int gene_modulo;

	// The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5.
	private int possible_values;

	public int getId() {
		return id;
	}

	public Characteristic setId(int id) {
		this.id = id;
		return this;
	}

	public int getGeneModulo() {
		return gene_modulo;
	}

	public Characteristic setGeneModulo(int gene_modulo) {
		this.gene_modulo = gene_modulo;
		return this;
	}

	public int getPossibleValues() {
		return possible_values;
	}

	public Characteristic setPossibleValues(int possible_values) {
		this.possible_values = possible_values;
		return this;
	}

	private static Characteristic get(String url) {
		Characteristic obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), Characteristic.class);
		obj.setIsFetched(true);
		return obj;
	}

	public Characteristic get() {
		return Characteristic.get(this.getUrl());
	}

	public static Characteristic getById(int id) {
		return get("https://pokeapi.co/api/v2/characteristic/" + id);
	}
}