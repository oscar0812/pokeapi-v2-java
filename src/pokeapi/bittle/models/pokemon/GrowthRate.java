/* Growth rates are the speed with which Pokémon gain levels through experience. Check out Bulbapedia for greater detail. */

package pokeapi.bittle.models.pokemon;
/*
{
  "id": 1,
  "name": "slow",
  "formula": "\\frac{5x^3}{4}",
  "descriptions": [
    {
      "description": "langsam",
      "language": {
        "name": "de",
        "url": "https://pokeapi.co/api/v2/language/6/"
      }
    }
  ],
  "levels": [
    {
      "level": 100,
      "experience": 1250000
    }
  ],
  "pokemon_species": [
    {
      "name": "growlithe",
      "url": "https://pokeapi.co/api/v2/pokemon-species/58/"
    }
  ]
}
*/

import java.util.ArrayList;
import pokeapi.bittle.models.resources.NamedAPIResourceList;
import pokeapi.bittle.models.utility.Description;
import pokeapi.bittle.models.utility.NamedAPIResource;
import pokeapi.bittle.utils.Information;

public class GrowthRate extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The formula used to calculate the rate at which the Pokémon species gains level.
	private String formula;

	// The descriptions of this characteristic listed in different languages.
	private ArrayList<Description> descriptions;

	// A list of levels and the amount of experienced needed to atain them based on this growth rate.
	private ArrayList<GrowthRateExperienceLevel> levels;

	// A list of Pokémon species that gain levels at this growth rate.
	private ArrayList<PokemonSpecies> pokemon_species;

	public int getId() {
		return id;
	}

	public GrowthRate setId(int id) {
		this.id = id;
		return this;
	}

	public String getFormula() {
		return formula;
	}

	public GrowthRate setFormula(String formula) {
		this.formula = formula;
		return this;
	}

	public ArrayList<Description> getDescriptions() {
		return descriptions;
	}

	public GrowthRate setDescriptions(ArrayList<Description> descriptions) {
		this.descriptions = descriptions;
		return this;
	}

	public ArrayList<GrowthRateExperienceLevel> getLevels() {
		return levels;
	}

	public GrowthRate setLevels(ArrayList<GrowthRateExperienceLevel> levels) {
		this.levels = levels;
		return this;
	}

	public ArrayList<PokemonSpecies> getPokemonSpecies() {
		return pokemon_species;
	}

	public GrowthRate setPokemonSpecies(ArrayList<PokemonSpecies> pokemon_species) {
		this.pokemon_species = pokemon_species;
		return this;
	}

	private static GrowthRate get(String url) {
		GrowthRate obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), GrowthRate.class);
		obj.setIsFetched(true);
		return obj;
	}

	public GrowthRate get() {
		return GrowthRate.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("growth-rate", limit, offset);
	}

	public static GrowthRate getById(int id) {
		return get("https://pokeapi.co/api/v2/growth-rate/" + id);
	}

	public static GrowthRate getByName(String name) {
		return get("https://pokeapi.co/api/v2/growth-rate/" + name);
	}
}