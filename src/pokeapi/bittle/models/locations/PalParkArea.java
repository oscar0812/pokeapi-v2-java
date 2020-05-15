/* Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park. */

package pokeapi.bittle.models.locations;
/*
{
  "id": 1,
  "name": "forest",
  "names": [
    {
      "name": "Forest",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "pokemon_encounters": [
    {
      "base_score": 30,
      "rate": 50,
      "pokemon_species": {
        "name": "caterpie",
        "url": "https://pokeapi.co/api/v2/pokemon-species/10/"
      }
    }
  ]
}
*/

import java.util.ArrayList;
import pokeapi.bittle.models.resources.NamedAPIResourceList;
import pokeapi.bittle.models.utility.Name;
import pokeapi.bittle.models.utility.NamedAPIResource;
import pokeapi.bittle.utils.Information;

public class PalParkArea extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	// A list of Pokémon encountered in thi pal park area along with details.
	private ArrayList<PalParkEncounterSpecies> pokemon_encounters;

	public int getId() {
		return id;
	}

	public PalParkArea setId(int id) {
		this.id = id;
		return this;
	}

	public ArrayList<Name> getNames() {
		return names;
	}

	public PalParkArea setNames(ArrayList<Name> names) {
		this.names = names;
		return this;
	}

	public ArrayList<PalParkEncounterSpecies> getPokemonEncounters() {
		return pokemon_encounters;
	}

	public PalParkArea setPokemonEncounters(ArrayList<PalParkEncounterSpecies> pokemon_encounters) {
		this.pokemon_encounters = pokemon_encounters;
		return this;
	}

	private static PalParkArea get(String url) {
		PalParkArea obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), PalParkArea.class);
		obj.setIsFetched(true);
		return obj;
	}

	public PalParkArea get() {
		return PalParkArea.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("pal-park-area", limit, offset);
	}

	public static PalParkArea getById(int id) {
		return get("https://pokeapi.co/api/v2/pal-park-area/" + id);
	}

	public static PalParkArea getByName(String name) {
		return get("https://pokeapi.co/api/v2/pal-park-area/" + name);
	}
}