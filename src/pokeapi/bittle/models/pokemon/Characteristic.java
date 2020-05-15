/* Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out Bulbapedia for greater detail. */

package pokeapi.bittle.models.pokemon;
/*
{
  "id": 1,
  "gene_modulo": 0,
  "possible_values": [
    0,
    5,
    10,
    15,
    20,
    25,
    30
  ],
  "highest_stat": {
    "name": "hp",
    "url": "https://pokeapi.co/api/v2/stat/1/"
  },
  "descriptions": [
    {
      "description": "Loves to eat",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ]
}
*/

import java.util.ArrayList;
import pokeapi.bittle.models.resources.APIResourceList;
import pokeapi.bittle.models.utility.APIResource;
import pokeapi.bittle.utils.Information;

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

	public static APIResourceList getList(int limit, int offset) {
		 return APIResourceList.getList("characteristic", limit, offset);
	}

	public static Characteristic getById(int id) {
		return get("https://pokeapi.co/api/v2/characteristic/" + id);
	}
}